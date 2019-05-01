package javainterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckAnagram {
	
	
	
	public static void main(String[] args) {
		
		String word="Listen";
		String word2="Silent";
		
		boolean z=anagram(word, word2);
		
		System.out.println(z);

		anagramforloop(word,word2);
		
	}
	
	
	
	public static boolean anagram(String word, String word2) {
		
		
		
		word=word.toLowerCase();
		word2=word2.toLowerCase();





		
		String [] ar1=word.split("");
		String [] ar2= word2.split("");
		
Arrays.sort(ar1);
Arrays.sort(ar2);
		
		return Arrays.equals(ar1, ar2);
		
	}

	public static void anagramforloop(String word, String word2){
if (word.length()!=word2.length()) System.out.println("this is not anagram");


		word=word.toLowerCase();
		word2=word2.toLowerCase();
		String [] ar2= word2.split("");
		List<String>chracter=Arrays.asList(ar2);

		for(int i=0; i<word.length(); i++){


			if(!chracter.contains(word.substring(i,i+1))){
				System.out.println("This is not anagram");
			}
}
		System.out.println("this is anagram");

	}

}
