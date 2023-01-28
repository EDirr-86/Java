/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pracremito;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class libreria {

    String datos[]=new String[4];
    
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
        String permitidos="1234567890.,-/";
        
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
        String permitidos="qwertyuiopasdfghjklñzxcvbnm,àáâäéèêëíìîïóòöôùúüû";
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
