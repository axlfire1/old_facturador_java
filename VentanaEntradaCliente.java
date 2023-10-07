public class VentanaEntradaCliente extends javax.swing.JFrame {
    
    /** Creates new form VentanaPrincipal */
    public VentanaEntradaCliente() {
        initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        campoNombreCliente = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        labelPoblacion = new javax.swing.JLabel();
        campoPoblacion = new javax.swing.JTextField();
        labelRfc = new javax.swing.JLabel();
        campoRfc = new javax.swing.JTextField();
        labelCodigoPostal = new javax.swing.JLabel();
        campoCodigoPostal = new javax.swing.JTextField();
        botonAceptarCliente = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        MenuCreditos = new javax.swing.JMenu();
        menuCreditosVerCreditos = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        setTitle("RECICLE Apizaco");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panelPrincipal.setLayout(null);

        jLabel1.setText("NUEVO CLIENTE");
        panelPrincipal.add(jLabel1);
        jLabel1.setBounds(150, 20, 100, 16);

        labelCliente.setText("Cliente");
        panelPrincipal.add(labelCliente);
        labelCliente.setBounds(30, 60, 50, 16);

        panelPrincipal.add(campoNombreCliente);
        campoNombreCliente.setBounds(120, 60, 190, 20);

        labelDireccion.setText("Direccion");
        panelPrincipal.add(labelDireccion);
        labelDireccion.setBounds(30, 100, 60, 16);

        panelPrincipal.add(campoDireccion);
        campoDireccion.setBounds(120, 100, 190, 20);

        labelPoblacion.setText("Poblacion");
        panelPrincipal.add(labelPoblacion);
        labelPoblacion.setBounds(30, 140, 56, 16);

        panelPrincipal.add(campoPoblacion);
        campoPoblacion.setBounds(120, 140, 190, 20);

        labelRfc.setText("R.F.C. Cliente");
        panelPrincipal.add(labelRfc);
        labelRfc.setBounds(30, 180, 80, 16);

        panelPrincipal.add(campoRfc);
        campoRfc.setBounds(120, 180, 190, 20);

        labelCodigoPostal.setText("C.P.");
        panelPrincipal.add(labelCodigoPostal);
        labelCodigoPostal.setBounds(30, 220, 22, 16);

        panelPrincipal.add(campoCodigoPostal);
        campoCodigoPostal.setBounds(120, 220, 190, 20);

        botonAceptarCliente.setText("AceptarCliente");
        botonAceptarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarClienteActionPerformed(evt);
            }
        });

        panelPrincipal.add(botonAceptarCliente);
        botonAceptarCliente.setBounds(40, 280, 120, 26);

        botonCancelar.setText("Cancelar");
        panelPrincipal.add(botonCancelar);
        botonCancelar.setBounds(190, 280, 120, 26);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(0, -10, 400, 350);

        menuArchivo.setText("Archivo");
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        menuArchivo.add(Salir);
        barraMenu.add(menuArchivo);
        MenuCreditos.setText("Creditos");
        menuCreditosVerCreditos.setText("Ver Creditos");
        menuCreditosVerCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditosVerCreditosActionPerformed(evt);
            }
        });

        MenuCreditos.add(menuCreditosVerCreditos);
        barraMenu.add(MenuCreditos);
        setJMenuBar(barraMenu);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(383, 363));
        setLocation((screenSize.width-383)/2,(screenSize.height-363)/2);
    }//GEN-END:initComponents
    
    private void botonAceptarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarClienteActionPerformed
        setVisible(false);
        insertarCliente();
    
    }//GEN-LAST:event_botonAceptarClienteActionPerformed
    
    private void menuCreditosVerCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditosVerCreditosActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null,"Ing E David Sarmiento Torres");
    }//GEN-LAST:event_menuCreditosVerCreditosActionPerformed
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        setVisible(false);
    
    }//GEN-LAST:event_SalirActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    public void insertarCliente(){
        Conexion conexion = new Conexion();
        try{
            
            nombre = campoNombreCliente.getText();
            direccion = campoDireccion.getText();
            poblacion = campoPoblacion.getText();
            rfc = campoRfc.getText();
            cp = campoCodigoPostal.getText();
            
            int update = conexion.stat.executeUpdate("insert into Clientes values('"
            + nombre 
            + "','"
            +direccion
            + "','"
            + poblacion
            + "','"
            + rfc
            + "','"
            + cp
            + "')");
       }
        
        catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new VentanaEntradaCliente().show();
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCreditos;
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JLabel labelPoblacion;
    private javax.swing.JButton botonAceptarCliente;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JMenuItem menuCreditosVerCreditos;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelRfc;
    private javax.swing.JLabel labelCodigoPostal;
    private javax.swing.JTextField campoPoblacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField campoNombreCliente;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoRfc;
    private javax.swing.JMenuBar barraMenu;
    // End of variables declaration//GEN-END:variables
    public String  nombre;
    public String  direccion;
    public String   poblacion;
    public String   rfc;
    public String   cp;
}
