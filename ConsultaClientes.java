import java.sql.*;
public class ConsultaClientes extends Conexion {
    
    /** Creates a new instance of ConsultaClientes */
    public ConsultaClientes() {
    getDatosClientes();
    }
    
    public String getDatosClientes() {
        try {
            String datos = "";
            ResultSet r = stat.executeQuery("select * from Clientes");
            while (r.next())
                datos += r.getString(1)
                + "--"
                + r.getString(2)
                + "--"
                + r.getString(3)
                + "--"
                + r.getString(4)
                + "--"
                + r.getString(5)
                + "--";
            System.out.println(datos);
            return datos;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static void main(String args[]){
    new ConsultaClientes();
    }
}