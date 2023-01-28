
package Sistema;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * 
 * @author emi
 */
public class proveedor extends javax.swing.JDialog {
DefaultListModel lista = new DefaultListModel();
libreria metodo = new libreria();
String operacion="";
int aux;

/**
 * 
 */
public void lista()
{
           try{ conexion miconexion = new conexion();
            String consprov = "select nombre_pro from proveedores where estado_pro='activo'";
            ResultSet consulta =miconexion.consulta(consprov);
            do{consulta.next();
            lista.addElement(consulta.getString(1));
            this.jListProveedor.setModel(lista);
            }while (consulta.isLast()==false); }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());} 
}

/**
 * 
 * @param datos
 */
public void validarvacios(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++){
    if (datos[i].toString().isEmpty()){
        if(cmbiva.getSelectedIndex()==0){;aux=1;}}}}

    /**
     * 
     */
    public void habilitarN()
   {this.txtcuit.setEnabled(true);this.txtdir.setEnabled(true);this.txtnom.setEnabled(true);this.txttel.setEnabled(true);this.jBtnGrabar.setEnabled(true);
this.jBtnImprimir.setEnabled(true);this.cmbiva.setEnabled(true);this.jTxaObs.setEnabled(true);jBtnBuscar.setEnabled(false);jBtnModificar.setEnabled(false);
this.jListProveedor.setEnabled(false);operacion="nuevo";}
    /**
     * 
     */
    public void desabilitarN()
   {this.txtcuit.setEnabled(false);this.txtdir.setEnabled(false);this.txtnom.setEnabled(false);this.txttel.setEnabled(false);this.jBtnGrabar.setEnabled(false);
this.jBtnImprimir.setEnabled(false);this.cmbiva.setSelectedIndex(0);this.cmbiva.setEnabled(false);this.jTxaObs.setEnabled(false);jBtnBuscar.setEnabled(true);
this.jListProveedor.setEnabled(true);operacion="";}
   
    /**
     * 
     */
    public void habilitarM()
   {this.txtcuit.setEnabled(true);this.txtdir.setEnabled(true);this.txtnom.setEnabled(true);this.txttel.setEnabled(true);this.jBtnGrabar.setEnabled(true);
this.jBtnImprimir.setEnabled(true);this.cmbiva.setEnabled(true);this.jTxaObs.setEnabled(true);jBtnBuscar.setEnabled(false);jBtnNuevo.setEnabled(false);
operacion="editar";}
   /**
    * 
    */
   public void desabilitarM()
   {this.txtcuit.setEnabled(false);this.txtdir.setEnabled(false);this.txtnom.setEnabled(false);this.txttel.setEnabled(false);this.jBtnGrabar.setEnabled(false);
this.jBtnImprimir.setEnabled(false);this.cmbiva.setEnabled(false);this.jTxaObs.setEnabled(false);jBtnBuscar.setEnabled(true);jBtnNuevo.setEnabled(true);
this.jBtnModificar.setEnabled(false);this.jBtnEliminar.setEnabled(false);operacion="";}
           
   /**
    * 
    */
   public void habilitarB()
   {this.txtfiltro.setEnabled(true);this.txtfiltro.setText("");this.jBtnModificar.setEnabled(true);this.jBtnEliminar.setEnabled(true);}

   /**
    * 
    */
   public void desabilitarL()
   {this.txtfiltro.setEnabled(false);this.txtfiltro.setText("Nombre proveedor");this.jBtnModificar.setEnabled(false);this.jBtnEliminar.setEnabled(false);}   
   
   /**
    * 
    */
   public void limpiar()
   {this.txtcuit.setText("");this.txtdir.setText("");this.txtnom.setText("");this.txttel.setText("");this.cmbiva.setSelectedIndex(0);
        this.jTxaObs.setText("");this.etidbd.setText("");}
   
   
   /**
    * 
    * @param parent
    * @param modal
    */
   public proveedor(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
     
        try 
        {
            conexion miconexion = new conexion();            
            String consiva = "select descripcion_iva from condicioniva";
            ResultSet consulta =miconexion.consulta(consiva);
            do{consulta.next();
            this.cmbiva.addItem(consulta.getString(1));
            }while (consulta.isLast()==false); consulta.close();
            
            lista();
        }
        catch (Exception e)
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnImprimir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListProveedor = new javax.swing.JList();
        jBtnGrabar = new javax.swing.JButton();
        jBtnBuscar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etid = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        etnom = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        etdir = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        ettel = new javax.swing.JLabel();
        etcuit = new javax.swing.JLabel();
        txtcuit = new javax.swing.JTextField();
        etiva = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxaObs = new javax.swing.JTextArea();
        cmbiva = new javax.swing.JComboBox();
        etidbd = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedor");

        txtfiltro.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtfiltro.setText("Nombre proveedor");
        txtfiltro.setEnabled(false);
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfiltroKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROVEEDORES:");

        jBtnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/print.gif"))); // NOI18N
        jBtnImprimir.setText("IMPRIMIR");
        jBtnImprimir.setEnabled(false);

        jListProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListProveedorMousePressed(evt);
            }
        });
        jListProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListProveedorKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jListProveedor);

        jBtnGrabar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/save.png"))); // NOI18N
        jBtnGrabar.setText("GRABAR");
        jBtnGrabar.setEnabled(false);
        jBtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGrabarActionPerformed(evt);
            }
        });

        jBtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/search.jpg"))); // NOI18N
        jBtnBuscar.setText("BUSCAR");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/edit.gif"))); // NOI18N
        jBtnModificar.setText("EDITAR");
        jBtnModificar.setEnabled(false);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/delete.png"))); // NOI18N
        jBtnEliminar.setText("ELIMINAR");
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/exit.png"))); // NOI18N
        jBtnSalir.setText("SALIR");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PROVEEDOR ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        etid.setText("Codigo:");

        txtnom.setEnabled(false);

        etnom.setText("Nombre:");

        txtdir.setEnabled(false);
        txtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdirKeyPressed(evt);
            }
        });

        etdir.setText("Dirección:");

        txttel.setEnabled(false);
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelKeyPressed(evt);
            }
        });

        ettel.setText("Teléfono:");

        etcuit.setText("C.U.I.T");

        txtcuit.setEnabled(false);
        txtcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuitKeyPressed(evt);
            }
        });

        etiva.setText("Condicion Tributaria");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACIONES: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTxaObs.setColumns(20);
        jTxaObs.setRows(5);
        jTxaObs.setEnabled(false);
        jScrollPane2.setViewportView(jTxaObs);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );

        cmbiva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------Seleccione-------------" }));
        cmbiva.setEnabled(false);
        cmbiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbivaKeyPressed(evt);
            }
        });

        etidbd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etidbd.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etnom)
                            .addComponent(etid)
                            .addComponent(etdir)
                            .addComponent(ettel)
                            .addComponent(etcuit))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcuit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(txttel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdir, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etidbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbiva, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etid)
                            .addComponent(etidbd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etnom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etdir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ettel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etcuit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiva)
                            .addComponent(cmbiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/clear.png"))); // NOI18N
        jBtnLimpiar.setText("LIMPIAR ENTRADAS");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/new.png"))); // NOI18N
        jBtnNuevo.setText("NUEVO PROVEEDOR");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnGrabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnModificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnImprimir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnSalir))
                            .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnNuevo)
                            .addComponent(jBtnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListProveedorKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jListProveedor.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane,"No hay un nombre seleccionado");
               
            } else {
                String nombre = jListProveedor.getSelectedValue().toString();
                jListProveedor.requestFocus();
                }
            }
        
    }//GEN-LAST:event_jListProveedorKeyPressed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
