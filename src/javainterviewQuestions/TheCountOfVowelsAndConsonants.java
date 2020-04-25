package javainterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TheCountOfVowelsAndConsonants {

    public static void main(String[] args) {
        int [] ar={3,6,9,8};




    }

    public static String numbers(String word) {


        int countVowels = 0;
        int countConsonants = 0;





        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> consonants = new ArrayList<>();

        for(char i = 'a'; i <= 'z'; i++) {
            if(!vowels.contains(i)) {
                consonants.add(i); }
        }
        word = word.toLowerCase();

        for( int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i))) {
                countVowels++;
            }else {
                countConsonants++; }
        }
        return "number of vowels is " + countVowels + " and number of consonants is " + countConsonants; }



}
