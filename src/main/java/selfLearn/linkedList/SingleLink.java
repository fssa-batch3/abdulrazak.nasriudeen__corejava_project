package selfLearn.linkedList;
import java.util.Scanner;

class Node {
    int x  ;
    Node next ;

    public Node(int x){
       this.x = x ;
       this.next = null ;

    }
    public Node (){}


}
public class SingleLink{

    public static void print(Node a){
        Node x = a ;

        while(x.next != null){
            System.out.println(x.x);
            x = x.next;

        }
        System.out.print(x.x);

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes  : ");
        int n = scan.nextInt();
        Node head = new Node();
        Node temp = head ;
        for(int i = 1 ;  i <= n ; i++){
            System.out.println("Enter the value for node "+ i );
            int a =  scan.nextInt();
            if(i ==1){
                head.x = a ;



            }else{
               Node temp2 = new Node(a);
                temp.next = temp2;
                head.next = temp;

                temp = temp2 ;




            }


        }






        //Node head = new Node(10);


        print(head);
        //System.out.println(head.next.x);

    }





}
