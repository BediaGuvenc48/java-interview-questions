package interview2;

public class getSecondLargest {

    public static void main(String[] args) {
        int[] array = {9, 5, 1, 4, 9, 8, 3, 3};
        bublesortforlOOOp(array);

    }

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

}
