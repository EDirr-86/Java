
package eje1.ordenarcombo;

import javax.swing.*;

public class libreria {
    
    public Double[] ordenar  (Double arreglo[])
            
    {
        Double temp=null;
         for (int i=0;i<arreglo.length;i++)
        {
            for (int j=0;j<arreglo.length;j++)
            {
                if (arreglo[j]>arreglo[i])
                {
                    
                    temp=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temp;
                }
            }
        }
        
        return arreglo;
    }
    
    public JComboBox cargarcombo (JComboBox combo, Double arreglo[]){
        combo.removeAllItems();
        for (int i=0;i<arreglo.length;i++) 
    {
        
        combo.addItem(arreglo[i]);
    }
        
        return combo;
                
        
    }
    
}
