
package inventario;

import java.sql.*;


/**
 * 
 * @author emi
 */
public class conexion {
     Connection miconexion;
    Statement stSentencias;
    ResultSet rsDatos;
    PreparedStatement psPrepararSentencias;
    
    /**
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public conexion () throws ClassNotFoundException, SQLException
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
         String url = ("jdbc:mysql://localhost/stock");
         miconexion = DriverManager.getConnection(url, "root","");
         stSentencias = miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     }
     catch (ClassCastException | SQLException ex)
     {
         throw ex;
     }
    }
    
    /**
     * 
     * @param sql
     * @return
     * @throws SQLException
     */
    public ResultSet consulta (String sql ) throws SQLException
    {
        try 
           {
            rsDatos = stSentencias.executeQuery(sql);
           }
        catch (SQLException ex)
             {
              throw ex;        
             }
    return rsDatos;
    }
}
