package interview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkAnagram {

    public static void main(String[] args) {

        anagram("LISten","Silent");

    }


    //to be anagram=>it has to contains same characters in String
    //Does it matter to be upper case or lowerecase?
    public static void anagram(String w1, String w2){

        w1=w1.toLowerCase();
        w2=w2.toLowerCase();

        String [] ar1= w1.split("");
        String [] ar2= w2.split("");

        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }


//        List<String> list2= new ArrayList<>();
//
//        for (String word: ar2){
//            list2.add(word);
//        }
//        for (String letter: ar1){
//
//            if (!list2.contains(letter)){
//                System.out.println("Not anagram");
//            }
//        }




    }
}
