import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class PrimaryProgram {





           // JDBC driver name and database URL
           static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
           static final String DB_URL = "jdbc:mysql://localhost/student";

           //  Database credentials
           static final String USER = "root";
           static final String PASS = "pazdziorko1991";

           public static void main(String[] args) {
               Connection con = null;
               Statement stm = null;



               try{
                   //STEP 2: Register JDBC driver
                   Class.forName("com.mysql.cj.jdbc.Driver");

                   //STEP 3: Open a connection
                   System.out.println("You are connected to database");
                   con = DriverManager.getConnection(DB_URL,USER,PASS);

                   //STEP 4: Execute a query
                   System.out.println("Creating statement...");
                   stm = con.createStatement();
                   String sql;
                   sql = "SELECT id, per FROM percentage";
                   ResultSet rs = stm.executeQuery(sql);

                   //STEP 5: Extract data from result set
                   while(rs.next()){
                       //Retrieve by column name
                       int id  = rs.getInt("id");
                       String first = rs.getString("per");


                       //Display values
                       System.out.print("ID: " + id);
                       System.out.print(", First: " + first);

                   }
                   //STEP 6: Clean-up environment
                   rs.close();
                   stm.close();
                   con.close();
               }catch(SQLException se){
                   //Handle errors for JDBC
                   se.printStackTrace();
               }catch(Exception e){
                   //Handle errors for Class.forName
                   e.printStackTrace();
               }finally{
                   //finally block used to close resources
                   try{
                       if(stm!=null)
                           stm.close();
                   }catch(SQLException se2){
                   }// nothing we can do
                   try{
                       if(con!=null)
                           con.close();
                   }catch(SQLException se){
                       se.printStackTrace();
                   }//end finally try
               }//end try
               System.out.println(" Goodbye!");
           }//end main
       }//end FirstExample









