package day09.practice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortByPriority implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int com = o1.getDeadline().compareTo(o2.getDeadline());
        if(com != 0){
            return  com ;
        }
        return o1.getPriority() - o2.getPriority();
    }
}
class sortById implements Comparator<Task> {



    @Override
    public int compare(Task o1, Task o2) {


        return o1.getId() - o2.getId();
    }
}
class sortByName implements Comparator<Task> {

    // Method
    public int compare(Task a, Task b)
    {

        return a.getName().compareTo(b.getName());
    }
}
public class TaskSorting {
    public  static void main(String[]args){
        Task tsk1 = new Task(1,"Task1", LocalDate.of(2023,7,26),5);
        Task tsk2 = new Task(2,"Task2",LocalDate.of(2023,7,25),2);
        Task tsk3 = new Task(3,"Task3",LocalDate.of(2023,7,26),6);
        Task tsk4 = new Task(4,"Task4",LocalDate.of(2023,7,20),8);
        Task tsk5 = new Task(5,"Task5",LocalDate.of(2023,7,29),9);
        Task tsk6 = new Task(7,"Task6",LocalDate.of(2023,7,27),1);
        Task tsk7 = new Task(6,"Task7",LocalDate.of(2023,7,26),3);

        List<Task> tasks = new ArrayList<Task>();
        tasks.add(tsk1);
        tasks.add(tsk2);
        tasks.add(tsk3);
        tasks.add(tsk4);
        tasks.add(tsk5);
        tasks.add(tsk6);
        tasks.add(tsk7);  // adding Tasks
        System.out.println("-------------------Normal List -------------------------");
        Collections.sort(tasks);
        Task.printTasks(tasks); // unsorted tasks
        System.out.println("---------------------Sorted By priority ----------------");
        tasks.sort(new sortByPriority()); // sorting based on priority
        Task.printTasks(tasks);
        System.out.println("----------------------Sorted by id ---------------------");
        tasks.sort(new sortById()); // sorting by id
        Task.printTasks(tasks);
        System.out.println("----------------------Sorted by Name ---------------------");
        tasks.sort(new sortByName()); // sorting by id
        Task.printTasks(tasks);

    }
}
