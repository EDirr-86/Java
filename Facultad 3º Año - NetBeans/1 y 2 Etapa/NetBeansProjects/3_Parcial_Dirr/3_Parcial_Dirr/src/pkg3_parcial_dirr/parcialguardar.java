
package pkg3_parcial_dirr;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class parcialguardar extends javax.swing.JFrame {
int aux;

    public void validar(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++) {
    if (datos[i].toString().isEmpty()) {
        if(bmas.isSelected()==false && bfem.isSelected()==false)
        {JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");aux=1;}
break;
} }} 
    libreria metodo = new libreria();
    public parcialguardar() {
        initComponents();
        
        try
        {
        Conectar miconexion = new Conectar ();
        String cons = "SELECT MAX( (id) +1 )FROM datos";
        ResultSet consulta =miconexion.consulta(cons);
        consulta.next();
        if (consulta.getString(1)==null){
            etid.setText(""+1);
        }
        else
        etid.setText(""+consulta.getString(1));
           
        }
        
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        etnomb = new javax.swing.JLabel();
        etape = new javax.swing.JLabel();
        etdni = new javax.swing.JLabel();
        eteda = new javax.swing.JLabel();
        etsex = new javax.swing.JLabel();
        txtnomb = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        bmas = new javax.swing.JRadioButton();
        bfem = new javax.swing.JRadioButton();
        bguardar = new javax.swing.JButton();
        etid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        etnomb.setText("Nombre:");

        etape.setText("Apellido:");

        etdni.setText("D.N.I.:");

        eteda.setText("Edad:");

        etsex.setText("Sexo:");

        buttonGroup1.add(bmas);
        bmas.setText("Masculino");

        buttonGroup1.add(bfem);
        bfem.setText("Femenino");

        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etid, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etnomb)
                                .addComponent(etsex)
                                .addComponent(eteda))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bmas)
                                    .addGap(18, 18, 18)
                                    .addComponent(bfem))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etape)
                                .addComponent(etdni))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etid, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etnomb)
                    .addComponent(txtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etape)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etdni)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eteda)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etsex)
                    .addComponent(bmas)
                    .addComponent(bfem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(bguardar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
       try
        {
        
        Conectar miconexion = new Conectar();
        String insert = "insert into datos values (?,?,?,?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
        Object[] datos={txtnomb.getText(),txtape.getText(),txtdni.getText(),txtedad.getText()};                     
       
        validar(datos);
        
        if(aux != 1){
            if(metodo.validarletras(txtnomb.getText())){
                if(metodo.validarletras(txtape.getText())){
                    if(metodo.validarnumeros(txtdni.getText())){
                        if(metodo.validarnumeros(txtedad.getText())){
                            miconexion.psPrepararSentencias.setString(1, etid.getText());
                            miconexion.psPrepararSentencias.setString(2, txtnomb.getText());
                            miconexion.psPrepararSentencias.setString(3, txtape.getText());
                            miconexion.psPrepararSentencias.setString(4, txtdni.getText());
                            miconexion.psPrepararSentencias.setString(5, txtedad.getText());
                                             
                            if (bmas.isSelected())
                                miconexion.psPrepararSentencias.setString(6, bmas.getText());
                            if (bfem.isSelected())
                                miconexion.psPrepararSentencias.setString(6, bfem.getText());
                            aux=0;
                            
                            String cons = "SELECT MAX( (id) +1 )FROM datos";
                            ResultSet consulta =miconexion.consulta(cons);
                            consulta.next();
                            etid.setText(consulta.getString(1));
                            
                            txtnomb.setText("");
                            txtape.setText("");
                            txtdni.setText("");
                            txtedad.setText("");
                          
                                                                                 
                            
                                                                        }
                        else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");
                                                                 }
                    else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");
                                                              }
                else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");
                                                           }
            else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");
             
        }
        else
                            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
           
            
        miconexion.psPrepararSentencias.executeUpdate();     
        miconexion.miconexion.close();
        JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
        }         
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bguardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
etid.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(parcialguardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parcialguardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parcialguardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parcialguardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new parcialguardar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bfem;
    private javax.swing.JButton bguardar;
    private javax.swing.JRadioButton bmas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etape;
    private javax.swing.JLabel etdni;
    private javax.swing.JLabel eteda;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etnomb;
    private javax.swing.JLabel etsex;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnomb;
    // End of variables declaration//GEN-END:variables
}
