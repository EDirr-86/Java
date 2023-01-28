package Sistema;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class libreria {

    public int posicionar  (String arreglo[],String posicion)
            
    {int po=0;
         for (int i=0;i<arreglo.length;i++)
        {
            if (arreglo[i].equals(posicion))
                {po=i;return po+1;}
        }
        return po;      
    }
    
    public double resultado (DefaultTableModel tabla){
        
        double total = 0;
        for (int i=0;i<tabla.getRowCount();i++)
            {
            total=total+ (Double.parseDouble((String)tabla.getValueAt(i, 0))*Double.parseDouble((String)tabla.getValueAt(i, 2)));
            }

return total;

    }
    public boolean validarnumeros (String palabra)
    {
        int bandera=0;
        String permitidos="1234567890.,";
        
        for (int i=0;i<palabra.length();i++)
        {
            bandera=0;
            for (int j=0;j<permitidos.length();j++)
            {
                if(palabra.charAt(i)==permitidos.charAt(j) )
                    bandera=1;
            }
            if(bandera==0)
                return false;
        }
        return true;
    }
    
   
    public boolean validarletras (String palabra)
    {
        int bandera=0;
        String permitidos="qwertyuiopasdfghjklñzxcvbnm,áéíóúàèìòùâêîôûäëïöü";
        palabra=palabra.toLowerCase();
        for (int i=0;i<palabra.length();i++)
        {
            bandera=0;
            for (int j=0;j<permitidos.length();j++)
            {
                if(palabra.charAt(i)==permitidos.charAt(j) )
                    bandera=1;
            }
            if(bandera==0)
                return false;
        }
        return true;
    }
    
    
  
}
