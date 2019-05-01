package javainterviewQuestions;

import java.util.*;

public class theCountOfCharacter {

	
	public static void main(String[] args) {
		String word="dsgdfdfhsdfhsdhsd";
		occurences(word);
		occurencesWord(word);
		
	}
	
	
	public static void occurences(String word) {
		
		String [] ar= word.split("");
		
		Map<String,Integer>letter= new HashMap<>();
		
		for(String ax: ar) {
			
			if(!letter.containsKey(ax)) {
				
				letter.put(ax, 1);
			}else {
				
				int frequent= letter.get(ax);
				letter.put(ax, frequent+1);
			}
			
			
			
		}
		System.out.println(letter);
		
		
		
	}


	public static void occurencesWord(String y){
	//	String k="bedsafsdgsdg";
		Character[] ar={'a','e','i','o','u',};

	List<Character> voewl= Arrays.asList(ar);
	List<Character>consonant= new ArrayList<>();



	}




}
