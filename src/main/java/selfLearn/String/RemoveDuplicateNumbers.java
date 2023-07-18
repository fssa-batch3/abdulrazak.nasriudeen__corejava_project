package selfLearn.String;
import java.util.Scanner;

public class RemoveDuplicateNumbers {

    public static int[] stringtoArray (String a ){
        int[] arr = new int[a.length()];
        for(int i =0 ; i < a.length(); i++){
            int x = Integer.parseInt(String.valueOf(a.charAt(i)));
            arr[i] = x ;
            System.out.println(arr[i]);
        }

        return arr ;
    }

    public static String removeDuplicateNum(int[] ar){
        String str = Integer.toString(ar[0]);

        for(int i = 0 ; i < ar.length ; i++){
            boolean chk = false ;

            for(int j = 0 ; j < str.length() ; j++){
                String x =  Integer.toString(ar[i]);
                String y =  Character.toString(str.charAt(j));
                if(x.equals(y)){
                    chk = true;
                }




            }
            if(!chk){
                str += Integer.toString(ar[i]);
            }
        }
        return  str;


    }

    public static void main(String[]args){
        int [] arr = {1,1,1,3,4,5,5,5,5,5,6,7,8,8,8,8,9,9,9,5,4,9};
        String str = removeDuplicateNum(arr);
        int [] arr2 = stringtoArray(str);


    }

}
