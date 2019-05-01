package javainterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class UniqueChar {


    public static void main(String[] args) {

        String str = "asfasdfdsdfsdfrt";

        String unique = "";

       // char z ='';


        for (int i=0; i<str.length();i++){
            if (!unique.contains(str.substring(i,i+1))){
                unique=unique+str.substring(i,i+1);
            }
        }
        System.out.println(unique);



        List<Character> ch = new ArrayList<>();



        for (int i=0; i<str.length();i++){

            if (!ch.contains(str.charAt(i))){
                ch.add(str.charAt(i));
            }
        }
        System.out.println(ch);
        System.out.println(ch.toString());
    }

}
