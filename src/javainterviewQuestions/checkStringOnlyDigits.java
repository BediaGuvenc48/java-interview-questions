package javainterviewQuestions;

public class checkStringOnlyDigits {
	
	public static void main(String [] args) {
		
		String word="asf456";
		Digits(word);
		
	}
	public static void Digits(String word) {
		
		
		
		System.out.println(word.matches("[0-9]+"));
		
		String u="34";
		int x= Integer.valueOf(u);
		int z= Integer.parseInt(u);
		Integer k= Integer.parseInt(u);
		
		
		System.out.println(z);
		System.out.println(k);
		System.out.println(x);
		
		
		
		
		
//		for(int i=0; i<word.length()-1; i++) {
//			
//			if(Character.isDigit(word.charAt(i))) {
//				System.out.println(true);
//				break;
//			}
//		}
		
		
	}

}
