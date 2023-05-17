package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cami Rendon
 */
public class ConexionMySql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn  = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionariosbd","root","");
            System.out.println("Conexión exitosa a MySQL.");

        } catch (Exception e) {
            System.out.println("Error de Conexion");

        }
        return cn;


    } 
    
}
