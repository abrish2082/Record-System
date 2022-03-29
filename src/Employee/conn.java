
package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Ab
 */
public class conn {
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");    
            s =c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 

    

