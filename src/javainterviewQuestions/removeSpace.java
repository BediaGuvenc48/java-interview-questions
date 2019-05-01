package javainterviewQuestions;

public class removeSpace {
	
	
	public static void main(String[] ar) {
		
		
		String word="asf fsf af";
		removeSpace(word);
		
		
	}
	
	public static void removeSpace(String word) {
		System.out.println(word.replace(" ", ""));
		
	}
}


