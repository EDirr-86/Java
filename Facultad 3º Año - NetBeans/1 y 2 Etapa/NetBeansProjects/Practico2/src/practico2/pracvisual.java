/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practico2;

import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class pracvisual extends javax.swing.JFrame {
libreriaprac metodos = new libreriaprac();
float val1=0,val2=0,val3=0;
/**
     * Creates new form pracvisual
     */
    public pracvisual() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        combo1 = new javax.swing.JComboBox();
        combo2 = new javax.swing.JComboBox();
        combo3 = new javax.swing.JComboBox();
        etres = new javax.swing.JLabel();
        opcsum = new javax.swing.JRadioButton();
        opcres = new javax.swing.JRadioButton();
        opcmul = new javax.swing.JRadioButton();
        opcdiv = new javax.swing.JRadioButton();
        opcmax = new javax.swing.JRadioButton();
        opcmin = new javax.swing.JRadioButton();
        opcmed = new javax.swing.JRadioButton();
        bsalir = new javax.swing.JButton();
        bcal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));

        combo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));

        etres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(opcsum);
        opcsum.setText("Sumar");

        buttonGroup1.add(opcres);
        opcres.setText("Restar");

        buttonGroup1.add(opcmul);
        opcmul.setText("Multiplicar");

        buttonGroup1.add(opcdiv);
        opcdiv.setText("Dividir");

        buttonGroup1.add(opcmax);
        opcmax.setText("Maximo");

        buttonGroup1.add(opcmin);
        opcmin.setText("Minimo");

        buttonGroup1.add(opcmed);
        opcmed.setText("Medio");

        bsalir.setText("X");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        bcal.setText("Calcular");
        bcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(bcal)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcmed)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(opcsum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opcres))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(opcmul)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(opcmax)
                                            .addGap(30, 30, 30)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(opcmin)
                                        .addComponent(opcdiv))))))
                    .addComponent(etres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcsum)
                    .addComponent(opcres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcmul)
                            .addComponent(opcdiv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcmax)
                            .addComponent(opcmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcmed)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bcal)
                        .addGap(38, 38, 38)))
                .addComponent(etres, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(bsalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
combo1=metodos.borrarcombo(combo1);
combo1=metodos.cargarcombo(combo1);
combo2=metodos.borrarcombo(combo2);
combo2=metodos.cargarcombo(combo2);
combo3=metodos.borrarcombo(combo3);
combo3=metodos.cargarcombo(combo3);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_bsalirActionPerformed

    private void bcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcalActionPerformed
if(opcsum.isSelected()==false && opcres.isSelected()==false && opcmul.isSelected()==false && opcdiv.isSelected()==false &&
        opcmax.isSelected()==false && opcmin.isSelected()==false && opcmed.isSelected()==false)
JOptionPane.showMessageDialog(null,"Use una operacion por favor !!");    
else    
{
val1 = Float.parseFloat(""+combo1.getSelectedItem());
val2 = Float.parseFloat(""+combo2.getSelectedItem());
val3 = Float.parseFloat(""+combo3.getSelectedItem());
if (opcsum.isSelected())
    etres.setText("El resultado de la suma es: "+ metodos.sumar(val1, val2, val3));
if (opcres.isSelected())
    etres.setText("El resultado de la resta es: "+ metodos.rest(val1, val2, val3));
if (opcmul.isSelected())
    etres.setText("El resultado de la multiplicacion es: "+ metodos.mult(val1, val2, val3));   
if (opcdiv.isSelected())
    etres.setText("El resultado de la divicion es: "+ metodos.divi(val1, val2, val3));
if (opcmax.isSelected())
    etres.setText("El maximo es: "+ metodos.calcular_mayor(val1, val2, val3));
if (opcmin.isSelected())
    etres.setText("El minimo es: "+ metodos.calcular_menor(val1, val2, val3));
if (opcmed.isSelected())
    etres.setText("El numero medio es: "+ metodos.clacular_medio(val1, val2, val3));
}
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bcalActionPerformed

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
            java.util.logging.Logger.getLogger(pracvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pracvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pracvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pracvisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pracvisual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcal;
    private javax.swing.JButton bsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo1;
    private javax.swing.JComboBox combo2;
    private javax.swing.JComboBox combo3;
    private javax.swing.JLabel etres;
    private javax.swing.JRadioButton opcdiv;
    private javax.swing.JRadioButton opcmax;
    private javax.swing.JRadioButton opcmed;
    private javax.swing.JRadioButton opcmin;
    private javax.swing.JRadioButton opcmul;
    private javax.swing.JRadioButton opcres;
    private javax.swing.JRadioButton opcsum;
    // End of variables declaration//GEN-END:variables
}
