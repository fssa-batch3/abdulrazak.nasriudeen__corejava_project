package day02.solved.encapsulation;
//Encapsulation is a way to restrict the direct access to some components of an object
//
public class TestBankAccount {
    private String name;
    private String accNo ;

    private int balance ;

    public void setAccNo(String accNo) {
            this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args){
        TestBankAccount person = new  TestBankAccount();
        person.setName("Razak");
        person.setAccNo("A0048");
        person.setBalance(10000000);
        System.out.println(person.getName());
        System.out.println(person.getAccNo());
        System.out.println(person.getBalance());

    }

}
