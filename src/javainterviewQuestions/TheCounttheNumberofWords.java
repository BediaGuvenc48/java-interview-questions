package javainterviewQuestions;

public class TheCounttheNumberofWords {
	
	
	public static void main(String[] args) {
		
		
	String z="bugun hava guzel";	
	count(z);
	
		
	}
	
	
	
	public static void count(String z) {
		
		String [] ar=z.split(" ");
		System.out.println(ar.length);
		
		
		
	}

}
