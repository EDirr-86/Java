/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_stock_venta;

import javax.swing.JComboBox;

/**
 *
 * @author Estudiante
 */
public class libreria {
 
String datos[]=new String [4];

public JComboBox cargarcombo (JComboBox combo, String arreglo[]){
        combo.removeAllItems();
        for (int i=0;i<arreglo.length;i++) 
    {
       combo.addItem(arreglo[i]);
    }
       return combo;
    }

public boolean validarletras (String palabra)
    {
        int bandera=0;
        String permitidos="qwertyuiopasdfghjklñzxcvbnm,";
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
