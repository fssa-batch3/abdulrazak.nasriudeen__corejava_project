package day06.solved;
import java.util.Arrays;

public class StringArray {
    public static String[] addElement (String [] a , String b  ){
        String [] ab = new String[a.length + 1] ;
        for(int i = 0 ; i < a.length ; i++){
            ab[i] = a[i];
        }
        ab[a.length] = b ;


        return ab ;
    }
    public static String[] deleteElement(String []a , String b){
        String [] arr = new String [a.length-1] ;
        int index = 0 ;
        for(int i = 0  ;  i < a.length ; i++){
            if(b .equals(a[i])){
                index = i ;
                break;
            }

        }
        int k = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(i == index){
                continue;
            }else {
                arr[k] = a[i];
                k++;

            }

        }

        return arr ;
    }

    public static void main(String [] args){
        String[] cityArr = new String[3];
        cityArr[0] = "Chennai";
        cityArr[1] = "Bangalore";
        cityArr[2] = "Mumbai";
        cityArr = addElement(cityArr,"delhi");
        cityArr = addElement(cityArr,"Bombay");
        System.out.println(Arrays.toString(cityArr));
        cityArr = deleteElement(cityArr,"Chennai");
        System.out.print(Arrays.toString(cityArr));



    }
}
