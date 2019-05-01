package javainterviewQuestions;

public class palindromInteger {
	
	public static void main(String[] args) {
		
	//	System.out.println(palindromeInteger(123321));
		
		System.out.println(sumOfDigits(1346));
palindrome(123321);
		
	}



	public static void palindrome(int y){

		int number= y;   // 123123    12312
		                  //3         1231
		int reverse=0;
		int remainder=0;

		while(y>0){

			remainder= y%10;
			reverse= reverse*10+remainder;
			y=y/10;

		}

		if (number==reverse) {
			System.out.println("palindrome");
		}else{
			System.out.println("this is not palindrome");
		}





	}
//
//	public static boolean palindromeInteger(int n) {
//
//
//		int number=n;
//
//		int remainder=0;
//
//		while(n>0) {
//
//			remainder=(remainder*10)+n%10;
//
//			n=n/10;
//
//		}
//
//		if(remainder==number)return true;
//
//
//
//	return false;
//
//}
	
	public static int sumOfDigits(int n) {
		
		int sum=0;
		
		
	while(n>0) {
		
		sum=sum+ n%10;
		
		n= n/10;	
	}
	
	return sum;	
		
	}
}
