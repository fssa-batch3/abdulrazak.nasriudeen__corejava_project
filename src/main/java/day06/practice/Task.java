package day06.practice;
import java.util.ArrayList;
import java.util.List;
public class Task {
    String name ;
    int priority;

    public Task(String name , int prior){
        this.name = name;
        this.priority = prior;
    }

    public static boolean findbyTaskName (String a ,ArrayList<Task> ab){
        boolean chk = false;
        for(Task i :ab ){
            if(a.equals(i.name)){
                chk = true;
            }

        }
        return chk ;
    }

    public static void main(String[]args){
        Task tsk1 = new Task("settu" , 3);
        Task tsk2 = new Task("Krishna" , 4);
        Task tsk3 = new Task("SpderMan" , 3);
        ArrayList<Task> taskArr = new ArrayList<>();
        taskArr.add(tsk1);
        taskArr.add(tsk2);
        taskArr.add(tsk3);
        for(Task i : taskArr){ 
            System.out.print(i.name + "  ");
            System.out.println(i.priority);
            System.out.println("----------------------------");

        }
        System.out.print(findbyTaskName("SpiderMan",taskArr));





    }
}