habilitarB(); 

    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
       if(jListProveedor.getSelectedValue().toString()!= null)
       {habilitarM();}
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
int index = this.jListProveedor.getSelectedIndex();
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Esta seguro en eliminar a este proveedor / "+jListProveedor.getSelectedValue(), //Mensaje
    "Seleccione una opción", // Título
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,    // null para icono por defecto.
    new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
    "Si");
        
if (seleccion != -1)
{
   if((seleccion + 1)==1)
   {
      try {
            conexion miconexion = new conexion();
            String cons = "update proveedores set estado_pro =(?) where idproveedor= "+ etidbd.getText();
            miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(cons);

            miconexion.psPrepararSentencias.setString(1, "noactivo");
            miconexion.psPrepararSentencias.executeUpdate();
            if(index>=0){lista.remove(index);}
            JOptionPane.showMessageDialog(null, "Los datos han sido borrados correctamente");}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
        desabilitarM(); 
   }
   else
   {}
}
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void txtdirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txttel.requestFocus();// TODO add your handling code here:
        }     }//GEN-LAST:event_txtdirKeyPressed

    private void txttelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtcuit.requestFocus();// TODO add your handling code here:
        }     }//GEN-LAST:event_txttelKeyPressed

    private void txtcuitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuitKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cmbiva.requestFocus();// TODO add your handling code here:
        }     }//GEN-LAST:event_txtcuitKeyPressed

    private void cmbivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbivaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
           jTxaObs.requestFocus();        // TODO add your handling code here:
        }     }//GEN-LAST:event_cmbivaKeyPressed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
