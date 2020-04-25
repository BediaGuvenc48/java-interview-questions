package DSDiscussion;
import java.util.*;
public class theCountOfCharacter {

    public static void main(String[] args) {
        String word = "hashmapdiscussion";
        countOfCharacter(word);

        HashMap<String, Integer> cache = new HashMap<String, Integer>();

        cache.put("put",1);
        cache.put("put",2);

        System.out.println(cache);
    }
    public static void countOfCharacter(String word) {
        String[] ar = word.split("");//I am splitting each character given array
        Map<String, Integer> letter = new HashMap<>();//creating HashMap storing String and Integer data type

        for (String ax : ar) {//iterate each character
            if (!letter.containsKey(ax)) {//if our map does not contain this letter
                //containsKey()=>method is used to check if this map contains a mapping for specified key
                letter.put(ax, 1);//put inside the Map and value should be 1 *** since first time we define our key
            } else {
                int frequent = letter.get(ax);//get()=> return the value of the specified key belongs the HasMap
                //if we come across second times letter coming else block and
                //find the value of the letter and add 1 more.
                letter.put(ax, frequent + 1);
            }
        }
        System.out.println(letter);
    }
}
