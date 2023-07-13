package selfLearn.String;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Arrays;



class RemoveDuplicatesArrange {

    public static String removeDuplicate(String a){
        String b = "";
        b += a.charAt(0);
        for(int i  = 1 ; i < a.length(); i++){

            boolean chk = false;
            for(int j = 0 ; j <b.length();j++){
                if(a.charAt(i)==b.charAt(j)){

                    chk = true;
                }
            }
            if(!chk){
                b+= a.charAt(i);
            }


        }
        return b;



    }
    public static String arrangingIntoOrder(String a ) {
        String b = "";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String Abc = abc.toUpperCase();
        int []ar = new int[a.length()];
        for(int i = 0 ; i<a.length(); i++){
            for(int j  = 0 ; j < abc.length(); j++){
                if(a.charAt(i)==abc.charAt(j)||a.charAt(i)==Abc.charAt(j)){
                    ar[i] = j ;
                }

            }
        }
        Arrays.sort(ar);
        for(int i : ar){
            b += abc.charAt(i);
        }

        return b ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String  b = removeDuplicate(a);
        String c = arrangingIntoOrder(b);

        for(int i = 0 ; i < c.length() ; i++){
            int count = 0;
            for(int j = 0 ; j <a.length() ; j++){
                if(c.charAt(i) == a.charAt(j)){
                    count++;
                }
            }
            System.out.println(c.charAt(i) + count);
        }

        System.out.println(b);
        System.out.print(c);
    }
}