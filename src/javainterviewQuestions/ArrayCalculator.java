package javainterviewQuestions;

import java.util.Arrays;

public class ArrayCalculator {


    public static void main(String[] args) {


        // how to add value in array

        int [] score={5,56,23,70,3};




        score=Arrays.copyOf(score,7);

        score [5]= 40;
        score [6]=12;

        //binary search
        Arrays.sort(score);

        int index= Arrays.binarySearch(score,56);
        System.out.println(" the index of 56 "+index);







        // write a method whic will take int array as input and print two numbers in that array whose sum equal to 100;


        int [] ar={1,2,67,35,65,99,22,78};
        // 1,99    35,65   22, 78
        calculateArray(ar);
    }


    public static void calculateArray(int ar[]){

        String x= "";

        for (int i=0; i<ar.length; i++){

            for (int j=1; j<ar.length;j++){

                if (ar[i]+ar[j]==100){

                    x+= ar[i]+","+ar[j]+" ";
                    continue;
                }

            }
        }

        System.out.println(x);





    }


}
