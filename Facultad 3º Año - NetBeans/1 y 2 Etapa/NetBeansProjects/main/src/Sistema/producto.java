
package Sistema;

import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class producto extends javax.swing.JDialog {
DefaultListModel lista = new DefaultListModel();
libreria metodo = new libreria();
String operacion="";
int aux=0;

public void lista()
{
           try{ conexion miconexion = new conexion();
            String consprov = "select detalle_pr from producto where estado_pr='activo'";
            ResultSet consulta =miconexion.consulta(consprov);
            do{consulta.next();
            lista.addElement(consulta.getString(1));
            this.jListProductos.setModel(lista);
            }while (consulta.isLast()==false); }
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());} 
}

public void validarvacios(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++){
    if (datos[i].toString().isEmpty()){aux=1;}}}

    public void habilitarN()
   {this.txtnom.setEnabled(true);this.txtcan.setEnabled(true);this.txtmin.setEnabled(true);this.txtmax.setEnabled(true);this.jBtnGrabar.setEnabled(true);
this.jBtnImprimir.setEnabled(true);this.jTxaObs.setEnabled(true);jBtnBuscar.setEnabled(false);jBtnModificar.setEnabled(false);jBtnImagen1.setEnabled(true);
this.jListProductos.setEnabled(false);operacion="nuevo";}
    
    public void desabilitarN()
   {this.txtnom.setEnabled(false);this.txtcan.setEnabled(false);this.txtmin.setEnabled(false);this.txtmax.setEnabled(false);this.jBtnGrabar.setEnabled(false);
this.jBtnImprimir.setEnabled(false);this.jTxaObs.setEnabled(false);jBtnBuscar.setEnabled(true);this.jListProductos.setEnabled(true);operacion="";jBtnImagen1.setEnabled(false);}
   
    public void habilitarM()
   {this.txtnom.setEnabled(true);this.txtcan.setEnabled(true);this.txtmin.setEnabled(true);this.txtmax.setEnabled(true);this.jBtnGrabar.setEnabled(true);
this.jBtnImprimir.setEnabled(true);this.jTxaObs.setEnabled(true);jBtnBuscar.setEnabled(false);jBtnNuevo.setEnabled(false);
operacion="editar";jBtnImagen1.setEnabled(true);}
   
   public void desabilitarM()
   {this.txtnom.setEnabled(false);this.txtcan.setEnabled(false);this.txtnom.setEnabled(false);this.txtmin.setEnabled(false);this.txtmax.setEnabled(false);
   this.jBtnGrabar.setEnabled(false);this.jBtnImprimir.setEnabled(false);this.jTxaObs.setEnabled(false);jBtnBuscar.setEnabled(true);jBtnNuevo.setEnabled(true);
this.jBtnModificar.setEnabled(false);this.jBtnEliminar.setEnabled(false);operacion="";jBtnImagen1.setEnabled(false);}
      
   public void habilitarB()
   {this.txtfiltro.setEnabled(true);this.txtfiltro.setText("");this.jBtnModificar.setEnabled(true);this.jBtnEliminar.setEnabled(true);}
   
   public void desabilitarL()
   {this.txtfiltro.setEnabled(false);this.txtfiltro.setText("Nombre del producto");this.jBtnModificar.setEnabled(false);this.jBtnEliminar.setEnabled(false);
   this.jBtnGrabar.setEnabled(false);this.jBtnBuscar.setEnabled(true);this.jBtnImprimir.setEnabled(false);this.jBtnNuevo.setEnabled(true);
   this.txtnom.setEnabled(false);this.txtcan.setEnabled(false);this.txtmin.setEnabled(false);this.txtmax.setEnabled(false);this.jTxaObs.setEnabled(false);
   jBtnImagen1.setEnabled(false);}   
      
   public void limpiar()
   {this.txtnom.setText("");this.txtcan.setText("");this.txtnom.setText("");this.txtmin.setText("");this.txtmax.setText("");this.jTxaObs.setText("");this.etidbd.setText("");
   this.jLblImagen1.setIcon(null);}
   
   
    public producto(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jBtnImprimir = new javax.swing.JButton();
        jBtnBuscar = new javax.swing.JButton();
        jBtnGrabar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnNuevo = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProductos = new javax.swing.JList();
        txtfiltro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        etid = new javax.swing.JLabel();
        etnom = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        etcan = new javax.swing.JLabel();
        txtcan = new javax.swing.JTextField();
        etmin = new javax.swing.JLabel();
        etmax = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxaObs = new javax.swing.JTextArea();
        etobs = new javax.swing.JLabel();
        jBtnImagen1 = new javax.swing.JButton();
        jLblImagen1 = new javax.swing.JLabel();
        etidbd = new javax.swing.JLabel();
        txtmin = new javax.swing.JTextField();
        txtmax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Producto");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/print.gif"))); // NOI18N
        jBtnImprimir.setText("Imprimir");
        jBtnImprimir.setEnabled(false);

        jBtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/search.jpg"))); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnGrabar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/save.png"))); // NOI18N
        jBtnGrabar.setText("Grabar");
        jBtnGrabar.setEnabled(false);
        jBtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGrabarActionPerformed(evt);
            }
        });

        jBtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/exit.png"))); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/delete.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/edit.gif"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.setEnabled(false);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/new.png"))); // NOI18N
        jBtnNuevo.setText("NUEVO PRODUCTO");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        jBtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/clear.png"))); // NOI18N
        jBtnLimpiar.setText("LIMPIAR ENTRADAS");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jBtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jBtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSalir)
                    .addComponent(jBtnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jListProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListProductosMousePressed(evt);
            }
        });
        jListProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListProductosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListProductos);

        txtfiltro.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtfiltro.setText("Nombre del producto");
        txtfiltro.setEnabled(false);
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
            .addComponent(txtfiltro)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARACTERÍSTICAS DEL PRODUCTO: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        etid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etid.setText("Codigo:");

        etnom.setText("Nombre:");

        txtnom.setEnabled(false);

        etcan.setText("Cantidad:");

        txtcan.setEnabled(false);

        etmin.setText("Stk. Mínimo:");

        etmax.setText("Stk. Máximo:");

        jTxaObs.setColumns(20);
        jTxaObs.setRows(5);
        jTxaObs.setEnabled(false);
        jScrollPane3.setViewportView(jTxaObs);

        etobs.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etobs.setText("Especificaciones:");

        jBtnImagen1.setText("IMAGEN");
        jBtnImagen1.setEnabled(false);
        jBtnImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImagen1ActionPerformed(evt);
            }
        });

        etidbd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etidbd.setForeground(new java.awt.Color(255, 0, 0));

        txtmin.setEnabled(false);

        txtmax.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etnom)
                    .addComponent(etmin)
                    .addComponent(etcan)
                    .addComponent(etid)
                    .addComponent(etmax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etidbd, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtmin)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtmax))
                    .addComponent(txtcan)
                    .addComponent(txtnom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etobs)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBtnImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(etobs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etid)
                            .addComponent(etidbd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etnom)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etcan)
                            .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(etmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etmax))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnImagen1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
