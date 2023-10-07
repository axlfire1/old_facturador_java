import java.util.StringTokenizer;
public class VentanaEliminacionCliente extends javax.swing.JFrame {
    
    /** Creates new form VentanaNuevaFactura */
    public VentanaEliminacionCliente() {
        initComponents();
        initComponents2();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        panelPrincipal = new javax.swing.JPanel();
        labelEliminarCliente = new javax.swing.JLabel();
        scroollMuestraClientes = new javax.swing.JScrollPane();
        tablaContenido = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();
        BotonSeleccionaCliente = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        menuCreditos = new javax.swing.JMenu();
        creditos = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        setTitle("RECICLE Apizaco");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panelPrincipal.setLayout(null);

        labelEliminarCliente.setText("ELIMINAR CLIENTE");
        panelPrincipal.add(labelEliminarCliente);
        labelEliminarCliente.setBounds(140, 20, 110, 16);

        tablaContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Poblacion", "RFC", "CP"
            }
        ));
        scroollMuestraClientes.setViewportView(tablaContenido);

        panelPrincipal.add(scroollMuestraClientes);
        scroollMuestraClientes.setBounds(20, 50, 360, 150);

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        panelPrincipal.add(botonRegresar);
        botonRegresar.setBounds(290, 230, 90, 30);

        BotonSeleccionaCliente.setText("Empleado a eliminar");
        BotonSeleccionaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeleccionaClienteActionPerformed(evt);
            }
        });

        panelPrincipal.add(BotonSeleccionaCliente);
        BotonSeleccionaCliente.setBounds(20, 230, 150, 30);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        panelPrincipal.add(botonAceptar);
        botonAceptar.setBounds(180, 230, 100, 30);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, 0, 400, 310);

        menuArchivo.setText("Archivo");
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        menuArchivo.add(salir);
        jMenuBar1.add(menuArchivo);
        menuCreditos.setText("Creditos");
        creditos.setText("Ver Creditos");
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });

        menuCreditos.add(creditos);
        jMenuBar1.add(menuCreditos);
        setJMenuBar(jMenuBar1);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(400, 329));
        setLocation((screenSize.width-400)/2,(screenSize.height-329)/2);
    }//GEN-END:initComponents

    private void BotonSeleccionaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSeleccionaClienteActionPerformed
        EliminarClientes eliminarClientes = new EliminarClientes();
        eliminarClientes.eliminarCliente();
    }//GEN-LAST:event_BotonSeleccionaClienteActionPerformed
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        actualizarInterfaz();
    }//GEN-LAST:event_botonAceptarActionPerformed
    
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonRegresarActionPerformed
    
    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null,"Ing E David Sarmiento Torres");
    }//GEN-LAST:event_creditosActionPerformed
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_salirActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    private void initComponents2(){
         actualizarInterfaz();
         
        
      }
    
       public void actualizarInterfaz(){
         ConsultaClientes consultaClientes = new ConsultaClientes();
        
         Object[][] filas;
         String [] columnas=new String[]{ "Id", "Nombre", "Contrase�a", "Edad", "Puesto","Turno"};
        
         StringTokenizer tokens=new StringTokenizer(consultaClientes.getDatosClientes(),"--");
         filas=new Object[(tokens.countTokens()/(columnas.length-1))][columnas.length];
         System.out.println(tokens.countTokens());
         int nRegistros=1;
         int cont=0;
         while(tokens.hasMoreTokens()){
            //control de filas
            filas[cont][0]=nRegistros+"";
            for(int i=1;i<columnas.length;i++){
               filas[cont][i]=tokens.nextToken();
            }
            cont++;
            nRegistros++;
            
         }
        
         scroollMuestraClientes.remove(tablaContenido);
         tablaContenido = new javax.swing.JTable();
        
         tablaContenido.setModel(new javax.swing.table.DefaultTableModel(filas,columnas) );
        
        
        
         scroollMuestraClientes.add(tablaContenido);
        
         panelPrincipal.add(scroollMuestraClientes);
        
         scroollMuestraClientes.setViewportView(tablaContenido);
        
         scroollMuestraClientes.repaint();
        
         repaint();
        
      }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new VentanaEliminacionCliente().show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton BotonSeleccionaCliente;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem creditos;
    private javax.swing.JMenu menuCreditos;
    private javax.swing.JTable tablaContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelEliminarCliente;
    private javax.swing.JScrollPane scroollMuestraClientes;
    private javax.swing.JButton botonRegresar;
    // End of variables declaration//GEN-END:variables
    
}