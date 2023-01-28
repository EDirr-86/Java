/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class libreria {
 
     public JComboBox cargarcombo (JComboBox combo, String arreglo[]){
        combo.removeAllItems();
        for (int i=0;i<arreglo.length;i++) 
    {
        
        combo.addItem(arreglo[i]);
    }
        
        return combo;
    }
    
    public double resultado (DefaultTableModel latabla){
        
       double total = 0;


for (int i=0;i<latabla.getRowCount();i++)
{
total=total+ (Double.parseDouble((String)latabla.getValueAt(i, 1))*Double.parseDouble((String)latabla.getValueAt(i, 2)));
}

return total;

    }

    
    
    
    
}
    

