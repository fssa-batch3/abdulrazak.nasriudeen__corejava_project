package day07.practice;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.ArrayList;

public class ArrayElementsIntoSets {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(10);
        arr.add(7);
        arr.add(10);
        arr.add(10);
        arr.add(6);  arr.add(100);
        arr.add(5);

        arr.add(10);

        arr.add(10);
        System.out.println(arr);

        HashSet<Integer> ar = new HashSet<>(arr);
        System.out.println(ar);
        TreeSet<Integer> ar2 = new TreeSet<>(arr);
        System.out.println(ar2);



    }


}
