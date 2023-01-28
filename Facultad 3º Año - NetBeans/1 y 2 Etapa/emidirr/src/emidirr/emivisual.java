
package emidirr;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class emivisual extends javax.swing.JFrame {

    elibreria metodo = new elibreria();
    DefaultTableModel objtabla = new DefaultTableModel();
    
    public emivisual() {
        initComponents();
        
        String titulos[]={"RUBRO","PRODUCTO","CANTIDAD","PRECIO","SUB-TOTAL"};
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etrubro = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox();
        etprod = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox();
        etprecio = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        etcant = new javax.swing.JLabel();
        combo3 = new javax.swing.JComboBox();
        bagregar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        etnom = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        etedad = new javax.swing.JLabel();
        caja3 = new javax.swing.JTextField();
        etape = new javax.swing.JLabel();
        caja4 = new javax.swing.JTextField();
        etcantt = new javax.swing.JLabel();
        caja5 = new javax.swing.JTextField();
        ettotal = new javax.swing.JLabel();
        caja6 = new javax.swing.JTextField();
        bvalidar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        etrubro.setText("Rubro");

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });

        etprod.setText("Producto");

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo2ItemStateChanged(evt);
            }
        });

        etprecio.setText("Precio");

        etcant.setText("Cantidad");

        combo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bagregar.setText("Agregar");
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });

        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

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

        etnom.setText("Nombre");

        etedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etedad.setText("Edad");

        etape.setText("Apellido");

        etcantt.setText("Cantidad Total");

        ettotal.setText("Total");

        bvalidar.setText("Validar");
        bvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvalidarActionPerformed(evt);
            }
        });

        bsalir.setText("Salir");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etrubro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etprod)
                            .addComponent(etprecio)
                            .addComponent(etcant)
                            .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combo2, javax.swing.GroupLayout.Alignment.LEADING, 0, 86, Short.MAX_VALUE)
                                    .addComponent(combo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caja1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beliminar)
                                    .addComponent(bagregar))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etcantt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(caja5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(ettotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(caja6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bvalidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(etedad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(etnom, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(caja2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(caja3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(38, 38, 38)
                                            .addComponent(etape)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etrubro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etprod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etnom)
                            .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etape)
                            .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etedad)
                            .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bvalidar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etprecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bagregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etcant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beliminar)
                            .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bsalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etcantt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caja5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ettotal)
                        .addComponent(caja6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvalidarActionPerformed
     
        if(metodo.validarnumeros(caja3.getText()))
            {caja3.setForeground(Color.BLUE);}
        else
            {caja3.setForeground(Color.RED);}

        if(metodo.validarletras(caja2.getText()))
            {caja2.setForeground(Color.BLUE);}
        else
            {caja2.setForeground(Color.RED);}
        
        if(metodo.validarletras(caja4.getText()))
            {caja4.setForeground(Color.BLUE);}
        else
            {caja4.setForeground(Color.RED);}
    }//GEN-LAST:event_bvalidarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
combo1.removeAllItems();
combo3.removeAllItems();

for(int i=1;i<=20;i++)
{combo3.addItem(""+i);}

combo1.addItem("Verduras");combo1.addItem("Frutas");combo1.addItem("Carnes");
combo2.setSelectedIndex(-1);combo1.setSelectedIndex(-1);combo2.setEnabled(false);
caja1.setText("");combo3.setSelectedIndex(-1);
    }//GEN-LAST:event_formWindowOpened

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
      
if(combo1.getSelectedIndex()==0)
    {combo2.setEnabled(true);combo2.removeAllItems();combo2.addItem("Papas");combo2.addItem("Tomates");combo2.addItem("Lechuga");combo2.setSelectedIndex(-1);}                                       
if(combo1.getSelectedIndex()==1)
    {combo2.setEnabled(true);combo2.removeAllItems();combo2.addItem("Manzanas");combo2.addItem("Peras");combo2.addItem("Mandarinas");combo2.setSelectedIndex(-1);}
if(combo1.getSelectedIndex()==2)
    {combo2.setEnabled(true);combo2.removeAllItems();combo2.addItem("Costillas");combo2.addItem("Lomo");combo2.addItem("Vacio");combo2.setSelectedIndex(-1);}
 caja1.setText("");  
    }//GEN-LAST:event_combo1ItemStateChanged

    private void combo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo2ItemStateChanged

