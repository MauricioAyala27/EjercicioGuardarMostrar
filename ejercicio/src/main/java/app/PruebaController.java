package app;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.DaoPersona;
import com.entity.Persona;
@Controller
public class PruebaController {

	 @RequestMapping(value= "/", method= RequestMethod.GET)
	    public String handler(Model model) {
		 model.addAttribute("nombre","Pepe");
	
	        return "index";
	    }
	 
	 @RequestMapping("/insert")
	 public String insert(@RequestParam(value="nombre")String nombre,@RequestParam(value="apellido")String apellido,
			 @RequestParam(value="genero")String genero,@RequestParam(value="email")String email) {
		 

			 Persona per = new Persona();
			 DaoPersona daoPer = new DaoPersona();
			 per.setNombre(nombre);
			 per.setApellido(apellido);
			 per.setGenero(genero);
			 per.setEmail(email);
			 daoPer.guardarPersona(per);
			 
			 return "index";	 
	 }
	 
	 @RequestMapping("/listar")
	 public String VerLista(Model mv)
	 {
		 DaoPersona daoPer = new DaoPersona();
		 List<Persona>personas = daoPer.listarPersona();
		 
		
		 mv.addAttribute("list",personas);
		 
		 return "tabla";
		 
	 }
	 

	 
}
