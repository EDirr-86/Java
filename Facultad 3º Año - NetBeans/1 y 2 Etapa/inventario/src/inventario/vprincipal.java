
package inventario;


public class vprincipal extends javax.swing.JFrame {
cliente vcliente = new cliente(new javax.swing.JDialog(),true);
proveedor vproveedor = new proveedor(new javax.swing.JDialog(),true); 
producto vproducto = new producto(new javax.swing.JDialog(),true);
personal vpersonal = new personal(new javax.swing.JDialog(),true);
Ocompra vcompra = new Ocompra(new javax.swing.JDialog(),true);
Fventa vventa = new Fventa(new javax.swing.JDialog(),true);
    public vprincipal() {
        initComponents();
        jLblPortada.requestFocus();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bcliente = new javax.swing.JButton();
        bproveedor = new javax.swing.JButton();
        bventa = new javax.swing.JButton();
        bcompra = new javax.swing.JButton();
        bproducto = new javax.swing.JButton();
        jLblPortada = new javax.swing.JLabel();
        bpersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bcliente.setBackground(new java.awt.Color(255, 255, 255));
        bcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/icono_cliente.jpg"))); // NOI18N
        bcliente.setText("CLIENTES");
        bcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bclienteMouseClicked(evt);
            }
        });

        bproveedor.setBackground(new java.awt.Color(255, 255, 255));
        bproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/prov.jpg"))); // NOI18N
        bproveedor.setText("PROVEEDORES");
        bproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bproveedorMouseClicked(evt);
            }
        });

        bventa.setBackground(new java.awt.Color(255, 255, 255));
        bventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/order_SELL_icon.gif"))); // NOI18N
        bventa.setText("FACTURA VENTA");
        bventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bventaMouseClicked(evt);
            }
        });

        bcompra.setBackground(new java.awt.Color(255, 255, 255));
        bcompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/order_BUY_icon.gif"))); // NOI18N
        bcompra.setText("ORDEN DE COMPRA");
        bcompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcompraMouseClicked(evt);
            }
        });

        bproducto.setBackground(new java.awt.Color(255, 255, 255));
        bproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/prod_icon.jpg"))); // NOI18N
        bproducto.setText("PRODUCTOS");
        bproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bproductoMouseClicked(evt);
            }
        });

        jLblPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/portada.jpg"))); // NOI18N

        bpersonal.setBackground(new java.awt.Color(255, 255, 255));
        bpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/users_icon.gif"))); // NOI18N
        bpersonal.setText("PERSONAL");
        bpersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bpersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bpersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblPortada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bventa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bclienteMouseClicked
        vcliente.setVisible(true);
    }//GEN-LAST:event_bclienteMouseClicked

    private void bproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bproveedorMouseClicked
        vproveedor.setVisible(true);
    }//GEN-LAST:event_bproveedorMouseClicked

    private void bproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bproductoMouseClicked
        vproducto.setVisible(true);
    }//GEN-LAST:event_bproductoMouseClicked

    private void bpersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bpersonalMouseClicked
        vpersonal.setVisible(true);
    }//GEN-LAST:event_bpersonalMouseClicked

    private void bcompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcompraMouseClicked
        vcompra.setVisible(true);
    }//GEN-LAST:event_bcompraMouseClicked

    private void bventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bventaMouseClicked
        vventa.setVisible(true);
    }//GEN-LAST:event_bventaMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new vprincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcliente;
    private javax.swing.JButton bcompra;
    private javax.swing.JButton bpersonal;
    private javax.swing.JButton bproducto;
    private javax.swing.JButton bproveedor;
    private javax.swing.JButton bventa;
    private javax.swing.JLabel jLblPortada;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
