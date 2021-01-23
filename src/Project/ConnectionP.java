


package Project;

import java.sql.*;
public class ConnectionP {
    
    public static ConnectionP getCon() 
    {
       try
       {
      Class.forName("com.mysql.jdbc.Driver");
      ConnectionP con = (ConnectionP) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
           
       return con;
}catch(Exception e){
        
    return null;
    
}
    }}
    