/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.sql.*;


public class Conectar {
    
    Connection miconexion;
    Statement stSentencias;
    ResultSet rsDatos;
    PreparedStatement psPrepararSentencias;
    
    
    public Conectar () throws ClassNotFoundException, SQLException
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
         String url = ("jdbc:mysql://localhost/practico1");
         miconexion = DriverManager.getConnection(url, "root","");
         stSentencias = miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     }
     catch (ClassCastException ex)
     {
         throw ex;
     }
     catch (SQLException ex)
     {
         throw ex;
     }
    }
    
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
