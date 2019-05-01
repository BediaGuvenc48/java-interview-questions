package javainterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortArrayWithoutMethod {


    public static void main(String[] args) {
       // int [] arr= {10,12,15,1,16,18,19,31,52,6};
        int[] arr = {9, 5, 1, 4, 9, 8, 3, 3};
     //   int arr[] = {9, 6, 8, 3, 4, 7};


         bublesortforlOOOp(arr);

    }
//
//    public static void maxArray(int [] ar){
//        //  int ar[]={2,3,1,6,3};
//        //expected {6}
//        int max=ar[0];
//        for (int i=0; i<ar.length;i++){
//
//            if(ar[i]>max){
//
//                max= ar[i];
//            }
//        }
//
//        Arrays.sort(ar);
//        System.out.println(ar[ar.length-1]);
//        System.out.println(max);
//
//    }
//
//    public static void maxArray2(int ar[]){
//
//
//        List<Integer> list=  Arrays.asList(2,3,1,6,3);
//
//
//        Collections.sort(list);
//        System.out.println(list.get(list.size()-1));
//
//    }
//
//
//    public static void secondMaxArray(int [] ar){
////        //  int ar[]={2,3,1,6,3};
////        //expected {3}
////        int max=ar[0]; int secondMax=ar[0];
////        for (int i=0; i<ar.length;i++){
////
////            if(ar[i]>max){
////
////                max= ar[i];
////            }
////
////            if(secondMax<max){
////                secondMax=
////            }
////
////
////        }
////        System.out.println(max);
//
//    }
//
//
//
//
//    public static void sortedArray(int [] arr){
//
//      //  int [] arr= {10,12,15,1,16,18,19,31,52,6};
//
//        for(int i=1;i< arr.length;i++) {
//
//            if(arr[i] < arr[i-1] )
//
//            {
//
//                arr[i] =arr[i] +arr[i-1];
//
//                arr[i -1 ] = arr[i] -arr[i-1];
//
//                arr[i] = arr[i] - arr[i-1];
//
//                i=0;
//
//            }
//
//        }
//
//        System.out.println("sorted Array :");
//
//        for(int i=0;i<arr.length;i++) {
//
//            System.out.println(arr[i] + " ");
//
//        }
//    }

    public static void  bublesortforlOOOp(int [] ar){
        int temp, counter=0;
        for (int i=0; i<ar.length; i++){
            counter=0;
            for (int j=0; j<ar.length;j++){

                if (ar[i]>ar[j]){
                  temp=ar[i];
                  ar[i]= ar[j];
                  ar[j]= temp;
                  counter++;
                }
            }

            if (counter==0)break;
        }

        System.out.println("sorted Array :");

        for(int i=0;i<ar.length;i++) {

            System.out.println(ar[i] + " ");

        }

        System.out.println("The second value " + ar[ar.length-2]);

    }





    //compare jasont pair
    //if the adjacent pair are out of order swap them
    //repeat until swap counter =0;==>we dont wanna switch them
    //Look at it jason pair


}
