
public class EliminarClientes extends Conexion{
    
    /** Creates a new instance of EliminarClientes */
    public EliminarClientes() {
    }
public void eliminarCliente(){
         
         try{
            String rfc = javax.swing.JOptionPane.showInputDialog("Inserta RFC Del Cliente a "+"Eliminar...");
            boolean eliminacion = stat.execute("DELETE FROM Clientes WHERE rfc LIKE'"+rfc+"'"); 
         
         }
             catch (Exception e) {
               e.printStackTrace();
               System.exit(0);
            } 
      }
    
}
