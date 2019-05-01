package javainterviewQuestions;

public class Factorial {
	
	
	
	
	public static int factorial(int n) {
		
		//1*2*3*4
		
		//1*1
		//1*2
		//2*3
		//6*4
		int factorialSum=1;
		
		for(int i=1; i<=n;i++) {
			
		factorialSum=factorialSum*i;
		}
		
		return factorialSum;
		
		
		
		
		
		
		
	}
	

}
