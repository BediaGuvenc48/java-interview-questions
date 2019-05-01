package javainterviewQuestions;

public class FibonacciNumber {
	
	/*
	 * Interviewer provided:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
n = 1, return 0
n = 2, return 1
n = 3, return 1
n = 4, return 2
n = 5, return 3
and so on..
public int Fibonacci(int n) {
//your code here
}
explanation: So whatever integer you put in the method, you should get (n) th
number of Fibonacci.*/

//	public static int fibonnaci(int index) {
//		//0,1,1,2,3,5,8,13
//		
//		if(index<=0)return 0;
//		if(index==1) return 1;
//		
//		
//		
//		return  (index-1) +(index-2);
//		
//		//return  fibonnaci(index-1) + fibonnaci(index-2);
//		
//	}

	public static void main(String[] args) {

		fibonacciswap(5);

		System.out.println(Fibonacci(5));
	}


	public static int Fibonacci(int x) {

		if (x <= 0) return 0;
		if (x == 0) return 1;


		//0,1,1,2,3,5,8,13
		int ar[] = new int[x];

		ar[0] = 0;
		ar[1] = 1;


		for (int i = 2; i < ar.length; i++) {
			ar[i] = ar[i - 1] + ar[i - 2];
		}


		return ar[x - 1];

	}
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//	n = 1, return 0
//	n = 2, return 1
//	n = 3, return 1
//	n = 4, return 2
//	n = 5, return 3


	public static void fibonacciswap(int n) {


		if (n <= 0) System.out.println(0);
		if (n == 1) System.out.println(1);
		int a = 0;
		int b = 1;


		System.out.println(a+" "+ b);
		for (int i = 2; i <= n; i++) {

			int c = a + b;
			a = b;
			b = c;
			System.out.print(c);
		}


	}
}




	
	
	

	
	
