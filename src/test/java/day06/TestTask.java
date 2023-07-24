package day06;
import day06.practise.Task;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestTask {
    @Test
    void findTaskTest(){
        Task a1 = new Task("task1",1 );
        Task a2 = new Task("task2",2 );
        Task a3 = new Task("task3",3 );
        Task a4 = new Task("task4",4 );
        Task a5 = new Task("task5",8 );
        Task a6 = new Task("task6",9 );

        ArrayList<Task> Tasks =  new ArrayList<>();
        Tasks.add(a1);
        Tasks.add(a2);
        Tasks.add(a3);
        Tasks.add(a4);
        Tasks.add(a5);
        Tasks.add(a6);

        boolean chk = Task.findbyTaskName("task5",Tasks);

        if(chk){
            System.out.println("Working");
        }else{
            System.out.println("Not Working");
        }







    }


}
