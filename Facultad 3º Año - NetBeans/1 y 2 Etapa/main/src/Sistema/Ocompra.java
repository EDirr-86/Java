
package Sistema;

import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.ComboBoxEditor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ocompra extends javax.swing.JDialog {
int aux; String arreglo[];
  Calendar cal=Calendar.getInstance(); 
        int dd=cal.get(cal.DATE);
        int mm=cal.get(cal.MONTH)+1;     
        int aaaa=cal.get(cal.YEAR);
    public void validarvaciosProd(Object[] datos) {
        for (int i = 0; i <= datos.length - 1; i++){
            if (datos[i].toString().isEmpty()){
                if(jCbxProd.getSelectedIndex()==0){;aux=1;}}}}
     public void validarvacios(Object[] datos) {
        for (int i = 0; i <= datos.length - 1; i++){
            if (datos[i].toString().isEmpty()){
                if(jCbxIva.getSelectedIndex()==0&&jCbxProv.getSelectedIndex()==0){;aux=1;}}}}
  
  
     
  public void habilitarB()
   {this.txtid_buscar.setEnabled(true);this.txtid_buscar.setText("");this.txtfec.setText("");
   this.txtdir.setEnabled(false);this.txtdir.setText("");this.txttel.setEnabled(false);this.txttel.setText("");this.txtcuit.setEnabled(false);
   this.txtcuit.setText("");this.txtcan.setEnabled(false);this.txtcan.setText("");this.txtprec.setEnabled(false);this.txtprec.setText("");
   this.jCbxIva.setSelectedIndex(0);this.jCbxProd.setSelectedIndex(0);this.jCbxProd.setEnabled(false);this.jCbxIva.setEnabled(false);
   this.jCbxProv.setSelectedIndex(0);this.jCbxProv.setEnabled(false);this.jBtnConfirm.setVisible(true);this.jBtnGrabar.setEnabled(false);
   jBtnAgreTabla.setEnabled(false);jBtnElimFilTabla.setEnabled(false);
   }
  
  public void limpiar()
   {this.txtid_buscar.setEnabled(false);this.txtid_buscar.setText("");this.txtfec.setText("");
   this.txtdir.setEnabled(true);this.txtdir.setText("");this.txttel.setEnabled(true);this.txttel.setText("");this.txtcuit.setEnabled(true);
   this.txtcuit.setText("");this.txtcan.setEnabled(true);this.txtcan.setText("");this.txtprec.setEnabled(true);this.txtprec.setText("");
   this.jCbxIva.setSelectedIndex(0);this.jCbxProd.setSelectedIndex(0);this.jCbxProd.setEnabled(true);this.jCbxIva.setEnabled(true);
   this.jCbxProv.setSelectedIndex(0);this.jCbxProv.setEnabled(true);this.jBtnConfirm.setVisible(false);this.jBtnGrabar.setEnabled(true);
   jBtnAgreTabla.setEnabled(true);jBtnElimFilTabla.setEnabled(true);objtabla.getDataVector().clear();
   tabla.repaint();tabla.revalidate(); txtfec.setText(aaaa+"-"+mm+"-"+dd);
   }
    DefaultTableModel objtabla = new DefaultTableModel();
    libreria metodo = new libreria();
    public Ocompra(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        arreglo=new String[50];
                 
        txtfec.setText(aaaa+"-"+mm+"-"+dd);
        
        this.jBtnConfirm.setVisible(false);
        
        String titulos[]={"CANT","ARTICULO","PRECIO UNIT","SUB TOTAL",""};
        
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
        tabla.getColumnModel().getColumn(4).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(0);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(0);
        
        etidprov.setVisible(false); etidocomp.setVisible(false);
        
        try 
         {
         conexion miconexion = new conexion();
         String consprov = "select nombre_pro from proveedores where estado_pro= 'activo' order by nombre_pro";
         ResultSet consulta =miconexion.consulta(consprov);
         int i=0;
         do{consulta.next();
         this.jCbxProv.addItem(consulta.getString(1));
         arreglo[i]=consulta.getString(1);i++;
         }while (consulta.isLast()==false); consulta.close();
            
         String consiva = "select descripcion_iva from condicioniva";
         ResultSet consulta2 =miconexion.consulta(consiva);
         do{consulta2.next();
         this.jCbxIva.addItem(consulta2.getString(1));
         
         }while (consulta2.isLast()==false); consulta2.close();
         
         String consprod = "select detalle_pr from producto order by detalle_pr";
         ResultSet consulta3 =miconexion.consulta(consprod);
         do{consulta3.next();
         this.jCbxProd.addItem(consulta3.getString(1));
         }while (consulta3.isLast()==false);consulta3.close();
        }
        catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etid = new javax.swing.JLabel();
        etfec = new javax.swing.JLabel();
        txtfec = new javax.swing.JTextField();
        etprov = new javax.swing.JLabel();
        etdir = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        ettel = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        etcuit = new javax.swing.JLabel();
        txtcuit = new javax.swing.JTextField();
        etiva = new javax.swing.JLabel();
        jCbxIva = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        etprod = new javax.swing.JLabel();
        etcan = new javax.swing.JLabel();
        txtcan = new javax.swing.JTextField();
        jCbxProd = new javax.swing.JComboBox();
        txtprec = new javax.swing.JTextField();
        etpre = new javax.swing.JLabel();
        jBtnAgreTabla = new javax.swing.JButton();
        jBtnElimFilTabla = new javax.swing.JButton();
        txtid_buscar = new javax.swing.JTextField();
        jBtnConfirm = new javax.swing.JButton();
        jCbxProv = new javax.swing.JComboBox();
        etidprov = new javax.swing.JLabel();
        etidocomp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBtnGrabar = new javax.swing.JButton();
        jBtnBuscar = new javax.swing.JButton();
        jBtnImprimir = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        ettot = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDEN DE COMPRA: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        etid.setText("Codigo:");

        etfec.setText("Fecha de la Orden:");

        txtfec.setEnabled(false);
        txtfec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfecKeyPressed(evt);
            }
        });

        etprov.setText("Proveedor:");

        etdir.setText("Direccion:");

        txtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdirKeyPressed(evt);
            }
        });

        ettel.setText("Telefono:");

        etcuit.setText("C.U.I.T.:");

        etiva.setText("Condicion Tributaria");

        jCbxIva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Seleccione------" }));
        jCbxIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCbxIvaKeyPressed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        etprod.setText("PRODUCTO:");

        etcan.setText("CANTIDAD:");

        jCbxProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------Seleccione--------" }));
        jCbxProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCbxProdKeyPressed(evt);
            }
        });

        etpre.setText("PRECIO:");

        jBtnAgreTabla.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAgreTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/download.png"))); // NOI18N
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etcan)
                            .addComponent(etprod)
                            .addComponent(etpre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcan)
                            .addComponent(jCbxProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprec))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBtnAgreTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnElimFilTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etprod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etcan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etpre)
                    .addComponent(txtprec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnElimFilTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnAgreTabla))
        );

        txtid_buscar.setEnabled(false);

        jBtnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/Confirm.png"))); // NOI18N
        jBtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmActionPerformed(evt);
            }
        });

        jCbxProv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Seleccione------" }));
        jCbxProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbxProvItemStateChanged(evt);
            }
        });
        jCbxProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCbxProvKeyPressed(evt);
            }
        });

        etidprov.setText("etidiprov");

        etidocomp.setText("etidocomp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etdir)
                            .addComponent(etiva)
                            .addComponent(etcuit)
                            .addComponent(ettel))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcuit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbxIva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etprov)
                            .addComponent(etfec)
                            .addComponent(etid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etidocomp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtfec)
                                    .addComponent(jCbxProv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etidprov)
                                    .addComponent(jBtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etidocomp)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etid)
                                    .addComponent(txtid_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etfec)
                                    .addComponent(txtfec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etprov)
                                    .addComponent(jCbxProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etidprov))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etdir))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ettel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etcuit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiva)
                                    .addComponent(jCbxIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jBtnGrabar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/save.png"))); // NOI18N
        jBtnGrabar.setText("Grabar");
        jBtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGrabarActionPerformed(evt);
            }
        });

        jBtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/search.jpg"))); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/print.gif"))); // NOI18N
        jBtnImprimir.setText("Imprimir");
        jBtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImprimirActionPerformed(evt);
            }
        });

        jBtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_visuales/clear.png"))); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jBtnImprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jBtnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jBtnGrabar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Titulo 5"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        ettot.setText("TOTAL : ");

        txttot.setEnabled(false);
        txttot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(ettot)
                        .addGap(18, 18, 18)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ettot)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfecKeyPressed

   }//GEN-LAST:event_txtfecKeyPressed

    private void txtdirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirKeyPressed

    private void jBtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGrabarActionPerformed
 try{   conexion miconexion = new conexion();
        
        String ID = "SELECT MAX( (idcompra) +1 )FROM compras";
        ResultSet consulta =miconexion.consulta(ID);
        consulta.next();
        if (consulta.getString(1)==null){etidocomp.setText(""+1);}
        else
        etidocomp.setText(""+consulta.getString(1));consulta.close();
 }
 catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }
 try{
     conexion miconexion = new conexion();   
     String inscomp = "insert into compras values (?,?,?)";
     miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(inscomp);
     Object[] datos={txtfec.getText(),txtdir.getText(),txtcuit.getText(),txttel.getText()};                     
     validarvacios(datos);
        if(aux!=1){
            miconexion.psPrepararSentencias.setString(1, etidocomp.getText());
            miconexion.psPrepararSentencias.setString(2,etidprov.getText());
            miconexion.psPrepararSentencias.setString(3, txtfec.getText());
            miconexion.psPrepararSentencias.executeUpdate();    
            miconexion.miconexion.close();
            JOptionPane.showMessageDialog(null, "Compra cargada");
                }
        else{JOptionPane.showMessageDialog(null, "Hay campos vacios");        }
        }         
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }

 try{
        conexion miconexion = new conexion ();
        String insertt = "insert into compra_detalle values (?,?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insertt);
        
        for(int i=0; i < tabla.getRowCount();i++){
            miconexion.psPrepararSentencias.setString(1, etidocomp.getText());
            miconexion.psPrepararSentencias.setString(3, tabla.getValueAt(i, 0).toString());
            miconexion.psPrepararSentencias.setString(4, tabla.getValueAt(i, 2).toString());
            miconexion.psPrepararSentencias.setString(2, tabla.getValueAt(i, 4).toString());
            miconexion.psPrepararSentencias.executeUpdate(); 
        }
        }
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
 
 try{
     conexion miconexion = new conexion();
     for(int i=0; i < tabla.getRowCount();i++){
        String actualizar = "update producto set cantidad_pr =cantidad_pr+(?) where idprod= "+tabla.getValueAt(i, 4).toString();
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(actualizar);
        miconexion.psPrepararSentencias.setString(1, tabla.getValueAt(i, 0).toString());
        miconexion.psPrepararSentencias.executeUpdate();}
 }
catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());
}
   limpiar();                  
    }//GEN-LAST:event_jBtnGrabarActionPerformed

    private void jBtnAgreTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgreTablaActionPerformed
Object[] datoss = {txtcan.getText(), txtprec.getText()};
validarvaciosProd(datoss);

    if (aux != 1) {
        String datos[] = new String[5];
        datos[0] = this.txtcan.getText();
        datos[1] = this.jCbxProd.getSelectedItem().toString();
        datos[2] = this.txtprec.getText();
        datos[3] =  String.valueOf(Double.parseDouble(txtcan.getText())* Double.parseDouble(txtprec.getText())) ;
            try{
                conexion miconexion=new conexion();
                String cons= "select idprod from producto where detalle_pr ='"+datos[1].toString()+"'";
                ResultSet consulta = miconexion.consulta(cons);
                    if(consulta.last()){datos[4]=consulta.getString(1).toString();}
            
            objtabla.addRow(datos);
            txttot.setText("");
            txttot.setText("" + metodo.resultado(objtabla));
            aux = 0;

            txtcan.setText("");
            txtprec.setText("");
            jCbxProd.setSelectedIndex(0);
            }
        catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
    }else 
    {JOptionPane.showMessageDialog(null, "Se encuentran campos vacios");
       aux = 0;}                                
    }//GEN-LAST:event_jBtnAgreTablaActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        habilitarB();
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImprimirActionPerformed

       
    }//GEN-LAST:event_jBtnImprimirActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
