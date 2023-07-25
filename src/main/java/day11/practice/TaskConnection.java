package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class TaskConnection {

    public static Connection getConnection(){
        Connection connect = null ;
        String url = "jdbc:mysql://localhost/tasks";
        String userName = "root";
        String passWord = "123456";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to connect to the database");
        }




        return  connect ;

    }
    public static void main(String[]args ){
        Connection con = getConnection();
        System.out.println(con);
    }

}
