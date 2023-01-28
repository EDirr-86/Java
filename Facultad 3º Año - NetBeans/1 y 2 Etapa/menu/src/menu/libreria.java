/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class libreria {
    
   String datos[]= new String [2];
   String nombre; 
   
   
    
    public double resultado (DefaultTableModel tabla1)
    {
        
       double total = 0;


for (int i=0;i<tabla1.getRowCount();i++)
{
total=total+ (Double.parseDouble((String)tabla1.getValueAt(i, 3)));
}
return total;
    }


public boolean validarnumeros (String palabra)
{
        int bandera;
        String permitidos = "qwertyuiopasdfghjklzxcvbnmáéíóú ";
        palabra=palabra.toLowerCase();
        for (int i=0;i<palabra.length();i++)
        {
            bandera=0;
            for (int j=0; j <permitidos.length();j++)
            {
                if (palabra.charAt(i) == permitidos.charAt(j))
                    bandera=1;
            }
                if (bandera==0)
                {
                return false;
                }
        }
 return true;
                                
}
public JComboBox cargarcombo (JComboBox micombo, String consultasql){

try
{
Conectar miconexion = new Conectar ();
micombo.removeAllItems();
ResultSet consulta =miconexion.consulta(consultasql);

consulta.first();


for (int i=0; i<consulta.getRow(); i++)
{
    
JItem item = new JItem();
item.setItemData(consulta.getString(1));
item.setItem(consulta.getString(2));
micombo.addItem(item);
consulta.next();
}
micombo.setSelectedIndex(-1);
}

catch (Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}

return micombo;
}
}