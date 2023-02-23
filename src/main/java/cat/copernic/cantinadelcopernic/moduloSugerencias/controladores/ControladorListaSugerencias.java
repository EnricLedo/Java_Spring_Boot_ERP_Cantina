/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.cantinadelcopernic.moduloSugerencias.controladores;




import cat.copernic.cantinadelcopernic.modelo.Sugerencia;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author andre
 */
@Controller
public class ControladorListaSugerencias {
    @GetMapping("/listaSuggeriments")
    public String inici(Model model){
        
        var sugerencia = new Sugerencia();
        sugerencia.setTitulo("titulo");
        sugerencia.setDescripcion("Descripción");
      
        var sugerencia2 = new Sugerencia();
        sugerencia2.setTitulo("titulo2");
        sugerencia2.setDescripcion("Descripción");
        
        var sugerencias = new ArrayList<Sugerencia>();
        
        sugerencias.add(sugerencia);
        sugerencias.add(sugerencia2);
        
        model.addAttribute("sugerencias", sugerencias);
        return "/paginasSugerencias/listaSugerencias"; 
    }
}
