/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author emi
 */
public class cal extends javax.swing.JFrame {
float val1,val2;
int oper=0;
public float suma (float v1,float v2){
return v1 + v2;
}
public float multi (float v1,float v2){
return v1 * v2;
}
public float divi (float v1,float v2){
return v1 / v2;
}
public float resta (float v1,float v2){
return v1 - v2;
}



    /**
     * Creates new form cal
     */
    public cal() {
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

        caja1 = new javax.swing.JTextField();
        bsuma = new javax.swing.JButton();
        bresta = new javax.swing.JButton();
        bmulti = new javax.swing.JButton();
        bdivi = new javax.swing.JButton();
        bres = new javax.swing.JButton();
        blimp = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        caja1.setBackground(new java.awt.Color(0, 0, 0));
        caja1.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        caja1.setForeground(new java.awt.Color(0, 255, 0));
        caja1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja1ActionPerformed(evt);
            }
        });

        bsuma.setText("+");
        bsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumaActionPerformed(evt);
            }
        });

        bresta.setText("-");
        bresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brestaActionPerformed(evt);
            }
        });

        bmulti.setText("*");
        bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiActionPerformed(evt);
            }
        });

        bdivi.setText("/");
        bdivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdiviActionPerformed(evt);
            }
        });

        bres.setText("=");
        bres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresActionPerformed(evt);
            }
        });

        blimp.setText("C");
        blimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimpActionPerformed(evt);
            }
        });

        bsalir.setText("OFF");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caja1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bsuma, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(bmulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bdivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bres, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blimp, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsuma)
                    .addComponent(bresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmulti)
                    .addComponent(bdivi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bres)
                    .addComponent(blimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsalir)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumaActionPerformed
val1= Float.parseFloat(caja1.getText());
oper=1;
caja1.setText("");
caja1.grabFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_bsumaActionPerformed

    private void bresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresActionPerformed
val2=Float.parseFloat(caja1.getText());
    switch(oper)
    {
    case 1: caja1.setText(""+suma(val1,val2));break;
    case 2: caja1.setText(""+resta(val1,val2));break;
    case 3: caja1.setText(""+multi(val1,val2));break;
    case 4: caja1.setText(""+divi(val1,val2));break;
    default: break;    
    }    // TODO add your handling code here:
    }//GEN-LAST:event_bresActionPerformed

    private void brestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brestaActionPerformed
     val1=Float.parseFloat(caja1.getText());
oper=2;
caja1.setText("");caja1.grabFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_brestaActionPerformed

    private void bmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiActionPerformed
val1=Float.parseFloat(caja1.getText());
oper=3;
caja1.setText(""); caja1.grabFocus();       // TODO add your handling code here:
    }//GEN-LAST:event_bmultiActionPerformed

    private void bdiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdiviActionPerformed
val1=Float.parseFloat(caja1.getText());
oper=4;
caja1.setText("");caja1.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_bdiviActionPerformed

    private void blimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimpActionPerformed
caja1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_blimpActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_bsalirActionPerformed

    private void caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new cal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdivi;
    private javax.swing.JButton blimp;
    private javax.swing.JButton bmulti;
    private javax.swing.JButton bres;
    private javax.swing.JButton bresta;
    private javax.swing.JButton bsalir;
    private javax.swing.JButton bsuma;
    private javax.swing.JTextField caja1;
    // End of variables declaration//GEN-END:variables
}
