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
    public static Node createNodes(int n , Scanner scan , int hea){
        Node head = new Node(hea);
            Node temp = head ;
        for(int i = 2 ; i<= n ; i++){
            System.out.println("Enter the node of " + i);
            int ab = scan.nextInt();
            Node x =  new Node(ab);
            temp.next = x ;
            temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes  : ");
        int n = scan.nextInt();
        System.out.println("Enter the head node ");
        int x  = scan.nextInt();

        Node head = createNodes(n,scan,x);

        System.out.println("The created nodes are ");
        print(head);
}





}
