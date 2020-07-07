package ihealth.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
