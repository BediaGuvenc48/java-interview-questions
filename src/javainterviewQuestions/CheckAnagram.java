package javainterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckAnagram {


    public static void main(String[] args) {

        String word = "Listen";
        String word2 = "Silent";

        boolean z = anagram(word, word2);

        System.out.println(z);



    }


    public static boolean anagram(String word, String word2) {


        word = word.toLowerCase();
        word2 = word2.toLowerCase();


        String[] ar1 = word.split("");
        String[] ar2 = word2.split("");

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return Arrays.equals(ar1, ar2);

    }





}
