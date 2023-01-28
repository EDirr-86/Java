
package pracremito;

import com.mysql.jdbc.ResultSetMetaData;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class LeeRemito extends javax.swing.JFrame {

public void validar(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++) {
    if (datos[i].toString().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
break;
} }} 

    DefaultTableModel objtabla = new DefaultTableModel();
    
    
    public LeeRemito() {
       initComponents();
               
              
       String titulos[]={"CANT","ARTICULO","PRECIO UNIT","SUB TOTAL"};
        
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
        
              
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        etx = new javax.swing.JLabel();
        etnumre = new javax.swing.JLabel();
        etfecha = new javax.swing.JLabel();
        etcuit = new javax.swing.JLabel();
        etIB = new javax.swing.JLabel();
        etinact = new javax.swing.JLabel();
        etremi = new javax.swing.JLabel();
        etiva = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etsr = new javax.swing.JLabel();
        etdom = new javax.swing.JLabel();
        etloc = new javax.swing.JLabel();
        etcuit2 = new javax.swing.JLabel();
        txtsr = new javax.swing.JTextField();
        txtdom = new javax.swing.JTextField();
        txtloc = new javax.swing.JTextField();
        txtcuit = new javax.swing.JTextField();
        etcp = new javax.swing.JLabel();
        txtcp = new javax.swing.JTextField();
        txttra = new javax.swing.JTextField();
        ettransp = new javax.swing.JLabel();
        etpago = new javax.swing.JLabel();
        txtpag = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txttot = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        bleer = new javax.swing.JButton();
        etfec = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrem = new javax.swing.JTextField();
        etresp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bleer1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Remito");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("DOCUMENTO NO VÁLIDO COMO FACTURA");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Pictures\\293116_269455739747841_6769500_n.jpg")); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setToolTipText("");
        jPanel4.setName("");

        etx.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        etx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etx.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etx)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        etnumre.setText("Numero de Remito:");

        etfecha.setText("Fecha:");

        etcuit.setText("C.U.I.T.: 30-71029282-1");

        etIB.setText("Ingr. Brutos: 1043676-07");

        etinact.setText("Inicio de Actividades: 09-08-2012");

        etremi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etremi.setText("REMITO");

        etiva.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        etiva.setText("I.V.A. RESPONSABLE MONOTRIBUTO");

        jLabel1.setText("____________________________________________________________________________________________________________________________");
        jLabel1.setOpaque(true);

        etsr.setText("Señor/es:");

        etdom.setText("Domicilio:");

        etloc.setText("Localidad:");

        etcuit2.setText("C.U.I.T.:");

        txtsr.setEditable(false);
        txtsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsrKeyTyped(evt);
            }
        });

        txtdom.setEditable(false);

        txtloc.setEditable(false);
        txtloc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocKeyTyped(evt);
            }
        });

        txtcuit.setEditable(false);
        txtcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuitKeyTyped(evt);
            }
        });

        etcp.setText("Cod. Postal:");

        txtcp.setEditable(false);
        txtcp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpKeyTyped(evt);
            }
        });

        txttra.setEditable(false);
        txttra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttraKeyTyped(evt);
            }
        });

        ettransp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ettransp.setText("Enviamos las mercaderías que detallamos por Transporte");
        ettransp.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        etpago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etpago.setText("Condiciones de Pago:");
        etpago.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtpag.setEditable(false);
        txtpag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpagKeyTyped(evt);
            }
        });

        jLabel2.setText("____________________________________________________________________________________________________________________________");
        jLabel2.setOpaque(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txttot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(2);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Imprenta: José Pérez y Cía. CUIT 30-55555555-5 \t\t\t\nFecha de Impresión 10/2000 Nº de Habilitación Municipal: 4321            \t\nTirada: Desde 0001-00000001 al 0001-00001000 \t\t\t");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel6.setText("____________________________________________________________________________________________________________________________");
        jLabel6.setOpaque(true);

        bleer.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Documents\\NetBeansProjects\\pracremito\\buscar.png")); // NOI18N
        bleer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleerActionPerformed(evt);
            }
        });

        etfec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etfec.setText("12-12-1212");

        jLabel7.setText("FIRMA DEL RECIBIDOR");

        txtrem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Responsabilidad:");

        bleer1.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Documents\\NetBeansProjects\\pracremito\\Volver.png")); // NOI18N
        bleer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleer1ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(etiva)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etremi)
                                        .addGap(106, 106, 106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(etnumre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtrem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bleer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bleer1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etcuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etinact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etfecha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(etfec, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(etIB))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(etcuit2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcuit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etloc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtloc)
                                        .addGap(16, 16, 16)
                                        .addComponent(etcp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcp))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etsr)
                                            .addComponent(etdom))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdom)
                                            .addComponent(txtsr))))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ettransp)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etpago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txttra)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etresp, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etremi)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etnumre)
                                    .addComponent(txtrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bleer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bleer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etfec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etcuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etIB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiva)
                    .addComponent(etinact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etresp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etsr)
                        .addComponent(txtsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etdom)
                            .addComponent(txtdom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etloc)
                            .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etcp)
                            .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etpago))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ettransp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etcuit2)
                    .addComponent(txtcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bleerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bleerActionPerformed


       try 
{
Conectar miconexion = new Conectar ();
String cons = "select * from remito where idremito = " + txtrem.getText();
ResultSet consulta =miconexion.consulta(cons);
if (consulta.last()==true)
{
txtrem.setText(consulta.getString(1));
etfec.setText(consulta.getString(2));
txtsr.setText(consulta.getString(3));
txtdom.setText(consulta.getString(4));
txtloc.setText(consulta.getString(5));
txtcp.setText(consulta.getString(6));
txtcuit.setText(consulta.getString(7));
txtpag.setText(consulta.getString(8));
txttra.setText(consulta.getString(9));
etresp.setText(consulta.getString(10));

cons = "select * from tabla_remito where idtrem = " + txtrem.getText();
                    consulta =miconexion.consulta(cons);
                    String datos[]=new String [4];
                    double total=0;
                    do 
                    {
                    consulta.next();      
                    datos[0]=String.valueOf(consulta.getString(2));
                    datos[1]=String.valueOf(consulta.getString(3));
                    datos[2]=String.valueOf(consulta.getString(4));
                    Double resultado = Double.parseDouble(consulta.getString(2)) * Double.parseDouble(consulta.getString(4));
                    total = total + resultado;
                    datos[3] = String.valueOf(resultado);
                    objtabla.addRow(datos);  
                    }
                    while (consulta.isLast()==false);  
                    txttot.setText(""+total);
}
else 
{
JOptionPane.showMessageDialog(null,"No se ha encontrado ningun remito!");
} 
}
catch (Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}


    }//GEN-LAST:event_bleerActionPerformed

    private void txtsrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrKeyReleased
      
    }//GEN-LAST:event_txtsrKeyReleased

    private void txtsrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrKeyTyped
   int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtsrKeyTyped

    private void txtcpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpKeyTyped
         int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 164 || k == 165) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcpKeyTyped

    private void txtlocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocKeyTyped
     int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_txtlocKeyTyped

    private void txtcuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuitKeyTyped
       int k = (int) evt.getKeyChar();
        if ((k > 47 && k < 58) || k==45 || k<32){} 
        else
        {    evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtcuitKeyTyped

    private void txtpagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagKeyTyped
     int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtpagKeyTyped

    private void txttraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttraKeyTyped
int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txttraKeyTyped

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          objtabla.setNumRows(tabla.getRowCount()+1);
    }//GEN-LAST:event_tablaKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void bleer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bleer1ActionPerformed
          
    inicio I1 = new inicio();
   I1.setVisible(true);
   I1.pack();
   
   this.dispose();
   
  
   // TODO add your handling code here:
    }//GEN-LAST:event_bleer1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
