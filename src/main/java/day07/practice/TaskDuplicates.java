package day07.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;


class Task{
    private int id;
    private String name;
    private String deadline;

    public Task(int id , String name , String dead){
        this.id = id ;
        this.name = name;
        this.deadline = dead;
    }


}
public class TaskDuplicates {

    public static void main(String[]args){
        Task tsk1 = new Task(1,"Wish Someone","2023 12 1");
        Task tsk2 = new Task(2,"Wish Someone1","2023 12 1");
        Task tsk3 = new Task(3,"Wish Someone2","2023 12 1");
        Task tsk4 = new Task(4,"Wish Someone3","2023 12 1");
        Task tsk5 = new Task(5,"Wish Someone4","2023 12 1");
        Task tsk6 = new Task(6,"Wish Someone5","2023 12 1");
        Task tsk7 = new Task(7,"Wish Someone6","2023 12 1");
        Task tsk8 = new Task(1,"Wish Someone","2023 12 1");
        ArrayList <Task> tasks = new ArrayList<>();
        tasks.add(tsk1);
        tasks.add(tsk2);
        tasks.add(tsk3);
        tasks.add(tsk4);
        tasks.add(tsk5);
        tasks.add(tsk6);
        tasks.add(tsk7);
        tasks.add(tsk1);
        tasks.add(tsk8);
        tasks.add(tsk8);

        System.out.println(tasks.size());
        HashSet <Task> taskSet = new HashSet<>(tasks);
        System.out.println(taskSet.size());




    }

}
