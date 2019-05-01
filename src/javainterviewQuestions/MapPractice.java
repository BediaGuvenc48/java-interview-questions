package javainterviewQuestions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {


        Map<String, Integer> map= new HashMap<>();

        map.put("Bedia", 92);
        map.put("murat",88);

        Set<String> keys= map.keySet();

        Collection<Integer> values= map.values();


        for (Map.Entry<String, Integer>  value: map.entrySet()){

           // value.getKey() + " " +value.getValue();
        }


    }
}
