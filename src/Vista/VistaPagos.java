/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class VistaPagos extends javax.swing.JFrame {

    /**
     * Creates new form Tarifas
     */
    int x,y;
    
    public VistaPagos() {
        
        initComponents();
        
        //Cambiar icono ventana
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage());
        
        
        //Agregar Imagen al frame
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/Plantilla_Cliente6.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
    }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        venInterna = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txtCuenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        panelPago = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnRPago = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        comboTar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        comboMeses = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnACuenta = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        txtPVto = new javax.swing.JTextField();
        txtECuenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtCC = new javax.swing.JLabel();
        txtDni2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 617));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venInterna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaClientes.setOpaque(false);
        jScrollPane2.setViewportView(tablaClientes);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar Cuenta:");

        btnAceptar.setText("ACEPTAR");

        btnCancelar2.setText("CANCELAR");

        javax.swing.GroupLayout venInternaLayout = new javax.swing.GroupLayout(venInterna);
        venInterna.setLayout(venInternaLayout);
        venInternaLayout.setHorizontalGroup(
            venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venInternaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(venInternaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnCancelar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        venInternaLayout.setVerticalGroup(
            venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venInternaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, venInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar)
                        .addComponent(btnCancelar2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(venInterna, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 450, 530));

        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FechaPago", "DEBE", "HABER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPagos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 400, 170));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 0, -1, 32));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 0, -1, 32));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 762, 34));

        btnBuscar.setText("BUSCAR CLIENTE");
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        btnPago.setText("NUEVO PAGO");
        getContentPane().add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 115, 40));

        jLabel2.setText("Dni: ");

        txtDni.setText("39337795");

        jLabel6.setText("Nombre: ");

        txtNombre.setText("Emanuel Ceriana");

        jLabel8.setText("Seleccione Tarifa:");

        btnRPago.setText("Realizar Pago");

        jLabel9.setText("Fecha Pago: ");

        txtFecha.setText("aa/MM/dddd");

        btnCancelar.setText("Cancelar");

        comboTar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros" }));

        jLabel4.setText("Paga con:");

        comboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "6", "12" }));

        jLabel11.setText("Cant.Meses");

        javax.swing.GroupLayout panelPagoLayout = new javax.swing.GroupLayout(panelPago);
        panelPago.setLayout(panelPagoLayout);
        panelPagoLayout.setHorizontalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPagoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPagoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(comboTar, 0, 93, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPagoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPagoLayout.setVerticalGroup(
            panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFecha))
                .addGap(27, 27, 27))
            .addGroup(panelPagoLayout.createSequentialGroup()
                .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(panelPagoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        btnACuenta.setText("ACTIVAR CUENTA");
        getContentPane().add(btnACuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 30));

        txtPVto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtECuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Estado de Cuenta:");

        jLabel10.setText("Próximo Vencimiento:");

        jLabel1.setText("Saldo Cuenta: ");

        txtSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtECuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtECuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPVto)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 250, 170));

        txtCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCC.setText("Cuenta:");
        getContentPane().add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, 20));

        txtDni2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtDni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 100, 20));

        btnEliminar.setText("ELIMINAR PAGO");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, 40));

        jLabel12.setText("Detalle del Pago:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 100, 30));

        txtDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
    x = evt.getX();
    y = evt.getY();
    
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
    this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY()-y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void txtDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalleActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnACuenta;
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JToggleButton btnCancelar;
    public javax.swing.JButton btnCancelar2;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnPago;
    public javax.swing.JButton btnRPago;
    public javax.swing.JComboBox<String> comboMeses;
    public javax.swing.JComboBox<String> comboTar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JPanel panelInfo;
    public javax.swing.JPanel panelPago;
    public javax.swing.JTable tablaClientes;
    public javax.swing.JTable tablaPagos;
    public javax.swing.JLabel txtCC;
    public javax.swing.JTextField txtCuenta;
    public javax.swing.JTextField txtDetalle;
    public javax.swing.JLabel txtDni;
    public javax.swing.JLabel txtDni2;
    public javax.swing.JTextField txtECuenta;
    public javax.swing.JLabel txtFecha;
    public javax.swing.JTextField txtImporte;
    public javax.swing.JTextField txtMonto;
    public javax.swing.JLabel txtNombre;
    public javax.swing.JTextField txtPVto;
    public javax.swing.JTextField txtSaldo;
    public javax.swing.JPanel venInterna;
    // End of variables declaration//GEN-END:variables
}
