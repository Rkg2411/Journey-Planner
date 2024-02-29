
package journey.planner.system;
import java.sql.*;

public class Conn {
    //this connection iterfface is present in java.sql we have to import that 
    Connection c;
    Statement s;
    Conn()
    {
      try  {
         // step 1:-Initializing Driver or Registering driver Class
          //as MySQL is an external entity so exception can be happen at runtime so we have to handle eception also
          Class.forName("com.mysql.cj.jdbc.Driver");
          //Step 2:- to connect with my sql we have to provide some information;
          c=DriverManager.getConnection("jdbc:mysql://localhost:3306/journeyplannersystem","root","Newjourney@2023");
          //Step 3:-creating statement
          s=c.createStatement();
          
          
          
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }
    
}
