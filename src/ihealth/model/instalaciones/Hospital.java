package ihealth.model.instalaciones;

public class Hospital {

	 private String idCentroDeTrabajo;
	    private String ubicacion;
	    private String nombre;
	    private String descripcion;
	    //private ArrayList <Laboratorio> laboratorios;
	    //private ArrayList <CentroDeAltaEspecialidad> centrosAltaEspecialidad;
	    
	    public Hospital(){
	    	this.ubicacion = "";
	    	this.nombre = "";
	    	this.descripcion = "";
	        //laboratorios = new ArrayList<Laboratorio> ();
	        //centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
	    }
	    
	    public Hospital(String idCentroDeTrabajo, String ubicacion, String nombre, String descripcion){
	        //laboratorios = new ArrayList<Laboratorio> ();
	        //centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
	        this.idCentroDeTrabajo = idCentroDeTrabajo;
	        this.ubicacion = ubicacion;
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	    }
	    
	   

	    public String getIdCentroDeTrabajo() {
	        return idCentroDeTrabajo;
	    }

	    public void setIdCentroDeTrabajo(String idCentroDeTrabajo) {
	        this.idCentroDeTrabajo = idCentroDeTrabajo;
	    }

	    public String getUbicacion() {
	        return ubicacion;
	    }

	    public void setUbicacion(String ubicacion) {
	        this.ubicacion = ubicacion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public String getDescripcion(){
	        return this.descripcion;
	    }
	    
	    public void setDescripcion(String descripcion){
	        this.descripcion = descripcion;
	    }
	    
}
