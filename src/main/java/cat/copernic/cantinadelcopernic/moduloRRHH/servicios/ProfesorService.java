/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.moduloRRHH.servicios;

import cat.copernic.cantinadelcopernic.DAO.ProfesorDAO;
import cat.copernic.cantinadelcopernic.modelo.Profesor;
import cat.copernic.cantinadelcopernic.modelo.Sugerencia;
import cat.copernic.cantinadelcopernic.moduloSugerencias.servicios.SugerenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author andre
 */
@Service 
/**
 * Clase que representa la capa de servicio para el modelo de Profesor
 */
public class ProfesorService  implements ProfesorServiceInterface {
    
    @Autowired
    private ProfesorDAO profesorDAO;
    
    
    
    @Override
    @Transactional(readOnly=true) 
    /**
     * metodo que recupera una lista de todos los profesores de la base de datos
     * @return lista de sugerencias
     */
    public List<Profesor> listarProfesores() {
       
        return (List<Profesor>) profesorDAO.findAll(); 
    }

    @Override
    @Transactional
    /**
     * metodo que se utiliza para añadir y ediar profesores de la base de datos
     * @param profesor
     */
    public void anadirProfesores(Profesor profesor) {
       
        this.profesorDAO.save(profesor); 
    }

    @Override
    @Transactional
    /**
     * metodo que elimina un profesor de la base de datos
     * @param profesor
     */
    public void eliminarProfesores(Profesor profesor) {
        
        this.profesorDAO.delete(profesor);
    }

    @Override
    @Transactional(readOnly=true)
    /**
     * metodo que busca un profesor en la base de datos
     * @param profesor
     * @return el profesor encontrado 
     */
    public Profesor buscarProfesores(Profesor profesor) {
        
       return this.profesorDAO.findById(profesor.getCorreo()).orElse(null);
    }
    
}
