package ihealth.model;

import ihealth.services.Proxy_BD;
import java.util.ArrayList;
import java.util.Iterator;

import ihealth.model.instalaciones.Hospital;

public class Gestor_ver_directorio_instalaciones {
	
	public String getItems() {
		Proxy_BD proxy = new Proxy_BD();
		ArrayList<Hospital> hospitales = proxy.getInfoHospitales();
		Iterator iter_hospitales = hospitales.iterator();
		Hospital hospital_actual;
		
		String HTML_component = "";
		HTML_component = HTML_component + "<div class=\"container\">\r\n" + 
				"        <h2>Hospitales</h2>\r\n" + 
				"        <table class=\"table table-bordered\">\r\n";
		
		
		
		while(iter_hospitales.hasNext()) {
				hospital_actual = (Hospital)iter_hospitales.next();
				
				HTML_component = HTML_component + "<tr>\r\n" + 
						"                <td colspan=\"2\" style=\"background-color: cadetblue\"><a href=\"http://data.salud.cdmx.gob.mx/portal/index.php/um-sedesa/110-hospital-materno-infantil-dr-nicolas-m-cedillo-soriano\" target=\"_blank\" class=\"list-group-item list-group-item-action\" >" +  hospital_actual.getNombre() + "</a>\r\n" + 
						"                </td>\r\n" + 
						"            </tr>\r\n" + 
						"            <tr>\r\n" + 
						"                <td class=\"col-sm-3 col-md-6\" >\r\n" + 
						"                    <p></p>\r\n" + 
						"                    <p>" + hospital_actual.getDescripcion() + 
						"                    </p>\r\n" + 
						"                </td>\r\n" + 
						"                <td><iframe src=\""  +hospital_actual.getUbicacion() + "\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></td>\r\n" + 
						"            </tr>";
		}
		
		
		
		HTML_component = HTML_component + "</table>\r\n" + 
				"    </div>";
		
		return HTML_component;
	}
}
