/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eje32;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class eje32visual extends javax.swing.JFrame {
librery metodo = new librery();
   DefaultTableModel objtabla = new DefaultTableModel();
   
   
    public eje32visual() {
        initComponents();
       
        txtnombre.grabFocus();
        String titulos[]={"Nombre","Apellido","Edad"};
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonagregar = new javax.swing.JButton();
        botonborrar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad");

        botonagregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonagregar.setText("Agregar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonborrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonborrar.setText("Borrar");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtapellido.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        txtedad.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(botonagregar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(botonborrar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
/*String datos []= new String [3];
datos[0]=txtnombre.getText();
datos[1]=txtapellido.getText();
datos[2]=txtedad.getText();
objtabla.addRow(datos);
txtnombre.setText(null);
txtapellido.setText(null);
txtedad.setText(null);
txtnombre.grabFocus();*/
        String datos []= new String [3];
        txtnombre.setForeground(Color.BLACK);
        txtapellido.setForeground(Color.BLACK);
        txtedad.setForeground(Color.BLACK);
        
datos[0]=txtnombre.getText();
datos[1]=txtapellido.getText();
datos[2]=txtedad.getText();
        
        if(datos[0].length()==0 || datos[1].length()==0 || datos[2].length()==0)
            JOptionPane.showMessageDialog(null,"Faltan datos !!!");
        else{
            if(metodo.validarletras(datos[0]=txtnombre.getText()))
                {if(metodo.validarletras(datos[1]=txtapellido.getText()))
                    {if(metodo.validarnumeros(datos[2]=txtedad.getText()))
                        {objtabla.addRow(datos);
                        txtnombre.setText(null);
                        txtapellido.setText(null);
                        txtedad.setText(null);
                        txtnombre.grabFocus();}
                    else
                        {JOptionPane.showMessageDialog(null,"Ingreso de datos erroneo !!!");
                        txtedad.setForeground(Color.red);txtedad.grabFocus(); }}
                else
                    {JOptionPane.showMessageDialog(null,"Ingreso de datos erroneo !!!");
                    txtapellido.setForeground(Color.red);txtapellido.grabFocus();}}
            else
                {JOptionPane.showMessageDialog(null,"Ingreso de datos erroneo !!!");
                txtnombre.setForeground(Color.red);txtnombre.grabFocus();}}
 // TODO add your handling code here:
    }//GEN-LAST:event_botonagregarActionPerformed

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
int fila;
fila=tabla.getSelectedRow();
if (fila >=0)
    {
        objtabla.removeRow(fila);
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_botonborrarActionPerformed

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
            java.util.logging.Logger.getLogger(eje32visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eje32visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eje32visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eje32visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new eje32visual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
