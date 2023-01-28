
package Sistema;

/**
 *
 * @author emi
 */
public class Main {
public Main() { }
    
    public Main( Object value ) { 
        this.item = ((Main)value).getItem();
        this.itemData = ((Main)value).getItemData();
    }
    
    @Override
    public String toString(){                    
        return getItem();   
    }
    
    /**
     * Retorna la descripcion del combo box
     * @author 
     */    
    public String getItem(){        
        return item;
    }  
    
    /**
     * Retorna el Objeto que identifica la descripcion del combo box
     * @author 
     */    
    public Object getItemData(){
        return itemData;
    }

    public void setItem( String value ) {
        item = value;
    }

    public void setItemData(Object value) {
        itemData = value;
    }         
    
    private String item = "";
    private Object itemData = null;
}
