/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author Enric
 */
@Data
public class Deuda {
    
    
    
    private int idDeuda;
    
    private Date fechaDeLaDeuda;
    
    private float cantidad;
    
    private String correo; //El id del usuario

}



/*
@Data
@Entity
@Table(name = "deuda")
public class Deuda {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddeuda")
    private int idDeuda;
    
    @Column(name = "fecha")
    private Date fechaDeLaDeuda;
    
    @Column(name = "cantidad")
    private float cantidad;
    
    @Column(name = "usuarios_correo")
    private String correo; //El id del usuario

}
*/
