package day03.solved;

public class AccountConstructor {
   public String name ;
    public int accNo ;
    public  double balance ;

    public AccountConstructor(String name , int accNo ,double balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        for (int i  = 0 ; i < 3 ; i++){
            this.balance += 1.7;

        }
        System.out.println(this.name + " " + this.accNo + " " +this.balance );




    }
    public static void main(String[]args){
        AccountConstructor acc1 = new AccountConstructor("abdul",1234,500);
        AccountConstructor acc2 = new AccountConstructor("razak",1567,50);



    }
}
