package javainterviewQuestions;

public class stringManipulations {

    //	1, write a program to reverse a string
//	2, write a program to find all occurrence of certain character or word
//	3, write a program to count all occurrence of certain character or word
//	4, write a program to get the sum of numbers from 1 to a number user specified
//	5, write a program to extract lowercase letter from a given String — a1b2c3 --> abc
//	6, write a program to get unique characters from a string  : aaabbccc —> abc

    public static void main(String[] args) {
        String str="shflsgfa";
        occurenceWord(str);
        String y="a1b2c3";
        extractWord(y);

    }

    public static void occurenceWord(String str){
        //String str="shflsgfa";
        int count=1; String occurence="";

        for (int i=0; i<str.length();i++) {
            count = 1;
            for (int j = 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                }
            }

            if (!occurence.contains(str.substring(i, i + 1))) {
                occurence += str.substring(i, i + 1) + " " + count + ", ";

            }
        }

            System.out.println(occurence.trim());

        }

       // 5, write a program to extract lowercase letter from a given String — a1b2c3 --> abc

    public static void extractWord(String str){


        String lowerCase="";


        for (int i=0; i<str.length();i++){

            if (str.charAt(i)>=97&& str.charAt(i)<=122){//based on Asci table a--97 z--122 it will take all the values between these numbers
                lowerCase+= str.substring(i,i+1);
            }
        }
        System.out.println(lowerCase);


    }
}
