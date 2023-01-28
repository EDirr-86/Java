package finalprog;

import java.sql.ResultSet;//almacenamiento de datos sql
import java.util.Calendar; //fecha
import javax.swing.JOptionPane;//mensajes
import javax.swing.table.DefaultTableModel;//tabla

/*CHICOS ESTO ES LO QUE MAS O MENOS ENTENDI DE LO QUE TENIAN QUE HACER PARA EL FINAL, ANTE CUALQUIER DUDA ME LLAMAN!!!
 VOY A TRATAR DE HACERSELO LO MAS SENCILLO POSIBLE Y EXPLICANDO CADA PASO QUE HAGO PARA UNA MEJOR COMPRENSION DEL MISMO 
 DESDE YA EXITOS Y PARA LO QUE NECESITEN.. */

public class prog extends javax.swing.JFrame {
//AREA DE FUNCIONES Y DECLARACION DE VARIABLES GLOBALES PARA LA OPTIMIZACION DEL SISTEMA 
    public void cargarcomboprod (String area)
    {/*POR QUE FUNCION?? FACIL Y SENCILLO NO VOY A HACER UN IF PARA INDEX Y AGREGARLE ESTE CODIGO EN CADA IF, ASI QUE GENERAMOS UNA FUNCION "public" 
     QUE NO DEVUELVA NADA "void" CON EL NOMBRE "cargarcomboprod". AHORA VAMOS A NECESITAR UNA VARIABLE PARA NUESTRA SENCTENCIA "String area"*/
    jCmbProd.removeAllItems();
     try
        {
         conexion miconexion = new conexion();
         String consprod = "select detalle_pr from productos where idarea=(select idarea from areaprod where detalle_ar='"+ area +"') ";
         //Explico Sentencia
         /*selecciono mi producto desde la tabla productos donde idarea sea (sub consulta para mi idarea)
          * (selecciono idarea de mi producto desde la tabla areaprod donde mi area(nombre) sea igual a la variable ingresada*/
         ResultSet consulta =miconexion.consulta(consprod);
         
         do{consulta.next();//Nos manda al siguiente detalle_pr en caso de no ser la ultima
         this.jCmbProd.addItem(consulta.getString(1));//cargar nuestro detalle_pr
         }while (consulta.isLast()==false);/*Esto lo hace hasta que llegue al final de nuestra tabla(cuando llegue al final sale)*/ consulta.close();
        jCmbProd.setSelectedIndex(0);
        jCmbProd.setEnabled(true); 
        }
    catch(Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
//ACA TAMBIEN DECLARAMOS METODOS (libreria) Y TABLAS,LISTAS O TODO OBJETO QUE PODREMOS UTILIZAR DESPUES (por preferencia al final)
    
    DefaultTableModel objtabla = new DefaultTableModel();
    libreria metodos = new libreria();
    public prog() {
        initComponents();
        //EN ESTA AREA PODEMOS UTILIZAR ACCIONES DE INICIO COMO EN WINDOWSOPENED
   
   //Acomodamos todo lo que necesitamos
        jCmbProd.setEnabled(false);//no lo uso al menos que seleccione en el principal
        textcant.setEnabled(false);//hasta que no seleccion de ambos combos no se habilita
        etprec2.setVisible(false);//sin segundo comgo selleciona no lo uso
        etidord.setVisible(false);
   //Le damos formato a nuestra fecha
        Calendar cal=Calendar.getInstance(); 
        int dd=cal.get(cal.DATE);
        int mm=cal.get(cal.MONTH)+1;//el +1 es por que trabaja con formato 0 a 11 el mes     
        int aaaa=cal.get(cal.YEAR);
        etfec.setText(aaaa+"-"+mm+"-"+dd); //declaro de esta manera por que es la mas optima para sql "aaaa-mm-dd"
   //Le damos formato a la tabla
        String titulos[]={"CANT","ARTICULO","PRECIO UNIT","SUB TOTAL","",""};//Las comillas que no tiene nada es para ocultar columna para idprod
        
        objtabla.setColumnIdentifiers(titulos);
        tabla.setModel(objtabla);
        //Una forma de olcultar columnas
        tabla.getColumnModel().getColumn(4).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(0);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(0);
        tabla.getColumnModel().getColumn(5).setMaxWidth(0);
        tabla.getColumnModel().getColumn(5).setMinWidth(0);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(0);
   //Cargamos el combo principal
        try 
         {
         conexion miconexion = new conexion();
         String consarea = "select detalle_ar from areaprod ";//where ESTADO= 'activo' order by NOMBRE en tabajos mas sostificados
         ResultSet consulta =miconexion.consulta(consarea);
         
         do{consulta.next();//Nos manda al siguiente detalle_ar en caso de no ser la ultima
         this.jCmbArea.addItem(consulta.getString(1));//cargar nuestro detalle_ar
         }while (consulta.isLast()==false);/*Esto lo hace hasta que llegue al final de nuestra tabla(cuando llegue al final sale)*/ consulta.close();
         }
        catch (Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bagregar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        jCmbArea = new javax.swing.JComboBox();
        jCmbProd = new javax.swing.JComboBox();
        textcant = new javax.swing.JTextField();
        etarea = new javax.swing.JLabel();
        etprod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        etcant = new javax.swing.JLabel();
        ettot = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        etprec2 = new javax.swing.JLabel();
        etfec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Bguardar = new javax.swing.JButton();
        etidord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bagregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bagregar.setText("+");
        Bagregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Beliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Beliminar.setText("-");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        jCmbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "== Seleccione ==" }));
        jCmbArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbAreaItemStateChanged(evt);
            }
        });

        jCmbProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "== Seleccione ==" }));
        jCmbProd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCmbProdItemStateChanged(evt);
            }
        });

        textcant.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        etarea.setText("Area :");

        etprod.setText("Producto :");

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

        etcant.setText("Cantidad :");

        ettot.setText("TOTAL");

        txttot.setEditable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("x");

        Bguardar.setText("GUARDAR");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        etidord.setText("etidord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etcant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcant, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etprod)
                                .addGap(18, 18, 18)
                                .addComponent(jCmbProd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etprec2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etfec, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Bguardar)
                        .addGap(30, 30, 30)
                        .addComponent(etidord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ettot)
                        .addGap(18, 18, 18)
                        .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Beliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etprod)
                    .addComponent(jCmbProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etarea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etprec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textcant)
                        .addComponent(etcant)
                        .addComponent(etfec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Beliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ettot))
                        .addComponent(Bguardar))
                    .addComponent(etidord))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCmbAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbAreaItemStateChanged
        /* UTILIZAREMOS ESTE EVENTO PARA LA COMBINACION DE COMBOS, YA QUE CADA VES QUE CAMBIE ESTE COMBO
         CARGAREMOS UN COMBO NUEVO EN EL OTRO COMBO*/
        if(jCmbArea.getSelectedIndex()>0)
        {String valfun = (String)jCmbArea.getSelectedItem();//Genero una variable para mi funcion y la almaceno con el item seleccionado en el momento
          cargarcomboprod(valfun);} //funcion arriba              
    }//GEN-LAST:event_jCmbAreaItemStateChanged

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
    //Este evento ya lo conocen y lo usamos para agregar a nuestar tabla una nueva fila
            if (metodos.validarnumeros(textcant.getText())!=false) {
            String datos[] = new String[6];
            datos[0] = this.textcant.getText();
            datos[1] = this.jCmbProd.getSelectedItem().toString();
            datos[2] = this.etprec2.getText();
            datos[3] =  String.valueOf(Double.parseDouble(textcant.getText())* Double.parseDouble(etprec2.getText())) ;
                try{
                    conexion miconexion=new conexion();
                    String cons= "select idprod,idarea from productos where detalle_pr ='"+datos[1].toString()+"'";
                    ResultSet consulta = miconexion.consulta(cons);
                        if(consulta.last()){datos[4]=consulta.getString(1).toString();datos[5]=consulta.getString(2).toString();}
            
                    objtabla.addRow(datos);
                    txttot.setText("");
                    txttot.setText("" + metodos.resultado(objtabla));//En libreria esta el medo explicado
                    
                    textcant.setText("");
                    textcant.setEnabled(false);
                    etprec2.setText("");
                    etprec2.setVisible(false);
                    jCmbProd.setSelectedIndex(-1);
                    
                }
                catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}}
      
    else{JOptionPane.showMessageDialog(null, "Formato ingresado no es valido o no a completado la casilla cantidad");
    }
        
        
    }//GEN-LAST:event_BagregarActionPerformed

    private void jCmbProdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCmbProdItemStateChanged
        //Esta ves usaremos el evento para colocar el precio del producto en una etiqueta
        if(jCmbProd.getSelectedIndex()>=0)
        {try
            {
             conexion miconexion=new conexion();
             //Esto nos va a traer el precio de nuestro producto ya preseleccionado
             String cons= "select precio_pr from productos where detalle_pr like '"+(String)jCmbProd.getSelectedItem()+"'";
             ResultSet consulta = miconexion.consulta(cons);
             consulta.next();
             etprec2.setVisible(true);
             String valor = consulta.getString(1);
             
             etprec2.setText(""+ valor);//colocamos nuestro resultado en la etiqueta
             textcant.setEnabled(true);//habilitamos nuestra casilla cantidad
            }
         catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}}
    }//GEN-LAST:event_jCmbProdItemStateChanged

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        //Esta accion tambien es conosida y la usaremos para eliminar una fila de nuestra tabla..
        int fila;
        fila = tabla.getSelectedRow(); //esta variable genera nos sirbe para almacenar el nuemero de fila que seleccionaremos
        if (fila >= 0) {
            objtabla.removeRow(fila);
            txttot.setText("");
            txttot.setText("" + metodos.resultado(objtabla));//Lo volvemos a usar para que nos recalcule todo nuevamente
        }else{JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna fila!");}  
    }//GEN-LAST:event_BeliminarActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        //Hora de guardar los datos
        try
        {
        conexion miconexion = new conexion ();
        String ID = "SELECT MAX( (idord) +1 )FROM ordenes";
        ResultSet consulta =miconexion.consulta(ID);
        consulta.next();
        if (consulta.getString(1)==null){etidord.setText(""+1);}
        else
        etidord.setText(""+consulta.getString(1));consulta.close();
           
        String insert = "insert into ordenes values (?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insert);
        
         miconexion.psPrepararSentencias.setString(1, etidord.getText());
         miconexion.psPrepararSentencias.setString(2, etfec.getText());
         miconexion.psPrepararSentencias.executeUpdate(); 
        
        String insertd = "insert into detalles_ordenes values (?,?,?,?,?)";
        miconexion.psPrepararSentencias = miconexion.miconexion.prepareStatement(insertd);
        
        for(int i=0; i < tabla.getRowCount();i++){
            miconexion.psPrepararSentencias.setString(1, etidord.getText());
            miconexion.psPrepararSentencias.setString(2, tabla.getValueAt(i, 4).toString());
            miconexion.psPrepararSentencias.setString(3, tabla.getValueAt(i, 5).toString());
            miconexion.psPrepararSentencias.setString(4, tabla.getValueAt(i, 0).toString());
            miconexion.psPrepararSentencias.setString(5, tabla.getValueAt(i, 2).toString());
            miconexion.psPrepararSentencias.executeUpdate(); 
        } JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
        
     
        }         
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }//GEN-LAST:event_BguardarActionPerformed
   
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new prog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bguardar;
    private javax.swing.JLabel etarea;
    private javax.swing.JLabel etcant;
    private javax.swing.JLabel etfec;
    private javax.swing.JLabel etidord;
    private javax.swing.JLabel etprec2;
    private javax.swing.JLabel etprod;
    private javax.swing.JLabel ettot;
    private javax.swing.JComboBox jCmbArea;
    private javax.swing.JComboBox jCmbProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textcant;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
