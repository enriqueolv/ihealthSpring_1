package ihealth.model;

public class Gestor_ver_directorio_instalaciones {
	
	public String getItems() {
		String HTML_component = "";
		
		HTML_component = HTML_component + "<div class=\"container\">\r\n" + 
				"        <h2>Hospitales</h2>\r\n" + 
				"        <table class=\"table table-bordered\">\r\n";
		
		
		
		for(int i=0; i<2; i++) {
				HTML_component = HTML_component + "<tr>\r\n" + 
						"                <td colspan=\"2\" style=\"background-color: cadetblue\"><a href=\"http://data.salud.cdmx.gob.mx/portal/index.php/um-sedesa/110-hospital-materno-infantil-dr-nicolas-m-cedillo-soriano\" target=\"_blank\" class=\"list-group-item list-group-item-action\" >Hospital Materno Infantil</a>\r\n" + 
						"                </td>\r\n" + 
						"            </tr>\r\n" + 
						"            <tr>\r\n" + 
						"                <td class=\"col-sm-3 col-md-6\" >\r\n" + 
						"                    <p></p>\r\n" + 
						"                    <p>Brindar servicios de salud con calidad, eficiencia, oportunidad y seguridad a \r\n" + 
						"                        enfermos que presentan padecimientos que se encuentran \r\n" + 
						"                        en la cartera de servicios del Hospital, y ofrecer trato \r\n" + 
						"                        amable y humanitario a ellos y a sus familiares, vinculando \r\n" + 
						"                        la atención con la formación de recursos humanos. Desarrollar \r\n" + 
						"                        investigación relacionada con el proceso de atención médica proporcionado \r\n" + 
						"                        por el Hospital, que sirva para mejorar el cuidado a los pacientes.\r\n" + 
						"                    </p>\r\n" + 
						"                </td>\r\n" + 
						"                <td><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3761.0116531591825!2d-99.20559878545193!3d19.498134443635145!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x85d20297abfc3979%3A0xc9cbcd8a6f1be50f!2sHospital%20Materno%20Infantil%20Dr.%20Nicolas%20M.%20Cedillo%20Soriano!5e0!3m2!1ses-419!2smx!4v1581955266121!5m2!1ses-419!2smx\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></td>\r\n" + 
						"            </tr>";
		}
		
		
		
		HTML_component = HTML_component + "</table>\r\n" + 
				"    </div>";
		
		return HTML_component;
	}
}
