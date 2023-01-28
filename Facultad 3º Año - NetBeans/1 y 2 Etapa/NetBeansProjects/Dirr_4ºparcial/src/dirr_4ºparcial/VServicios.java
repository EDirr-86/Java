
package dirr_4ºparcial;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VServicios extends javax.swing.JFrame {
DefaultTableModel objtabla = new DefaultTableModel();
libreria metodo = new libreria();
String dat;

public void limpiar()
{this.jCbxClie.setSelectedIndex(0);this.jCbxServ.setSelectedIndex(0);this.txtdir.setText("");objtabla.getDataVector().clear();
   tabla.repaint();tabla.revalidate();this.txttot.setText("");
}
    public VServicios() {
        initComponents();
        String titulos[]={"SERVICIO","PRECIO",""};
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
        tabla.getColumnModel().getColumn(2).setMaxWidth(0);
        tabla.getColumnModel().getColumn(2).setMinWidth(0);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(0);
        etid.setVisible(false);
        etidd.setVisible(false);
        
        try{ conexion miconexion = new conexion();
            String cons = "select descripcion from servicios";
            ResultSet consulta =miconexion.consulta(cons);
            do{consulta.next();
            this.jCbxServ.addItem(consulta.getString(1));
            }while (consulta.isLast()==false);
        
            cons = "select apellido from clientes";
            ResultSet consulta2 =miconexion.consulta(cons);
            do{consulta2.next();
            this.jCbxClie.addItem(consulta2.getString(1));
            }while (consulta2.isLast()==false); 
        }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());} 
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        etprod = new javax.swing.JLabel();
        jCbxServ = new javax.swing.JComboBox();
        txtprec = new javax.swing.JTextField();
        etpre = new javax.swing.JLabel();
        jBtnAgreTabla = new javax.swing.JButton();
        jBtnElimFilTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txttot = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCbxClie = new javax.swing.JComboBox();
        txtdir = new javax.swing.JTextField();
        etpre1 = new javax.swing.JLabel();
        etclie = new javax.swing.JLabel();
        etid = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        etidd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGA SERVICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        etprod.setText("SERVICIOS :");

        jCbxServ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------Seleccione--------" }));
        jCbxServ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbxServItemStateChanged(evt);
            }
        });
        jCbxServ.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCbxServPropertyChange(evt);
            }
        });
        jCbxServ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCbxServKeyPressed(evt);
            }
        });

        txtprec.setEditable(false);

        etpre.setText("PRECIO:");

        jBtnAgreTabla.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAgreTabla.setText("Agregar a Tabla");
        jBtnAgreTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgreTablaActionPerformed(evt);
            }
        });

        jBtnElimFilTabla.setText("Borrar Fila");
        jBtnElimFilTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElimFilTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAgreTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnElimFilTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(etpre)
                                .addGap(37, 37, 37)
                                .addComponent(txtprec))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(etprod)
                                .addGap(18, 18, 18)
                                .addComponent(jCbxServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etprod))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etpre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnElimFilTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAgreTabla)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("TOTAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jCbxClie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------Seleccione--------" }));
        jCbxClie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbxClieItemStateChanged(evt);
            }
        });
        jCbxClie.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCbxCliePropertyChange(evt);
            }
        });
        jCbxClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCbxClieKeyPressed(evt);
            }
        });

        txtdir.setEditable(false);

        etpre1.setText("DIRECCION");

        etclie.setText("CLIENTES :");

        etid.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etclie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbxClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etpre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etid)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etclie)
                    .addComponent(jCbxClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etpre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etid)
                .addGap(31, 31, 31))
        );

        jBtnGuardar.setText("GUARDAR");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        etidd.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etidd)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jBtnGuardar))
                    .addComponent(etidd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbxServKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCbxServKeyPressed
       
    }//GEN-LAST:event_jCbxServKeyPressed

    private void jBtnAgreTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgreTablaActionPerformed
        try{ conexion miconexion = new conexion();
            String cons= "select idservicio from servicios WHERE descripcion='"+jCbxServ.getSelectedItem()+"'";
            ResultSet consulta =miconexion.consulta(cons);
            consulta.first();
            dat = consulta.getString(1);
            consulta.close(); }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}
        
        String datos[] = new String[3];
        datos[0] = jCbxServ.getSelectedItem().toString();
        datos[1] = txtprec.getText();
        datos[2]= dat;           
       objtabla.addRow(datos);
        txttot.setText("");
        txttot.setText("" + metodo.resultado(objtabla));
        
        txtprec.setText("");jCbxServ.setSelectedIndex(0);          
    }//GEN-LAST:event_jBtnAgreTablaActionPerformed

    private void jBtnElimFilTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElimFilTablaActionPerformed
        int fila;
        fila = tabla.getSelectedRow();
        if (fila >= 0) {
            objtabla.removeRow(fila);
            txttot.setText("");
            txttot.setText("" + metodo.resultado(objtabla));
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila!");
        }
    }//GEN-LAST:event_jBtnElimFilTablaActionPerformed

    private void jCbxServPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCbxServPropertyChange

    }//GEN-LAST:event_jCbxServPropertyChange

    private void jCbxServItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbxServItemStateChanged
        
    try{ conexion miconexion = new conexion();
            String cons = "select precio from servicios where descripcion='"+jCbxServ.getSelectedItem()+"'";
            ResultSet consulta =miconexion.consulta(cons);
            consulta.next();
            this.txtprec.setText(""+consulta.getString(1)); }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());} 
    }//GEN-LAST:event_jCbxServItemStateChanged

    private void jCbxClieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbxClieItemStateChanged
         
    try{ conexion miconexion = new conexion();
            String cons = "select direccion,idcliente from clientes where apellido='"+jCbxClie.getSelectedItem()+"'";
            ResultSet consulta =miconexion.consulta(cons);
            consulta.next();
            this.txtdir.setText(""+consulta.getString(1));
    this.etid.setText(""+consulta.getString(2));
    }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}  
    }//GEN-LAST:event_jCbxClieItemStateChanged

    private void jCbxCliePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCbxCliePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxCliePropertyChange

    private void jCbxClieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCbxClieKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxClieKeyPressed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

        try
        {
        conexion miconexion = new conexion ();
        String ID = "SELECT MAX( (idserviciocliente) +1 )FROM servicioscliente";
        ResultSet consulta =miconexion.consulta(ID);
        consulta.next();
        if (consulta.getString(1)==null){etidd.setText(""+1);}
        else
        etidd.setText(""+consulta.getString(1));consulta.close();
        
        String insert = "insert into servicioscliente values (?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
        for(int i=0; i < tabla.getRowCount();i++){
            miconexion.psPrepararSentencias.setString(1, etidd.getText());
            miconexion.psPrepararSentencias.setString(2, etid.getText());
            miconexion.psPrepararSentencias.setString(3, tabla.getValueAt(i, 2).toString());
            miconexion.psPrepararSentencias.executeUpdate(); 
        } JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
        }         
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }       
        limpiar();
    }//GEN-LAST:event_jBtnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VServicios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etclie;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etidd;
    private javax.swing.JLabel etpre;
    private javax.swing.JLabel etpre1;
    private javax.swing.JLabel etprod;
    private javax.swing.JButton jBtnAgreTabla;
    private javax.swing.JButton jBtnElimFilTabla;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox jCbxClie;
    private javax.swing.JComboBox jCbxServ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtprec;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