habilitarB();        
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGrabarActionPerformed
if(operacion=="nuevo"){
        try
        {
        conexion miconexion = new conexion();
        String insert = "insert into producto values (?,?,?,?,?,?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
        Object[] datos={etidbd.getText(),txtnom.getText(),txtcan.getText(),txtmin.getText(),txtmax.getText(),jTxaObs.getText()};                     
        validarvacios(datos);
        
        if(aux != 1){
                 if(metodo.validarnumeros(txtcan.getText())){
                    if(metodo.validarnumeros(txtmin.getText())){
                        if(metodo.validarnumeros(txtmin.getText())){
                            miconexion.psPrepararSentencias.setString(1, etidbd.getText());
                            miconexion.psPrepararSentencias.setString(2, txtnom.getText());
                            miconexion.psPrepararSentencias.setString(3, txtcan.getText());
                            miconexion.psPrepararSentencias.setString(4, txtmin.getText());
                            miconexion.psPrepararSentencias.setString(5, txtmax.getText());
                            miconexion.psPrepararSentencias.setString(6, jTxaObs.getText());
                            miconexion.psPrepararSentencias.setString(7, String.valueOf(jLblImagen1.getIcon()));
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
            String cons = "update producto set detalle_pr =(?),cantidad_pr =(?),stkmin_pr =(?),stkmax_pr =(?),obser_pro =(?),imagen_pr=(?)"
                    + " where idprod= '"+ etidbd.getText() + "'";
                miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(cons);

                miconexion.psPrepararSentencias.setString(1, String.valueOf(txtnom.getText()));
                miconexion.psPrepararSentencias.setString(2, String.valueOf(txtcan.getText()));
                miconexion.psPrepararSentencias.setString(3, String.valueOf(txtmin.getText()));
                miconexion.psPrepararSentencias.setString(4, String.valueOf(txtmax.getText()));
                miconexion.psPrepararSentencias.setString(5, String.valueOf(jTxaObs.getText()));
                miconexion.psPrepararSentencias.setString(6, String.valueOf(this.jLblImagen1.getIcon()));
                miconexion.psPrepararSentencias.executeUpdate();
                
                limpiar();
                desabilitarM();                
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }       
    }//GEN-LAST:event_jBtnGrabarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
int index = this.jListProductos.getSelectedIndex();
int seleccion = JOptionPane.showOptionDialog(
    this, // Componente padre
    "¿Esta seguro en eliminar a este producto / "+jListProductos.getSelectedValue(), //Mensaje
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
            String cons = "update producto set estado_pr =(?) where idprod= "+ etidbd.getText();
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

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
if(jListProductos.getSelectedValue().toString()!= null)
       {habilitarM();}        
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jListProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListProductosKeyPressed
           if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jListProductos.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane,"No hay un nombre seleccionado");
               
            } else {
                String nombre = jListProductos.getSelectedValue().toString();
                jListProductos.requestFocus();
                }
            }
    }//GEN-LAST:event_jListProductosKeyPressed

    private void jBtnImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImagen1ActionPerformed
        //Crea un filtro
FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg","gif");
//se crea el filechooser
JFileChooser fileChooser = new JFileChooser();
//se añade el filtro
fileChooser.setFileFilter(filter);
//titulo de la ventana
fileChooser.setDialogTitle("Seleccione el producto...");
//se crea un file donde se especifica  la ruta de destino
File ruta = new File("/src/Recursos_visuales");
int result = fileChooser.showOpenDialog(null);
if(result == JFileChooser.APPROVE_OPTION){
File file= fileChooser.getSelectedFile();
//jTextField1.setText(String.valueOf(file));
ImageIcon fot = new ImageIcon(String.valueOf(file));
Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLblImagen1.getWidth(), jLblImagen1.getHeight(), Image.SCALE_DEFAULT));
jLblImagen1.setIcon(icono);
this.repaint();
}
    }//GEN-LAST:event_jBtnImagen1ActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
              try {
                conexion miconexion = new conexion();
                String cons = "SELECT MAX( (idprod) +1 )FROM producto";
                ResultSet consulta = miconexion.consulta(cons);
                consulta.next();
                if (consulta.getString(1) == null) {
                    etidbd.setText("" + 1);
                } else {
                    etidbd.setText("" + consulta.getString(1));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"La operacion no se puede realizar, asegurece de limpiar las entradas");
            }

            habilitarN();
        
}//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        limpiar();
        if (jBtnModificar.isEnabled() && jBtnEliminar.isEnabled() || this.txtfiltro.isEnabled()) {
            desabilitarL();
            lista.removeAllElements();
            this.jListProductos.setModel(lista);
            this.jListProductos.repaint();
            lista();
        } else {
            desabilitarN();
          }
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jListProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProductosMousePressed
try 
{
conexion miconexion = new conexion ();
String cons = "select * from producto where detalle_pr = '"+(String)jListProductos.getSelectedValue()+"'";
ResultSet consulta =miconexion.consulta(cons);
if (consulta.last()==true)
{
etidbd.setText(""+consulta.getString(1));
txtnom.setText(""+consulta.getString(2));
txtcan.setText(""+consulta.getString(3));
txtmin.setText(""+consulta.getString(4));
txtmax.setText(""+consulta.getString(5));
jTxaObs.setText(""+consulta.getString(6));
ImageIcon fot = new ImageIcon(String.valueOf(consulta.getString(7)));
Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLblImagen1.getWidth(), jLblImagen1.getHeight(), Image.SCALE_DEFAULT));
jLblImagen1.setIcon(icono);
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
    }//GEN-LAST:event_jListProductosMousePressed

    private void txtfiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyReleased
 lista.removeAllElements();
        this.jListProductos.setModel(lista);
        this.jListProductos.repaint(); 
        try 
        {
            conexion miconexion = new conexion ();
            String cons = "select * from producto where detalle_pr LIKE  '%"+this.txtfiltro.getText()+"%' and estado_pr = 'activo'";
            ResultSet consulta =miconexion.consulta(cons);
            do{consulta.next();
            lista.addElement(consulta.getString(1+1));
            this.jListProductos.setModel(lista);
            }while (consulta.isLast()==false);
        
            consulta.close();}
    catch (Exception e)
        {
         JOptionPane.showMessageDialog(null, "El producto no existe");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiltroKeyReleased

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                producto dialog = new producto(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel etcan;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etidbd;
    private javax.swing.JLabel etmax;
    private javax.swing.JLabel etmin;
    private javax.swing.JLabel etnom;
    private javax.swing.JLabel etobs;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGrabar;
    private javax.swing.JButton jBtnImagen1;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblImagen1;
    private javax.swing.JList jListProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTxaObs;
    private javax.swing.JTextField txtcan;
    private javax.swing.JTextField txtfiltro;
    private javax.swing.JTextField txtmax;
    private javax.swing.JTextField txtmin;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
