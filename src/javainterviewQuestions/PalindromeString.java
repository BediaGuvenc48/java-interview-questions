package javainterviewQuestions;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static boolean isPalindrome(String str) {
		
		
		StringBuilder sb= new StringBuilder(str);
		
		String reverse= sb.reverse().toString();
		
		return reverse.equals(str);
	
	
	}
	
	
	
//	public static boolean Palindrome(String x) {
//
//		String reverse="";
//
//	int head=0;
//	int tail=x.length()-1;
//
//	while(head<tail) {
//
//		if(x.charAt(head)!=x.charAt(tail)) {
//
//			return false;
//		}
//
//		head--;
//		tail++;
//		}
//
//		return true;
//	}





		
	}

