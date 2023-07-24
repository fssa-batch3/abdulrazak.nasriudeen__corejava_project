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
    private int id;
    private String name;
    private String deadline;

    public TaskDuplicates(int id , String name , String dead){
        this.id = id ;
        this.name = name;
        this.deadline = dead;
    }

    public static void main(String[]args){
        TaskDuplicates tsk1 = new TaskDuplicates(1,"Wish Someone","2023 12 1");
        TaskDuplicates tsk2 = new TaskDuplicates(2,"Wish Someone1","2023 12 1");
        TaskDuplicates tsk3 = new TaskDuplicates(3,"Wish Someone2","2023 12 1");
        TaskDuplicates tsk4 = new TaskDuplicates(4,"Wish Someone3","2023 12 1");
        TaskDuplicates tsk5 = new TaskDuplicates(5,"Wish Someone4","2023 12 1");
        TaskDuplicates tsk6 = new TaskDuplicates(6,"Wish Someone5","2023 12 1");
        TaskDuplicates tsk7 = new TaskDuplicates(7,"Wish Someone6","2023 12 1");
        TaskDuplicates tsk8 = new TaskDuplicates(1,"Wish Someone","2023 12 1");
        ArrayList <TaskDuplicates> tasks = new ArrayList<>();
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
        HashSet <TaskDuplicates> taskSet = new HashSet<>(tasks);
        System.out.println(taskSet.size());





    }

}
