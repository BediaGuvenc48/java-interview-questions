package interview2;

public class fibonacciNumber {

    public static void main(String[] args) {
        int n=5;
       // System.out.println(fibonacciNumber(n));
   fibonnaciNumberForLoop(5);

    }

    public static int fibonacciNumber(int n){

        if (n==0)return 0;
        if (n==1)return 1;

        int [] ar= new int[n];
      ar[0]=0;
      ar[1]=1;
      for (int i=2;i<n;i++){

          ar[i]= ar[i-1]+ar[i-2];

      }
      return ar[ar.length-1];

    }



    public static void fibonnaciNumberForLoop(int n){
        if (n==0) System.out.println(0);
        if (n==1)System.out.println(1);
int a=0; int b=1;
        System.out.print(a +" "+ b+" ");
        for (int i=2;i<=n;i++){

         int c= a+b;
         a=b;
         b=c;
            System.out.print(" "+c+" ");
        }



    }
}
