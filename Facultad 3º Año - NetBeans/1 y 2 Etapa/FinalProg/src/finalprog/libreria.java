package finalprog;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class libreria {
    //ESTE METODO NOS AYUDA A SUMAR EN NUESTRA TABLA
    public double resultado (DefaultTableModel tabla){
        
        Double total=0.0;
        for (int i=0;i<tabla.getRowCount();i++)
            {
            total=total+ (Double.parseDouble((String)tabla.getValueAt(i, 0))*Double.parseDouble((String)tabla.getValueAt(i, 2)));
            }

return total;

    }
    //ESTE METODO LO VAMOS A USAR PARA VALIDAR NUMEROS
    public boolean validarnumeros (String palabra)
    {
        int bandera=0;
        String permitidos="1234567890.,";//esto es el parame aceptado por nosotros
        
        for (int i=0;i<palabra.length();i++)//a la palabra la recorre como un arreglo
        {
            bandera=0;
            for (int j=0;j<permitidos.length();j++)
            {
                if(palabra.charAt(i)==permitidos.charAt(j) )//aca compara nuestro permitido con lo ingresado en el programa
                    bandera=1;
            }
            if(bandera==0)
                return false;
        }
        return true;
    }
    
    
    
  
}
