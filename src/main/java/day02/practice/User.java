package day02.practice;

public class User {
    static  int users = 0;
    private String name ;
    private int id ;
    private String password;
    private String email;
    public void setName(String name){
        this.name = name ;
        users++;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public static void userCount(){
        System.out.println(users);

    }

    public static void main (String [] args){
        User person  = new User();
        person.setName("Abdul");
        person.setEmail("abdul@gmail.com");
        person.setPassword("abdu");
        person.setId(1);
        System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println(person.getId());
        System.out.println(person.getPassword());
        userCount();



    }
}
