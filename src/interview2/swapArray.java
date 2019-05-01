package interview2;

public class swapArray {

    public static void main(String[] args) {

        int [] ar={3,2,1,5,6};

        //int [] ar= {6,5,1,2,3};
        swapArray(ar);
    }

    public static void swapArray(int n[]) {

        for (int i = 0; i < n.length / 2; i++) {

            int temp = n[i];

            n[i] = n[n.length - 1 - i];

            n[n.length - 1 - i] = temp;


        }


        for (int i = 0; i < n.length; i++) {

            System.out.println(n[i] + " ");

        }
    }

    }


