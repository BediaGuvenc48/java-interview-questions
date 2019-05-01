package javainterviewQuestions;

public class firstNonRepatedCharacters {
	
	//first non repeated character write
	
	public static void main(String [] args) {
		
		String word="bdubajdasfa";//u
		
		firstCharacter(word);	
	}
	
	public static void firstCharacter(String word) {
		int count;
		
		for(int i=0; i<word.length(); i++) {
			count=0;
			for(int j=0;j<word.length();j++) {
				
				if((word.charAt(i)==word.charAt(j)&& i!=j)) {
				count++;
					
				}
			}
			if(count==0) {System.out.println(word.charAt(i));
			
			return;
			
		}
		
		
			
		}
	}
}
		
	


