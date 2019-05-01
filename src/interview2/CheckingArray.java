package interview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckingArray {

    public static void main(String[] args) {
    int [] ar1={5,4,2,3,6};
        int [] ar2={5,4,2,3,6,8,9};
        List<Integer> x= Arrays.asList(5,4,2,3,6);
        List<Integer>y= Arrays.asList(5,4,2,3,6,8,9);

        if (y.containsAll(x)){
            System.out.println("true");
        }else{

            System.out.println("false");
        }

    }


}