if(combo1.getSelectedIndex()==0 && combo2.getSelectedIndex()==0)
    {caja1.setText("2.50");    }
if(combo1.getSelectedIndex()==0 && combo2.getSelectedIndex()==1)
    {caja1.setText("6.30");}
if(combo1.getSelectedIndex()==0 && combo2.getSelectedIndex()==2)
    {caja1.setText("12.50");}

if(combo1.getSelectedIndex()==1 && combo2.getSelectedIndex()==0)
    {caja1.setText("3.40");}
if(combo1.getSelectedIndex()==1 && combo2.getSelectedIndex()==1)
    {caja1.setText("4.50");}
if(combo1.getSelectedIndex()==1 && combo2.getSelectedIndex()==2)
    {caja1.setText("2.80");}
   
if(combo1.getSelectedIndex()==2 && combo2.getSelectedIndex()==0)
    {caja1.setText("45.30");}
if(combo1.getSelectedIndex()==2 && combo2.getSelectedIndex()==1)
    {caja1.setText("52.50");}
if(combo1.getSelectedIndex()==2 && combo2.getSelectedIndex()==2)
    {caja1.setText("40.25");}

    }//GEN-LAST:event_combo2ItemStateChanged

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
String datos[]=new String [5];

double suma=0,summa=0;
datos[0]= (String) combo1.getSelectedItem(); 
datos[1]=(String) combo2.getSelectedItem();
datos[2]= (String) combo3.getSelectedItem();
datos[3]= caja1.getText();
datos[4]= String.valueOf(Double.parseDouble((String) combo3.getSelectedItem())* (Double.parseDouble(caja1.getText())));

objtabla.addRow(datos);

caja5.setText("");caja6.setText("");

for(int i=0;i<tabla.getRowCount();i++)
{
suma=suma+Double.parseDouble((String)tabla.getValueAt(i, 4));
}
for(int i=0;i<tabla.getRowCount();i++)
{
summa=summa+Double.parseDouble((String)tabla.getValueAt(i, 2));
}
caja5.setText(""+summa);
caja6.setText(""+suma);
caja1.setText("");
combo1.setSelectedIndex(-1);
combo2.setSelectedIndex(-1);
combo3.setSelectedIndex(-1);

    }//GEN-LAST:event_bagregarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
int fila;
double resta=0,ressta=0;
fila=tabla.getSelectedRow();
if(fila>=0)
{objtabla.removeRow(fila);}

for(int j=0;j<tabla.getRowCount();j++)  
{ressta=ressta+Double.parseDouble((String)tabla.getValueAt(j, 2));}
caja5.setText(""+ressta);

for(int j=0;j<tabla.getRowCount();j++) 
{resta=resta+Double.parseDouble((String)tabla.getValueAt(j, 4));}
caja6.setText(""+resta);

    }//GEN-LAST:event_beliminarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_bsalirActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(emivisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emivisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emivisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emivisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new emivisual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bsalir;
    private javax.swing.JButton bvalidar;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JTextField caja6;
    private javax.swing.JComboBox combo1;
    private javax.swing.JComboBox combo2;
    private javax.swing.JComboBox combo3;
    private javax.swing.JLabel etape;
    private javax.swing.JLabel etcant;
    private javax.swing.JLabel etcantt;
    private javax.swing.JLabel etedad;
    private javax.swing.JLabel etnom;
    private javax.swing.JLabel etprecio;
    private javax.swing.JLabel etprod;
    private javax.swing.JLabel etrubro;
    private javax.swing.JLabel ettotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
