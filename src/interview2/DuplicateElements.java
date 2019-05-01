package interview2;

public class DuplicateElements {

    public static void main(String[] args) {
        int [] array={5,5,1,4,2,3,3};
        duplicateElements(array);

    }

    public static void duplicateElements(int [] ar){

//==>5,3



        for (int i=0; i<ar.length;i++){

            for (int j=0; j<ar.length;j++){
                if (ar[i]==ar[j]&& i!=j){


                    System.out.print(ar[i]);
                }

            }
        }

    }
}
