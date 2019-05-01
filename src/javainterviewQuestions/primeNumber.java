package javainterviewQuestions;

public class primeNumber {
	public static void main(String[] args) {

		primeNumber(2);
		System.out.println(primeNumber(2));
	}

	
	
	public static boolean primeNumber(int n) {
		
		if(n<2)return false;
		
		
		for(int i=2;i<n;i++) {
			if(n%2==0)return false;
			
		}
		
		return true;
		
	}

}
