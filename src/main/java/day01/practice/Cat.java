package day01.practice;

public class Cat {
    private String color;
    private String age;
    private String speak;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getage() {
        return age;
    }
    public void setage(String age) {
        this.age = age;
    }
    public void speak() {
        System.out.println("Meow!");
    }
    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setage("4");
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setage("3");
        System.out.println("Cat 1 --------------------------------");
        System.out.println("Age: " + cat1.getage());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Cat 2 --------------------------------");
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Age: " + cat2.getage());
        System.out.print("Speaks: " ); cat2.speak();
    }
}
