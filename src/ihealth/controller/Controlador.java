package ihealth.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ihealth.model.Gestor_ver_directorio_instalaciones;

@Controller
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {
		return "index";
	}
	
	@RequestMapping("/ir_login")
	public String ir_login(){
		return "login";
	}
	
	@RequestMapping("/ir_home")
	public String ir_home(){
		return "index";
	}
	
	@RequestMapping("/ir_dir_instalaciones")
	public String ir_dir_instalaciones(Model modelo){
		
		Gestor_ver_directorio_instalaciones gestor = new Gestor_ver_directorio_instalaciones();
		
		modelo.addAttribute("items_instalaciones", gestor.getItems());
		
		return "dir_instalaciones";
	}
}
