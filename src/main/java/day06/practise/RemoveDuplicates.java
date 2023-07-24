package day06.practise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
    public List <String> cities ;

    public  List<String> removeDuplicate(List<String>a){
        List <String> sortedCity = new ArrayList<String>();
        for(int i = 0 ; i<a.size() ; i++){
            String chk  = a.get(i);
            if(!sortedCity.contains(chk)){
                sortedCity.add(chk);

            }
        }
        return  sortedCity ;

    }


    public static void main(String[]args){
        RemoveDuplicates arr = new RemoveDuplicates();
        arr.cities = new ArrayList<String>();
        arr.cities.add("Chennai");
        arr.cities.add("Trivandrum");

        arr.cities.add("Bombay");
        arr.cities.add("Delhi");

        arr.cities.add("Mumbai");
        arr.cities.add("Mumbai");
        arr. cities.add("Tamil Nadu");
        System.out.println(arr.cities);

        System.out.println(arr.removeDuplicate(arr.cities));


    }
}

