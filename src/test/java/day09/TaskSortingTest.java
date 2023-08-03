package day09;

import day09.practice.Task;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSortingTest {
    @Test
    void test(){
        Task tsk1 = new Task(1,"Task1", LocalDate.of(2023,7,26),5);
        Task tsk2 = new Task(2,"Task2",LocalDate.of(2023,7,25),2);
        Task tsk3 = new Task(3,"Task3",LocalDate.of(2023,7,26),6);
        Task tsk4 = new Task(4,"Task4",LocalDate.of(2023,7,20),8);
        Task tsk5 = new Task(5,"Task5",LocalDate.of(2023,7,29),9);
        Task tsk6 = new Task(7,"Task6",LocalDate.of(2023,7,27),1);
        Task tsk7 = new Task(6,"Task7",LocalDate.of(2023,7,26),3);// creating objs

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(tsk1);
        tasks.add(tsk2);
        tasks.add(tsk3);
        tasks.add(tsk4);
        tasks.add(tsk5);
        tasks.add(tsk6);
        tasks.add(tsk7); // adding task to list

        Task.printTasks(tasks); // printing each obj

        System.out.println("--------------------------------------------");
        Collections.sort(tasks);
        Task.printTasks(tasks);





    }
}
