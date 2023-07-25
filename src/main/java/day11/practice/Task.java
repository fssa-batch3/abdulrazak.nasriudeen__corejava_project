package day11.practice;
import day11.practice.TaskConnection;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Task {
    private  int id ;
    private  String taskName;
    private LocalDate date;

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public LocalDate getDate() {
        return date;
    }
    public static int insertnewTask(PreparedStatement pre ,int id,String name,LocalDate date) throws SQLException{
        pre.setInt(1,id);
        pre.setString(2,name);
        String strDate = date.getDayOfMonth() +" / " + date.getMonthValue() +" /"+ date.getYear();
        pre.setString(3,strDate);


        return pre.executeUpdate();


    }

    public static void main(String[]args){
        try {
            Connection connect = TaskConnection.getConnection();

            String query = "Insert into task(id,taskName,taskDeadline) values (?,?,?)";
            PreparedStatement pre = connect.prepareStatement(query);
            System.out.println(insertnewTask(pre,2,"task2",LocalDate.of(2022,3,12)));
            String getTask = "select* from task where id = 2";
            Statement st = connect.createStatement();
            ResultSet result = st.executeQuery(getTask);

            while (result.next()){
                System.out.println(result.getInt("id")+" " + result.getString("taskName"));
            }

        }catch (Exception e){
             System.out.println(e);
        }


    }


}
