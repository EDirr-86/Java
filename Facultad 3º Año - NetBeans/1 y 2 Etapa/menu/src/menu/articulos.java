/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * articulos.java
 *
 * Created on 26-sep-2012, 15:43:01
 */
package menu;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Pepo
 */
public class articulos extends javax.swing.JDialog {

    /** Creates new form articulos */
    public articulos(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        textcantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textprecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre :");

        jLabel2.setText("Cantidad :");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textprecio)
                                .addComponent(textcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int valor=0;
     
try
{
    

Conectar miconexion = new Conectar (); 
//String cons = "select cantidad from stock where nombre = " + "'"+ textproducto.getText()+ "'";
String cons = "select productos.id_prod, stock.cantidad from productos inner join stock on stock.id_prod = productos.id_prod where productos.nombre = " + "'" + textnombre.getText()+ "'";
ResultSet consulta =miconexion.consulta(cons);



if (consulta.next())
{
  JOptionPane.showMessageDialog(null,"Este articulo ya existe"); 
 textnombre.setText(""); 
textcantidad.setText("");
textprecio.setText("");
textnombre.grabFocus(); 

/*valor=Integer.parseInt(consulta.getString(2));
valor=valor+Integer.parseInt(textcantidad.getText()); 
//String insertar = "update productos set cantidad = (?) where nombre = " + "'"+ textproducto.getText()+ "'"; 
String modificar = "update stock set cantidad = (?) where id_prod = "+ consulta.getString(1) ;
miconexion.psPrepararSentencias=miconexion.miconexion.prepareStatement(modificar);

miconexion.psPrepararSentencias.setString(1,String.valueOf(valor)); 
miconexion.psPrepararSentencias.executeUpdate();
JOptionPane.showMessageDialog(null, "Grabado");*/
}
else
{
    String valorid = "0"; 
    int valor1 = 0;
    String consid = "select id_prod from productos order by id_prod";
    ResultSet consultaid =miconexion.consulta(consid);
          if (consultaid.first())
            
            {
               consultaid.last();
                valorid = consultaid.getString(1);//.toString();            
            
            }
            
           valor1 = Integer.parseInt(valorid); 
           consultaid.close();
          
         String sentenciaInsert = "insert into productos values (?,?,?)";
         miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(sentenciaInsert);
         miconexion.psPrepararSentencias.setString(1,""+(valor1+1));
         miconexion.psPrepararSentencias.setString(2,textnombre.getText());
         miconexion.psPrepararSentencias.setString(3,textprecio.getText());
         
         
         miconexion.psPrepararSentencias.executeUpdate();
         
         
         String sentenciaInsert2 = "insert into stock values (?,?)";
         miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(sentenciaInsert2);
         miconexion.psPrepararSentencias.setString(1,""+(valor1+1));
         miconexion.psPrepararSentencias.setString(2,textcantidad.getText());
         miconexion.psPrepararSentencias.executeUpdate();
         JOptionPane.showMessageDialog(null,"Grabado!");
         this.dispose();
}
}

catch (Exception e)

{
JOptionPane.showMessageDialog(null, e.getMessage());

}

textnombre.setText(""); 
textcantidad.setText("");
textprecio.setText("");
textnombre.grabFocus();


// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 try
    {
        Conectar miconexion = new Conectar (); 
        
    String valorid = "0"; 
    int valor1 = 0;
    String consid = "select id_prod from stock order by id_prod";
    ResultSet consultaid =miconexion.consulta(consid);
          if (consultaid.first())
            
            {
               consultaid.last();
                valorid = consultaid.getString(1);//.toString();            
            
            }
            
           valor1 = Integer.parseInt(valorid)+1; 
           
           textnombre.grabFocus();
           consultaid.close();
    }
    
   catch (Exception e)

{
JOptionPane.showMessageDialog(null, e.getMessage());

}// TODO add your handling code here:
}//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                articulos dialog = new articulos(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textcantidad;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textprecio;
    // End of variables declaration//GEN-END:variables

    private String cons(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
