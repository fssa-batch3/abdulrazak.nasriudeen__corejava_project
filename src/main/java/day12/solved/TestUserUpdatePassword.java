package day12.solved;
import day11.solved.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestUserUpdatePassword {

    public static void main(String[] args) throws Exception {

        Connection connection = ConnectionUtil.getConnection();

        // Input
        String userName = "Abdul";
        String password = "1234password";


        // DEPOSIT
        String query = "UPDATE user SET password=? WHERE username=?";

        PreparedStatement pst = connection.prepareStatement(query);
        pst.setString(1, password);
        pst.setString(2, userName);

        int rows = pst.executeUpdate();
        System.out.println("No of rows updated" + rows);
    }


}