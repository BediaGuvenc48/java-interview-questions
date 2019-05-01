package interview2;

public class maxCountOfChar {

    public static void main(String[] args) {
        String str="aaabbcc";
maxCountOfChar(str);
int [] n={4,9,3,6,2,7};
fibonnaci(n);

    }


    public static void maxCountOfChar(String str){
        //String str="aaabbcc";


       int length= str.length();
       char c=0;
       int max=0;
       int count=0;

       for (int i=0; i<length;i++){
           count=0;
           for (int j=0; j<length;j++){

               if (str.charAt(i)==str.charAt(j)){
                   count++;
               }


               if (count>max){

                   max=count;
                   c= str.charAt(i);
               }
           }
       }

        System.out.println("Character is  "+ c + " , Count is "+ max);
    }


  public static void fibonnaci(int n[]){

  int count=0;int temp=0;
  for (int i=0; i<n.length;i++){
      count=0;
      for (int j=0; j<n.length;j++) {

          if (n[i] > n[j]) {


              temp = n[i];
              n[i] = n[j];
              n[j] = temp;
              count++;

          }
      }

          if (count==0) break;


  }

      System.out.println("sorted Array :");


      for(int i=0;i<n.length;i++) {

          System.out.println(n[i] + " ");

      }

  }



}
