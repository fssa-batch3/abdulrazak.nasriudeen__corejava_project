package day07;

import org.junit.jupiter.api.Test;
import day07.practice.ArrayElementsIntoSets;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayToSetsTest {
    @Test
    void ArraytoSet(){
        ArrayElementsIntoSets ac = new ArrayElementsIntoSets();
        ArrayList <Integer> arr = new ArrayList<>();
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
        arr.add(1000);

        arr.add(10);

        arr.add(10);
       // System.out.print(arr);
        HashSet <Integer>  harr = new HashSet<>(arr);
        HashSet <Integer> testHas = new HashSet<>();
        testHas.add(100);
        testHas.add(5);
        testHas.add(6);
        testHas.add(7);
        testHas.add(8);
        testHas.add(1000);
        testHas.add(9);
        testHas.add(10);
        testHas.add(12);



        System.out.print(harr);
        System.out.print(testHas);
        if(harr.equals(testHas)){
            System.out.print("Working");

        }else{
            System.out.print("Not working");

        }



    }
}
