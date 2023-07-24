package day06;

import org.junit.jupiter.api.Test;
import day06.practise.RemoveDuplicates;

import java.util.ArrayList;
import java.util.List;


public class RemoveDuplicatesTest {

    @Test
     void removeDuplicateTest(){
        RemoveDuplicates tamilNadu = new RemoveDuplicates();

        tamilNadu.cities = new ArrayList<>();
        tamilNadu.cities.add("Chennai");
        tamilNadu.cities.add("Madurai");
        tamilNadu.cities.add("Thirunelveli");
        tamilNadu.cities.add("Theni");
        tamilNadu.cities.add("Chennai");

        List<String> chk = tamilNadu.removeDuplicate(tamilNadu.cities);

        RemoveDuplicates tamilNadu3 = new RemoveDuplicates();

        tamilNadu3.cities = new ArrayList<>();
        tamilNadu3.cities.add("Chennai");
        tamilNadu3.cities.add("Madurai");
        tamilNadu3.cities.add("Thirunelveli");
        tamilNadu3.cities.add("Theni");
        if(chk.equals(tamilNadu3.cities)){
            System.out.print("Method  is working ");
        }else{
            System.out.print("Method is not working ");
        }
    }
    public static void main(String[]args){
        RemoveDuplicatesTest ab =  new RemoveDuplicatesTest();
        ab.removeDuplicateTest();
    }
}
