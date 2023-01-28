
package practico2;

import javax.swing.JComboBox;


public class libreriaprac {
  
   public JComboBox cargarcombo(JComboBox combo){
    for (float i=0;i<101;i++)
        {combo.addItem(i);}
        return combo;
        }
    
   public JComboBox borrarcombo(JComboBox combo)
    {
    combo.removeAllItems();
    return combo;
    }
   
    public float sumar(float x, float y,float z)
    {return x+y+z;}
    
    public float rest(float x, float y,float z)
    {return (x-y)-z;}
    
    public float mult(float x, float y,float z)
    {return (x*y)*z;}
    
    public float divi(float x, float y,float z)
    {return (x/y)/z;}
    
    public float calcular_mayor(float v1,float v2,float v3){
        
         float mayor=0;
        mayor=v1;
        if(v2>mayor)
            mayor=v2;
        if(v3>mayor)
            mayor=v3;
        return mayor;
   
     }
   
   
    
        
        
    public float calcular_menor(float v1,float v2,float v3){
        float menor=0;
        menor=v1;
        if(menor>v2)
            menor=v2;
        if(menor>v3)
            menor=v3;
        return menor;
    }
   
    public float clacular_medio(float v1,float v2,float v3)
    {
    float mayor=0,menor=0,res=0;
    
    menor=v1;
    if(menor>v2)
            menor=v2;
    if(menor>v3)
            menor=v3;
    mayor=v1;
    if(v2>mayor)
            mayor=v2;
    if(v3>mayor)
            mayor=v3;
    
    return res=(((v1+v2+v3)-menor)-mayor);
    }
}
