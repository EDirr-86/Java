/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pracremito;

import com.mysql.jdbc.ResultSetMetaData;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Remito extends javax.swing.JDialog {

       

public void validar(Object[] datos) {
for (int i = 0; i <= datos.length - 1; i++) {
    if (datos[i].toString().isEmpty()) {
        if(chcf.isSelected()==false && che.isSelected()==false && chnr.isSelected()==false && chri.isSelected()==false && chrm.isSelected()==false)
               JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
break;
} }} 

    DefaultTableModel objtabla = new DefaultTableModel();
    
    libreria metodo = new libreria();
    
    public Remito(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Calendar cal=Calendar.getInstance(); 
        int dd=cal.get(cal.DATE);
        int mm=cal.get(cal.MONTH)+1;     
        int aa=cal.get(cal.YEAR); 
        etfec.setText(dd+"/"+mm+"/"+aa);
       
       String titulos[]={"CANT","ARTICULO","PRECIO UNIT","SUB TOTAL"};
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
        
        try
        {
        Conectar miconexion = new Conectar ();
        String cons = "SELECT MAX( (idremito) +1 )FROM remito";
        ResultSet consulta =miconexion.consulta(cons);
        consulta.next();
        etnrem.setText(consulta.getString(1));
           
        }
        
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        etcuit2 = new javax.swing.JLabel();
        txtsr = new javax.swing.JTextField();
        chcf = new javax.swing.JCheckBox();
        etdom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etloc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etsr = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        etremi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        etiva = new javax.swing.JLabel();
        txtcuit = new javax.swing.JTextField();
        txtloc = new javax.swing.JTextField();
        etfec = new javax.swing.JLabel();
        bguardar = new javax.swing.JButton();
        etnrem = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bleer1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        etcp = new javax.swing.JLabel();
        txtcp = new javax.swing.JTextField();
        txttra = new javax.swing.JTextField();
        ettransp = new javax.swing.JLabel();
        etpago = new javax.swing.JLabel();
        txtpag = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chri = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        etinact = new javax.swing.JLabel();
        chrm = new javax.swing.JCheckBox();
        etfecha = new javax.swing.JLabel();
        etnumre = new javax.swing.JLabel();
        chnr = new javax.swing.JCheckBox();
        che = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        etx = new javax.swing.JLabel();
        etIB = new javax.swing.JLabel();
        etcuit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        beliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setCellSelectionEnabled(true);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        etcuit2.setText("C.U.I.T.:");

        txtsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsrKeyTyped(evt);
            }
        });

        chcf.setText("Cons. Final ");
        chcf.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        etdom.setText("Domicilio:");

        jLabel3.setText("____________________________________________________________________________________________________________________________");
        jLabel3.setOpaque(true);

        etloc.setText("Localidad:");

        jLabel1.setText("____________________________________________________________________________________________________________________________");
        jLabel1.setOpaque(true);

        etsr.setText("Señor/es:");

        txttot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etremi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etremi.setText("REMITO");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(2);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Imprenta: José Pérez y Cía. CUIT 30-55555555-5 \t\t\t\nFecha de Impresión 10/2000 Nº de Habilitación Municipal: 4321            \t\nTirada: Desde 0001-00000001 al 0001-00001000 \t\t\t");
        jScrollPane2.setViewportView(jTextArea1);

        etiva.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        etiva.setText("I.V.A. RESPONSABLE MONOTRIBUTO");

        txtcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuitKeyTyped(evt);
            }
        });

        txtloc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocKeyTyped(evt);
            }
        });

        etfec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etfec.setText("12-12-1212");

        bguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Documents\\NetBeansProjects\\pracremito\\guardar.png")); // NOI18N
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        jLabel6.setText("____________________________________________________________________________________________________________________________");
        jLabel6.setOpaque(true);

        jLabel7.setText("FIRMA DEL RECIBIDOR");

        bleer1.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Documents\\NetBeansProjects\\pracremito\\Volver.png")); // NOI18N
        bleer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleer1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        etcp.setText("Cod. Postal:");

        txtcp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpKeyTyped(evt);
            }
        });

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

        txtpag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpagKeyTyped(evt);
            }
        });

        jLabel2.setText("____________________________________________________________________________________________________________________________");
        jLabel2.setOpaque(true);

        chri.setText("IVA R.I. ");
        chri.setAlignmentX(0.5F);
        chri.setAlignmentY(0.0F);
        chri.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\emi\\Pictures\\293116_269455739747841_6769500_n.jpg")); // NOI18N

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("DOCUMENTO NO VÁLIDO COMO FACTURA");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        etinact.setText("Inicio de Actividades: 09-08-2012");

        chrm.setText("IVA Resp.Mon. ");
        chrm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        etfecha.setText("Fecha:");

        etnumre.setText("Numero de Remito:");

        chnr.setText("IVA No R. ");
        chnr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        che.setText("IVA Exento ");
        che.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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

        etIB.setText("Ingr. Brutos: 1043676-07");

        etcuit.setText("C.U.I.T.: 30-71029282-1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL");

        beliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
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
                                        .addGap(63, 63, 63)
                                        .addComponent(etnumre)
                                        .addGap(18, 18, 18)
                                        .addComponent(etnrem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etremi)
                                        .addGap(146, 146, 146))))
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
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addComponent(chrm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(101, 101, 101)
                                .addComponent(che, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(81, 81, 81)
                                .addComponent(chnr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)
                                .addComponent(chcf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(beliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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
                                        .addComponent(bleer1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etpago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txttra)))
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
                        .addComponent(etremi)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etnrem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etnumre))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etsr)
                        .addComponent(txtsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bleer1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chri)
                    .addComponent(chrm)
                    .addComponent(che)
                    .addComponent(chnr)
                    .addComponent(chcf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(beliminar))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            objtabla.setNumRows(tabla.getRowCount() + 1);
        }
    }//GEN-LAST:event_tablaKeyPressed

    private void txtsrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrKeyTyped

        int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txtsrKeyTyped

    private void txtcuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuitKeyTyped
        int k = (int) evt.getKeyChar();
        if ((k > 47 && k < 58) || k == 45 || k < 32) {
        } else {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtcuitKeyTyped

    private void txtlocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocKeyTyped
        int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_txtlocKeyTyped

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed

        try {

            Conectar miconexion = new Conectar();
            String insert = "insert into remito values (?,?,?,?,?,?,?,?,?,?)";
            miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);

            Object[] datos = {txtsr.getText(), txtdom.getText(), txtloc.getText(), txtcp.getText(), txtcuit.getText(), txtpag.getText(), txttra.getText()};

            validar(datos);
           
            miconexion.psPrepararSentencias.setString(1, etnrem.getText());
            miconexion.psPrepararSentencias.setString(2, etfec.getText());
            miconexion.psPrepararSentencias.setString(3, txtsr.getText());
            miconexion.psPrepararSentencias.setString(4, txtdom.getText());
            miconexion.psPrepararSentencias.setString(5, txtloc.getText());
            miconexion.psPrepararSentencias.setString(6, txtcp.getText());
            miconexion.psPrepararSentencias.setString(7, txtcuit.getText());
            miconexion.psPrepararSentencias.setString(8, txtpag.getText());
            miconexion.psPrepararSentencias.setString(9, txttra.getText());

            if (chcf.isSelected()) {
                miconexion.psPrepararSentencias.setString(10, chcf.getText());
            }
            if (che.isSelected()) {
                miconexion.psPrepararSentencias.setString(10, che.getText());
            }
            if (chnr.isSelected()) {
                miconexion.psPrepararSentencias.setString(10, chnr.getText());
            }
            if (chri.isSelected()) {
                miconexion.psPrepararSentencias.setString(10, chri.getText());
            }
            if (chrm.isSelected()) {
                miconexion.psPrepararSentencias.setString(10, chrm.getText());
            }

          
            miconexion.psPrepararSentencias.executeUpdate();
            miconexion.miconexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Conectar miconexion = new Conectar();
            String insertt = "insert into tabla_remito values (?,?,?,?)";
            miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insertt);

            for (int i = 0; i < tabla.getRowCount(); i++) {
                miconexion.psPrepararSentencias.setString(1, etnrem.getText());
                miconexion.psPrepararSentencias.setString(2, tabla.getValueAt(i, 0).toString());
                miconexion.psPrepararSentencias.setString(3, tabla.getValueAt(i, 1).toString());
                miconexion.psPrepararSentencias.setString(4, tabla.getValueAt(i, 2).toString());
                miconexion.psPrepararSentencias.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Conectar miconexion = new Conectar();
            String cons = "SELECT MAX( (idremito) +1 )FROM remito";
            ResultSet consulta = miconexion.consulta(cons);
            consulta.next();
            etnrem.setText(consulta.getString(1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        objtabla.getDataVector().clear();
        tabla.repaint();
        tabla.revalidate();


        etfec.setText("");
        txtsr.setText("");
        txtdom.setText("");
        txtloc.setText("");
        txtcp.setText("");
        txtcuit.setText("");
        txtpag.setText("");
        txttra.setText("");
        txttot.setText("");
    }//GEN-LAST:event_bguardarActionPerformed

    private void bleer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bleer1ActionPerformed
        inicio I1 = new inicio();
        I1.setVisible(true);
        I1.pack();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bleer1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
detaTabla ventana =new detaTabla(new javax.swing.JDialog(),true);
ventana.setVisible(true);
objtabla.addRow(ventana.metodo.datos);
txttot.setText("" + ventana.metodo.resultado(objtabla));
   }//GEN-LAST:event_jButton2ActionPerformed

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

    private void txttraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttraKeyTyped

   }//GEN-LAST:event_txttraKeyTyped

    private void txtpagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagKeyTyped
        int k = (int) evt.getKeyChar();
        if (k > 47 && k < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_txtpagKeyTyped

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
int fila;
        fila = tabla.getSelectedRow();
        if (fila >= 0) {
            objtabla.removeRow(fila);
            txttot.setText("");
            txttot.setText("" + metodo.resultado(objtabla));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_beliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Remito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Remito dialog = new Remito(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bleer1;
    private javax.swing.JCheckBox chcf;
    private javax.swing.JCheckBox che;
    private javax.swing.JCheckBox chnr;
    private javax.swing.JCheckBox chri;
    private javax.swing.JCheckBox chrm;
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
    private javax.swing.JLabel etnrem;
    private javax.swing.JLabel etnumre;
    private javax.swing.JLabel etpago;
    private javax.swing.JLabel etremi;
    private javax.swing.JLabel etsr;
    private javax.swing.JLabel ettransp;
    private javax.swing.JLabel etx;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField txtsr;
    private javax.swing.JTextField txttot;
    private javax.swing.JTextField txttra;
    // End of variables declaration//GEN-END:variables
}
