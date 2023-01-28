
package compra_stock_venta;

import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class abm extends javax.swing.JDialog {
int aux=0;
String ope;

    
public void validar(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++) {
    if (datos[i].toString().isEmpty()) {
        if(chkest.isSelected()==false)
        {JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");aux=1;}
        
    }   
}
 }
 libreria metodo = new libreria();
    
 public abm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        buttonGroup1 = new javax.swing.ButtonGroup();
        idtext = new javax.swing.JTextField();
        nomtext = new javax.swing.JTextField();
        barra1 = new javax.swing.JScrollBar();
        etid = new javax.swing.JLabel();
        etnom = new javax.swing.JLabel();
        chkest = new javax.swing.JCheckBox();
        baceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        idtext.setEditable(false);

        barra1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        barra1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                barra1AdjustmentValueChanged(evt);
            }
        });

        etid.setText("ID");

        etnom.setText("NOMBRE");

        buttonGroup1.add(chkest);
        chkest.setText("Activo");

        baceptar.setText("Aceptar");
        baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baceptarActionPerformed(evt);
            }
        });

        jButton2.setText("Elimino");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(baceptar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etnom)
                                    .addComponent(etid))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkest)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idtext, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(nomtext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(53, 53, 53)
                                .addComponent(modificar)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2))
                            .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etid)
                        .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etnom)
                    .addComponent(nomtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(chkest)
                .addGap(8, 8, 8)
                .addComponent(baceptar)
                .addGap(16, 16, 16)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(modificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
    if(ope=="nuevo")  
    {  try
            {
        
             Conectar miconexion = new Conectar ();
             String cons = "SELECT MAX( (idprod) +1 )FROM productos";
             ResultSet consulta =miconexion.consulta(cons);
             consulta.next();
        
                if (consulta.getString(1)==null){
                    idtext.setText(""+1);}
                else
             idtext.setText(""+consulta.getString(1));
        
        
             String insert = "insert into productos values (?,?,?)";
             miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
             Object[] datos={idtext.getText(),nomtext.getText()};                     
       
             validar(datos);
        
                if(aux != 1){
                    if(metodo.validarletras(nomtext.getText())){
                            miconexion.psPrepararSentencias.setString(1, idtext.getText());
                            miconexion.psPrepararSentencias.setString(2, nomtext.getText());
                                      
                            miconexion.psPrepararSentencias.setString(3, "alta");
                            aux=0;
                                                                   
                            nomtext.setText("");
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
        }ope="";}
    else 
    {try {

            Conectar miconexion = new Conectar();
            String cons = "update productos set nombre_pr =(?) where idprod= '"+ idtext.getText() + "'";
           // ResultSet consulta = miconexion.consulta(cons);
            //consulta.next(); solo para traer datos de la base
                miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(cons);

                miconexion.psPrepararSentencias.setString(1, String.valueOf(nomtext.getText()));
               /* if(estado.getText()=="alta")
                miconexion.psPrepararSentencias.setString(3, "alta");
                else
                miconexion.psPrepararSentencias.setString(3, "baja");*/
                
                miconexion.psPrepararSentencias.executeUpdate();
            



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }ope="";}  
        
    }//GEN-LAST:event_baceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        try {

            Conectar miconexion = new Conectar();
            String cons = "update productos set estado_pr=(?) where idprod= '"+ idtext.getText() + "'";
           // ResultSet consulta = miconexion.consulta(cons);
            //consulta.next();
                miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(cons);

                miconexion.psPrepararSentencias.setString(1, "baja");
                
                miconexion.psPrepararSentencias.executeUpdate();
            



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

        nomtext.setText("");
        idtext.setText("");  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      baceptar.enable(true);
        try
        {
        
             Conectar miconexion = new Conectar ();
        String cons = "SELECT MAX( (idprod) +1 )FROM productos";
        ResultSet consulta =miconexion.consulta(cons);
        consulta.next();
        if (consulta.getString(1)==null){
            idtext.setText(""+1);
        }
        else
        idtext.setText(""+consulta.getString(1));
        }
     catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
     nomtext.setText("");
   
     ope = "nuevo";
    }//GEN-LAST:event_jButton3ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
barra1.enable(true);
ope="modificar";  
try
        { Conectar miconexion=new Conectar();
          String cons="select * from productos";
          ResultSet consulta=miconexion.consulta(cons);
          consulta.last();
          barra1.setValues(1, 1, 1,consulta.getRow()+1);
          consulta.first();
                   }
        catch (Exception e)
             {
              JOptionPane.showMessageDialog(null, e.getCause());
             }
    
    }//GEN-LAST:event_modificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
     barra1.enable(false);
    

           // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void barra1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_barra1AdjustmentValueChanged
       try
    { Conectar miconexion=new Conectar();
      String cons="select * from productos";
      ResultSet consulta = miconexion.consulta(cons);
      consulta.next();
      consulta.absolute(barra1.getValue());
      idtext.setText(consulta.getString(1));
      nomtext.setText(consulta.getString(2));
      if(   "alta".equals(consulta.getString(3))) // equals es para comparar texto
      { chkest.setText("Activado");
          chkest.setSelected(true);}
      else 
      {
       chkest.setText("Desactivado");
      }
    }
      catch (Exception e)
             {
              JOptionPane.showMessageDialog(null, e.getCause());
             }    
           // TODO add your handling code here:
    }//GEN-LAST:event_barra1AdjustmentValueChanged

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                abm dialog = new abm(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton baceptar;
    private javax.swing.JScrollBar barra1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkest;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etnom;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nomtext;
    // End of variables declaration//GEN-END:variables
}
