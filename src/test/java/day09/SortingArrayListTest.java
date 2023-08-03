package day09;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingArrayListTest {

    @Test
     void ArrayListTest(){
        Scanner scan =  new Scanner(System.in);
        int n =  scan.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++){
            int x =  scan.nextInt();
            arr.add(x);

        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("After sorting ");
        System.out.println(arr);



    }
}
