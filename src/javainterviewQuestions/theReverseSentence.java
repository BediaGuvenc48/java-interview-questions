package javainterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class theReverseSentence {


    public static void main(String[] args) {

        reverseSentence("today is wonderful day");
        reverseWithSplit("today is wonderful day");

    }

    public static void reverseSentence(String x) {
        //  String x = "today is wonderful day";

        // day wonderful is today;
        String reverseSentence = "";
        List<String> reverse = new ArrayList<>();

        for (int i = 0; i < x.length(); i++) {
            if (x.substring(i, i + 1).equals(" ")) {

                reverse.add(x.substring(0, i));
                x = x.substring(i + 1);
                i = 0;
            }
        }
        reverse.add(x);
        System.out.println(reverse);

        for (int i = reverse.size() - 1; i >= 0; i--) {
            reverseSentence += reverse.get(i) + " ";

        }
        System.out.println(reverseSentence.trim());

    }

    public static void reverseWithSplit(String x) {

        String[] ar = x.split(" ");
        String reverse = "";
        for (int i = ar.length - 1; i >= 0; i--) {

            reverse += ar[i] + " ";
        }

        System.out.println(reverse.trim());

    }
}




