/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import Controlador.FacturaDAO;
import Controlador.PedidoDetalleDADO;
import Controlador.VentaDAO;
import Modelo.Factura;
import Modelo.Venta;
import Modelo.Pedido;
import Modelo.Usuario;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.math.NumberUtils;
/**
 *
 * @author RojeruSan
 */
public class pnlVentas extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    VentaDAO aux = new VentaDAO();
    FacturaDAO factd = new FacturaDAO();
    PedidoDetalleDADO pedD = new PedidoDetalleDADO();
    public pnlVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblErrorLetra = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_Pedido = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        txtcod_pedido = new javax.swing.JTextField();
        txtEncargado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/market.png"))); // NOI18N
        jLabel7.setText("VENTAS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 850, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorLetra)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(lblErrorLetra))
                .addGap(153, 153, 153))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 139, -1, 40));

        btnLimpiar.setText("Borrar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 142, -1));

        jButton4.setText("Modificar Pedido");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 142, -1));

        btnAgregar.setText("Agregar Factura");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 142, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Codigo Pedido: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 142, -1, -1));

        txt_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PedidoActionPerformed(evt);
            }
        });
        add(txt_Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 143, -1));

        txtCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConKeyTyped(evt);
            }
        });
        add(txtCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));
        add(txtcod_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 140, -1));
        add(txtEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Código Pedido:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Concesionario");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Fecha");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Encargado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Estado");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));
        add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConKeyTyped
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
            lblErrorLetra.setText("Ingresa Solo Letras");

        }
    }//GEN-LAST:event_txtConKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char c=evt.getKeyChar();

        if(Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
            lblErrorLetra.setText("Ingresa Solo Letras");

        }
    }//GEN-LAST:event_txtFechaKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtEncargado.setText("");
        txtCon.setText("");
        txtcod_pedido.setText("");
        txtFecha.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(txtcod_pedido.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No se puede agregar si no se encontro un pedido. Vuelva a intentar");
            } else {
                float subtotal = pedD.getValorDetalle(txtcod_pedido.getText());
                float impuestos = subtotal*0.12f;
                float total = subtotal + impuestos;
                
                String cod_Factura = "FACT-"+String.valueOf(factd.getTotalFacturas());
                
                Factura fact = new Factura();
                fact.setCod_factura(cod_Factura);
                fact.setSubtotal(subtotal);
                fact.setImp(impuestos);
                fact.setTotal(total);
                
                factd.agregarFactura(fact);
                
                String id_venta = "VEN-"+String.valueOf(aux.getCantVenta());
                Pedido ped = new Pedido();
                ped.setCod_pedido(txtcod_pedido.getText());
                
                Venta ven = new Venta();
                ven.setCod_entrega(id_venta);
                ven.setFact(fact);
                ven.setPedido(ped);
                String strDateFormat = "yyyy-MM-dd";
                Date objDate = new Date();
                DateFormat objSDF = new SimpleDateFormat(strDateFormat);
                ven.setFecha(objSDF.format(objDate));
                
                ven.setEstado(txtEstado.getText());
                
                Usuario user = new Usuario();
                user.setIdUsuario(txtEncargado.getText());
                ven.setUser(user);
                aux.agregarVenta(ven);
            }
            
             
             
        } catch (SQLException ex) {
            Logger.getLogger(pnlVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txt_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PedidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codPedido = txt_Pedido.getText();
        Venta vent = new Venta();
        vent = aux.getVenta(codPedido);
        if(vent.getPedido().getCod_pedido()==null){
        JOptionPane.showMessageDialog(null,"No se encontró pedido");
        }
        txtcod_pedido.setText(vent.getPedido().getCod_pedido());
        txtFecha.setText(vent.getFecha());
        txtEstado.setText(vent.getEstado());   
    }//GEN-LAST:event_btnBuscarActionPerformed
    private boolean validarCamposVacios() {
        return txtcod_pedido.getText().isEmpty() || txtEncargado.getText() == null
                || txtCon.getText().isEmpty() || txtFecha.getText() == null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorLetra;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txt_Pedido;
    private javax.swing.JTextField txtcod_pedido;
    // End of variables declaration//GEN-END:variables
}
