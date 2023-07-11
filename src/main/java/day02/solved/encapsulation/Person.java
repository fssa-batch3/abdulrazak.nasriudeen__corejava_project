package day02.solved.encapsulation;

public class Person {
    private String name ;

    public void setName(String nam){
        this.name = nam;

    }
    public String getName(){
        return name ;
    }

    public static void main(String [] args){
        Person p1 = new Person();
        p1.setName("Razz");
        String nam = p1.getName();
        System.out.println(nam);


    }
}
