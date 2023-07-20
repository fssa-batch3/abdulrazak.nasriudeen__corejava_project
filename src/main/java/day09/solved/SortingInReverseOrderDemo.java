package day09.solved;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInReverseOrderDemo {
    public static void main(String[] args) {
        ArrayList<Integer> deptNames = new ArrayList<Integer>();
        deptNames.add(5);
        deptNames.add(90);
        deptNames.add(10);
        deptNames.add(7);

        System.out.println("Before Sorting: " + deptNames);
        Collections.sort(deptNames);
        System.out.println("After Sorting: " + deptNames);

        Collections.reverse(deptNames);
        System.out.println("Reverse:" + deptNames);



        ArrayList<String> deptNames2 = new ArrayList<String>();
        deptNames2.add("B");
        deptNames2.add("D");
        deptNames2.add("A");
        deptNames2.add("C");

        System.out.println("Before Sorting in reverse: " + deptNames2);
        Collections.sort(deptNames2, Collections.reverseOrder());
        System.out.println("Reverse in reverse Order:" + deptNames2);
    }
}