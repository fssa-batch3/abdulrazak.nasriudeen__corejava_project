package day09.practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

    public  static void main(String[] args){
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
