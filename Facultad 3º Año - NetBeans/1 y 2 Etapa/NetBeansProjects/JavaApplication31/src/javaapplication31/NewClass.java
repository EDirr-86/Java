
package javaapplication31;

import java.sql.*;


public class NewClass {
     Connection miconexion;
    Statement stSentencias;
    ResultSet rsDatos;
    PreparedStatement psPrepararSentencias;
    
    public NewClass () throws ClassNotFoundException, SQLException
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
         String url = ("jdbc:mysql://localhost/prueba1");
         miconexion = DriverManager.getConnection(url, "root","");
         stSentencias = miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     }
     catch (ClassCastException | SQLException ex)
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
