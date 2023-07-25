package day11.solved;


import day11.solved.ConnectionUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.Statement;
public class UserInsertQuery {

    public static void main(String[] args) {

        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("stmt");
        System.out.println(connection);

        // Step 02: Create a Statement
  try {
      Statement stmt = connection.createStatement();
      // Step 03: Execute Insert Query
      String query ="INSERT INTO user (username, email, password) VALUES (\"Abdul\",\"Abdulrazak@gmail.freshworks.com\", \"raz123\")";
      System.out.println("No of rows inserted :" );
      String query2 ="INSERT INTO user (username, email, password) VALUES (\"Razak\",\"razak@gmail.freshworks.com\", \"raz123\")";
      System.out.println("No of rows inserted :" );
      int rows = stmt.executeUpdate(query);
      System.out.println("No of rows inserted :" + rows );
      ConnectionUtil.close(connection,stmt,null);
  }catch (Exception e ){
      System.out.println("stmt");

  }
    }

}