objtabla.getDataVector().clear();
tabla.repaint();
tabla.revalidate();

txtrem.setText("");
etfec.setText("");
txtsr.setText("");
txtdom.setText("");
txtloc.setText("");
txtcp.setText("");
txtcuit.setText("");
txtpag.setText("");
txttra.setText("");
etresp.setText("");
txttot.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(LeeRemito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeeRemito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeeRemito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeeRemito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LeeRemito().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bleer;
    private javax.swing.JButton bleer1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etIB;
    private javax.swing.JLabel etcp;
    private javax.swing.JLabel etcuit;
    private javax.swing.JLabel etcuit2;
    private javax.swing.JLabel etdom;
    private javax.swing.JLabel etfec;
    private javax.swing.JLabel etfecha;
    private javax.swing.JLabel etinact;
    private javax.swing.JLabel etiva;
    private javax.swing.JLabel etloc;
    private javax.swing.JLabel etnumre;
    private javax.swing.JLabel etpago;
    private javax.swing.JLabel etremi;
    private javax.swing.JLabel etresp;
    private javax.swing.JLabel etsr;
    private javax.swing.JLabel ettransp;
    private javax.swing.JLabel etx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtcuit;
    private javax.swing.JTextField txtdom;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtpag;
    private javax.swing.JTextField txtrem;
    private javax.swing.JTextField txtsr;
    private javax.swing.JTextField txttot;
    private javax.swing.JTextField txttra;
    // End of variables declaration//GEN-END:variables
}
