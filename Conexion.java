/**
 *
 * @author  korn
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion{
    
    
    Connection conn = null;
    
    Statement stat = null;
    
    ResultSet results = null;
    
    
    // A DONDE SE CONECTA
    String sitioBase = "PuntoVenta";
    
    //CONSTRUCTOR
    public Conexion() {
        try {
        
            String drivers = "sun.jdbc.odbc.JdbcOdbcDriver";
            System.setProperty("jdbc.drivers", drivers);
            String url = "jdbc:odbc:FacturasYClientes";
            String username = "";
            String password = "";
        
            conn = DriverManager.getConnection(url, username, password);
            stat = conn.createStatement();
            System.out.println("conexion echa...");
        }
        
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        
    
    public void close() {
        try {
            conn.close();
            stat.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Conexion();
        
    }
    
}