package day12.practice;
import day09.practice.Task;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskDev  {
    public static void CreateTask(Connection connect,int id , String task , LocalDate date,String sts) throws DevException {
      try {


        String query = "insert into task(id,taskName,taskDeadLine,taskStatus) values(?,?,?,?)";
        PreparedStatement pre = connect.prepareStatement(query);
        pre.setInt(1,id);
        pre.setString(2,task);
        String str = date.getDayOfMonth()+" / " +date.getMonth()+" / "+ date.getYear();
        pre.setString(3,str);
        pre.setString(4,"pending");

        int i = pre.executeUpdate();
        if(i==1){
            System.out.println("Inserted");
        }
    }catch (SQLException e){
          throw  new DevException(e,"Data is not inserted");

      }

    }
    public static void updateTask(Connection connect , String task , String update)throws DevException{
        try{
        String query = "update task set taskStatus = ? where taskName = ?";
        PreparedStatement pre = connect.prepareStatement(query);
        pre.setString(1,update);
        pre.setString(2,task);
        int i = pre.executeUpdate();
        if(i == 1){
            System.out.print("Updated task status");
        }
        }catch (SQLException e){
            throw new DevException(e);
        }
    }

    public static void deleteTask(Connection connect,int id)throws DevException{
        try {
            String query = "DELETE FROM task WHERE id = ?;";
            PreparedStatement pre = connect.prepareStatement(query);
            pre.setInt(1,id);
           int i =  pre.executeUpdate();
           if(i == 1){
               System.out.println("Task deleted Successfully");
           }
        }catch (SQLException e){
            throw new DevException(e);

        }

    }
    public static void getTask (Connection connect)throws DevException{
        try {
            List<Task> Tasks = new ArrayList<>();
            String query = "select* from task";
            Statement pre = connect.createStatement();
            ResultSet re = pre.executeQuery(query);
            while(re.next()){
                Task tsk = new Task();
                int id = re.getInt("id");
                String name = re.getString("taskName");
                String dead = re.getString("taskDeadLine");
                tsk.setId(id);
                tsk.setName(name);
                tsk.setDeadline(dead);
                Tasks.add(tsk);
            }

            Task.printTasks(Tasks);




        }catch (SQLException e){
            throw new DevException(e);
        }

    }



}
