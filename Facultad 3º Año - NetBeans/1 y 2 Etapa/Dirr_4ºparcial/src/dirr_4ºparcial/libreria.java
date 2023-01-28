package dirr_4ºparcial;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class libreria {
    
    public double resultado (DefaultTableModel tabla){
        
        int total = 0;
        for (int i=0;i<tabla.getRowCount();i++)
            {
            total=total+ (Integer.parseInt((String)tabla.getValueAt(i, 1)));
            }

return total;

    }
    
    
    
  
}
