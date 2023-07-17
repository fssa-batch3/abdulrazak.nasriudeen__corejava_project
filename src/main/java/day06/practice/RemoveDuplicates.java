package day06.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {


    public static void main(String[]args){
        List <String> cities = new ArrayList<String>();
        cities.add("Chennai");
        cities.add("Trivandrum");

        cities.add("Bombay");
        cities.add("Delhi");

        cities.add("Mumbai");
        cities.add("Mumbai");
        cities.add("Tamil Nadu");
        System.out.println(cities);
        List <String> sortedCity = new ArrayList<String>();

        sortedCity.add(cities.get(0));

        int k = 0 ;
        for(int i = 0 ; i<cities.size() ; i++){
            String chk  = cities.get(i);
            if(sortedCity.contains(chk) == false){
                sortedCity.add(chk);
                k++;
            }
        }
        System.out.println(sortedCity);

    }
}

