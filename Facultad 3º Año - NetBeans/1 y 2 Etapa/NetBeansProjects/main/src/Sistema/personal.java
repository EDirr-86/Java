
package Sistema;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 * 
 * @author emi
 */
public class personal extends javax.swing.JDialog {

  
     
    public personal(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtDNI = new javax.swing.JTextField();
        jTxtNombres = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jTxtCelular = new javax.swing.JTextField();
        jTxtComision = new javax.swing.JTextField();
        jTxtMail = new javax.swing.JTextField();
        jTxtDistrito = new javax.swing.JTextField();
        jLblCodigo = new javax.swing.JLabel();
        jLblFoto = new javax.swing.JLabel();
        jTxtMail1 = new javax.swing.JTextField();
        jTxtMail2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTxtDireccion1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PERSONAL: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setText("Codigo:");

        jLabel10.setText("DNI:");

        jLabel11.setText("Celular:");

        jLabel12.setText("Comisión:");

        jLabel13.setText("E-Mail");

        jLabel14.setText("Teléfono:");

        jLabel15.setText("Nombres:");

        jLabel16.setText("Codigo Postal:");

        jLabel1.setText("Direccion:");

        jLabel2.setText("Localidad:");

        jLabel3.setText("Provincia:");

        jTxtDNI.setEditable(false);
        jTxtDNI.setText("31.625.958");
        jTxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtDNIKeyPressed(evt);
            }
        });

        jTxtNombres.setEditable(false);
        jTxtNombres.setText("Emiliano ALberto");
        jTxtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNombresKeyPressed(evt);
            }
        });

        jTxtDireccion.setEditable(false);
        jTxtDireccion.setText("5850");
        jTxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtDireccionKeyPressed(evt);
            }
        });

        jTxtTelefono.setEditable(false);
        jTxtTelefono.setText("353-4962918");
        jTxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyPressed(evt);
            }
        });

        jTxtCelular.setEditable(false);
        jTxtCelular.setText("353-4265669");
        jTxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCelularKeyPressed(evt);
            }
        });

        jTxtComision.setEditable(false);
        jTxtComision.setText("Todas");
        jTxtComision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtComisionKeyPressed(evt);
            }
        });

        jTxtMail.setEditable(false);
        jTxtMail.setText("Rio Tercero");
        jTxtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtMailKeyPressed(evt);
            }
        });

        jTxtDistrito.setEditable(false);
        jTxtDistrito.setText("Cordoba");
        jTxtDistrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtDistritoKeyPressed(evt);
            }
        });

        jLblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblCodigo.setText("1");

        jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/personal.jpg"))); // NOI18N
        jLblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLblFoto.setMaximumSize(new java.awt.Dimension(138, 169));
        jLblFoto.setMinimumSize(new java.awt.Dimension(138, 169));
        jLblFoto.setPreferredSize(new java.awt.Dimension(138, 169));

        jTxtMail1.setEditable(false);
        jTxtMail1.setText("emilianodirr1@gmail.com");
        jTxtMail1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtMail1KeyPressed(evt);
            }
        });

        jTxtMail2.setEditable(false);
        jTxtMail2.setText("Chacabuco 326");
        jTxtMail2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtMail2KeyPressed(evt);
            }
        });

        jLabel17.setText("Apellido/s:");

        jTxtDireccion1.setEditable(false);
        jTxtDireccion1.setText("Dirr");
        jTxtDireccion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtDireccion1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDireccion1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtTelefono)
                            .addComponent(jTxtCelular)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTxtDNI))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtComision, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jTxtMail1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtDistrito)
                            .addComponent(jTxtMail)
                            .addComponent(jTxtMail2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jTxtDireccion))))
                .addGap(27, 27, 27)
                .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTxtComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTxtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTxtMail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    
    private void jTxtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDNIKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtNombres.requestFocus();        // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtDNIKeyPressed

    private void jTxtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombresKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtDireccion.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtNombresKeyPressed

    private void jTxtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDireccionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtTelefono.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtDireccionKeyPressed

    private void jTxtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtCelular.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtTelefonoKeyPressed

    private void jTxtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCelularKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtComision.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtCelularKeyPressed

    private void jTxtComisionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtComisionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jTxtMail.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtComisionKeyPressed

    private void jTxtMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMailKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //jCbxDepartamento.requestFocus();         // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtMailKeyPressed

    private void jTxtDistritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDistritoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            //jBtnFoto.requestFocus();
            // TODO add your handling code here:
        }     }//GEN-LAST:event_jTxtDistritoKeyPressed

    private void jTxtMail1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMail1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMail1KeyPressed

    private void jTxtMail2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtMail2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMail2KeyPressed

    private void jTxtDireccion1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDireccion1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDireccion1KeyPressed

    
    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                personal dialog = new personal(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCelular;
    private javax.swing.JTextField jTxtComision;
    private javax.swing.JTextField jTxtDNI;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtDireccion1;
    private javax.swing.JTextField jTxtDistrito;
    private javax.swing.JTextField jTxtMail;
    private javax.swing.JTextField jTxtMail1;
    private javax.swing.JTextField jTxtMail2;
    private javax.swing.JTextField jTxtNombres;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
