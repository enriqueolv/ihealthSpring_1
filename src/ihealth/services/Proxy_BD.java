package ihealth.services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ihealth.model.instalaciones.Hospital;

public class Proxy_BD {
	private static Connection conexion;
	private static String usuario = "root";
    private static String contraseniaBD = "";
    private static String url = "jdbc:mysql://localhost/ihealth"; 
    
    private void conectar(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             conexion =  DriverManager.getConnection(url, usuario, contraseniaBD);
         }catch(ClassNotFoundException e){
             System.out.println("No se encontro la Driver clase de java");
             e.printStackTrace();
         }catch(SQLException e){
             System.out.println("Error sql a nivel de la conexion");
             e.printStackTrace();
         }
    }
    
     private void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Proxy_BD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al desconectar");
        }
        
    }
     
     
     public ArrayList<Hospital> getInfoHospitales(){
         
         //Regresa la informacion de todos los hospitales omitiendo los
         //laboratorios y centros de alta especialidad
         ArrayList<Hospital> listaHospitales = new ArrayList<>();
         conectar();
         
         ResultSet result = null;
         PreparedStatement statement = null;
         
         
         try{
             String statementText = "SELECT * FROM `ihealth`.`hospitales`;" ;
             statement = conexion.prepareStatement(statementText);
             result = statement.executeQuery();
                    
             
             while(result.next()){
                 String idCentroDeTrabajo = result.getString(1);
                 String ubicacion = result.getString(2);
                 String nombre = result.getString(3);
                 String descripcion = result.getString(4);
                 
                 listaHospitales.add(new Hospital(idCentroDeTrabajo, ubicacion, nombre, descripcion));
             }

             return listaHospitales;
         }catch (SQLException e){
             System.out.println("Error al realizar la consulta en getInfoHospitales");
             e.printStackTrace();
         }
         
         
         
         desconectar();
         return listaHospitales;
     }
    
    
}