limpiar();

    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jCbxProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCbxProdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtcan.requestFocus();
        }
    }//GEN-LAST:event_jCbxProdKeyPressed

    private void txttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotActionPerformed

    private void jCbxIvaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCbxIvaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxIvaKeyPressed

    private void jBtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmActionPerformed
try{
conexion miconexion = new conexion ();
String cons = "select idproveedor,fecfac_co from compras where idcompra = " + txtid_buscar.getText();
ResultSet consulta =miconexion.consulta(cons);
if (consulta.last())
{
int aux = consulta.getInt(1);
txtfec.setText(consulta.getString(2));

cons = "select nombre_pro from proveedores where idproveedor = " + aux;
                    consulta =miconexion.consulta(cons);
                    if(consulta.last()){String temp=consulta.getString(1);
                    int pos=metodo.posicionar(arreglo, temp);
                    this.jCbxProv.setSelectedIndex(pos);
                    }
                    

cons = "select * from compra_detalle where idcompra = " + txtid_buscar.getText();
                    consulta =miconexion.consulta(cons);
                    String datos[]=new String [5];
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
                    datos[4]=String.valueOf(consulta.getString(3));
                    objtabla.addRow(datos);  
                    }
                    while (consulta.isLast()==false);  
                    txttot.setText(""+total);
                    } 
          
        else{JOptionPane.showMessageDialog(null,"No se ha encontrado ninguna orden de compra!");} 
       }
