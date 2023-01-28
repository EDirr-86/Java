
package compra_stock_venta;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consulta extends javax.swing.JDialog {
DefaultTableModel objtabla = new DefaultTableModel();
    public consulta(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String titulos[]={"PRODUCTO","CANTIDAD"};
    objtabla.setColumnIdentifiers(titulos);
    tabla.setModel(objtabla);
             try 
        {
            Conectar miconexion = new Conectar ();
            String cons = "SELECT productos.nombre_pr Producto, stock_.cantidad Cantidad FROM productos JOIN stock_ ON productos.idprod = stock_.idprod";
            ResultSet consulta =miconexion.consulta(cons);
            consulta.next();
            
            ResultSetMetaData rmeta= (ResultSetMetaData) consulta.getMetaData();
            
            String datos[] = new String[rmeta.getColumnCount()];
            
            for (int i=0;i<consulta.getRow();i++)
            {    
                for (int j=0;j<rmeta.getColumnCount();j++)
                        {
                            datos[j] = consulta.getString(j+1);
                            datos[j] = consulta.getString(j+1);
                            datos[j] = consulta.getString(j+1);
                            datos[j] = consulta.getString(j+1);      
                        }
                consulta.next();
                objtabla.addRow(datos);
            }
            consulta.close();
        }
        catch (Exception e)
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                consulta dialog = new consulta(new javax.swing.JDialog(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