limpiar();
if(jBtnModificar.isEnabled()&&jBtnEliminar.isEnabled()||txtfiltro.isEnabled()){
desabilitarL();
lista.removeAllElements();
this.jListProveedor.setModel(lista);
this.jListProveedor.repaint(); 
lista();
}
else{desabilitarN();}
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
    Object[] datos={etidbd.getText(),txtnom.getText(),txtdir.getText(),txttel.getText(),txtcuit.getText(),jTxaObs.getText()};                     
       
        validarvacios(datos);
        if(aux==1){
        try
        {
        conexion miconexion = new conexion ();
        String cons = "SELECT MAX( (idproveedor) +1 )FROM proveedores";
        ResultSet consulta =miconexion.consulta(cons);
        consulta.next();
        if (consulta.getString(1)==null){etidbd.setText(""+1);}
        else
        etidbd.setText(""+consulta.getString(1));
        }
        catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}

        habilitarN();
        }
        else
        JOptionPane.showMessageDialog(null,"La operacion no se puede realizar, asegurece de limpiar las entradas");    
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGrabarActionPerformed
        if(operacion=="nuevo"){
        try
        {
        conexion miconexion = new conexion();
        String insert = "insert into proveedores values (?,?,?,?,?,?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
        Object[] datos={etidbd.getText(),txtnom.getText(),txtdir.getText(),txttel.getText(),txtcuit.getText(),jTxaObs.getText()};                     
        validarvacios(datos);
        
        if(aux != 1){
            if(metodo.validarletras(txtnom.getText())){
                if(metodo.validarnumeros(txttel.getText())){
                    if(metodo.validarnumeros(txtcuit.getText())){
                            miconexion.psPrepararSentencias.setString(1, etidbd.getText());
                            miconexion.psPrepararSentencias.setString(2, txtnom.getText());
                            miconexion.psPrepararSentencias.setString(3, txtdir.getText());
                            miconexion.psPrepararSentencias.setString(4, txttel.getText());
                            miconexion.psPrepararSentencias.setString(5, txtcuit.getText());
                            miconexion.psPrepararSentencias.setString(6, String.valueOf(cmbiva.getSelectedIndex()));
                            miconexion.psPrepararSentencias.setString(7, jTxaObs.getText());
                            miconexion.psPrepararSentencias.setString(8, "activo");
                            miconexion.psPrepararSentencias.executeUpdate();     
                            
                            JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
                            limpiar();
                            desabilitarN();}
                    else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");}
                else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");}
            else
                            JOptionPane.showMessageDialog(null, "Valores ingresados no permitidos");}
        else
                            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");                       
        }         
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }}
        else if(operacion=="editar"){
        try {

            conexion miconexion = new conexion();
            String cons = "update proveedores set nombre_pro =(?),direccion_pro =(?),telefono_pro =(?),cuit_pro =(?),idiva =(?),obser_pro =(?)"
                    + " where idproveedor= '"+ etidbd.getText() + "'";
                miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(cons);

                miconexion.psPrepararSentencias.setString(1, String.valueOf(txtnom.getText()));
                miconexion.psPrepararSentencias.setString(2, String.valueOf(txtdir.getText()));
                miconexion.psPrepararSentencias.setString(3, String.valueOf(txttel.getText()));
                miconexion.psPrepararSentencias.setString(4, String.valueOf(txtcuit.getText()));
                miconexion.psPrepararSentencias.setInt(5, cmbiva.getSelectedIndex());
                miconexion.psPrepararSentencias.setString(6, String.valueOf(jTxaObs.getText()));
                miconexion.psPrepararSentencias.executeUpdate();
                
                limpiar();
                desabilitarM();                
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_jBtnGrabarActionPerformed

    private void jListProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProveedorMousePressed

try 
{
conexion miconexion = new conexion ();
String cons = "select * from proveedores where nombre_pro = '"+(String)jListProveedor.getSelectedValue()+"'";
ResultSet consulta =miconexion.consulta(cons);
if (consulta.last()==true)
{
etidbd.setText(""+consulta.getString(1));
txtnom.setText(""+consulta.getString(2));
txtdir.setText(""+consulta.getString(3));
txttel.setText(""+consulta.getString(4));
txtcuit.setText(""+consulta.getString(5));
cmbiva.setSelectedIndex(consulta.getInt(6));
jTxaObs.setText(""+consulta.getString(7));
jBtnEliminar.setEnabled(true);
jBtnModificar.setEnabled(true);
}
else 
{
JOptionPane.showMessageDialog(null,"No se puede realizar esta accion");
} 
}
catch (Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_jListProveedorMousePressed

    private void txtfiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyReleased
        lista.removeAllElements();
        this.jListProveedor.setModel(lista);
        this.jListProveedor.repaint(); 
        try 
        {
            conexion miconexion = new conexion ();
            String cons = "select * from proveedores where nombre_pro LIKE  '%"+this.txtfiltro.getText()+"%' and estado_pro = 'activo'";
            ResultSet consulta =miconexion.consulta(cons);
            do{consulta.next();
            lista.addElement(consulta.getString(1+1));
            this.jListProveedor.setModel(lista);
            }while (consulta.isLast()==false);
        
            consulta.close();}
    catch (Exception e)
        {
         JOptionPane.showMessageDialog(null, "El proveedor no existe");
        }
    }//GEN-LAST:event_txtfiltroKeyReleased
        
   
    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                proveedor dialog = new proveedor(new javax.swing.JDialog(),true);
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
    private javax.swing.JComboBox cmbiva;
    private javax.swing.JLabel etcuit;
    private javax.swing.JLabel etdir;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etidbd;
    private javax.swing.JLabel etiva;
    private javax.swing.JLabel etnom;
    private javax.swing.JLabel ettel;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGrabar;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jListProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTxaObs;
    private javax.swing.JTextField txtcuit;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtfiltro;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

    private void Imprimir_Datos(int p) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