catch (Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_jBtnConfirmActionPerformed

    private void jBtnElimFilTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElimFilTablaActionPerformed
int fila;
        fila = tabla.getSelectedRow();
        if (fila >= 0) {
            objtabla.removeRow(fila);
            txttot.setText("");
            txttot.setText("" + metodo.resultado(objtabla));
        }else{JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna fila!");}       
    }//GEN-LAST:event_jBtnElimFilTablaActionPerformed

    private void jCbxProvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCbxProvKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxProvKeyPressed

    private void jCbxProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbxProvItemStateChanged
if(this.jCbxProv.getSelectedIndex()>0){
        try{ conexion miconexion = new conexion();
            String cons = "select direccion_pro,telefono_pro,cuit_pro,idiva,idproveedor from proveedores where nombre_pro='"+jCbxProv.getSelectedItem()+"'";
            ResultSet consulta =miconexion.consulta(cons);
            consulta.next();
            this.txtdir.setText(""+consulta.getString(1)); 
            this.txttel.setText(""+consulta.getString(2));
            this.txtcuit.setText(""+consulta.getString(3));
            this.jCbxIva.setSelectedIndex(consulta.getInt(4));
            this.etidprov.setText(""+consulta.getString(5));
}
            catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}        
    }//GEN-LAST:event_jCbxProvItemStateChanged
    }    
    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Ocompra dialog = new Ocompra(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel etcuit;
    private javax.swing.JLabel etdir;
    private javax.swing.JLabel etfec;
    private javax.swing.JLabel etid;
    private javax.swing.JLabel etidocomp;
    private javax.swing.JLabel etidprov;
    private javax.swing.JLabel etiva;
    private javax.swing.JLabel etpre;
    private javax.swing.JLabel etprod;
    private javax.swing.JLabel etprov;
    private javax.swing.JLabel ettel;
    private javax.swing.JLabel ettot;
    private javax.swing.JButton jBtnAgreTabla;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnConfirm;
    private javax.swing.JButton jBtnElimFilTabla;
    private javax.swing.JButton jBtnGrabar;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox jCbxIva;
    private javax.swing.JComboBox jCbxProd;
    private javax.swing.JComboBox jCbxProv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcan;
    private javax.swing.JTextField txtcuit;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtfec;
    private javax.swing.JTextField txtid_buscar;
    private javax.swing.JTextField txtprec;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
