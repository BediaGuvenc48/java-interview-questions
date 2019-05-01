package javainterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharactersString {
	
	//write java program to print duplicate characters from String
	
	
	
	public static void main(String[] args) {
		
		String word2="dekelfdfdfds";//e,d,f
		
duplicate(word2);
		
	}
	
	
	public static void duplicate(String word) {
		
		String ar[]=word.split("");
		String duplicateletters="";
		
		Set<String>duplicate= new HashSet<>();

		for(String letter:ar) {
			
		if(!duplicate.contains(letter)){

			duplicate.add(letter);
		}else{

			duplicateletters+=letter;
		}
			
		}
		
		
		System.out.println(duplicateletters);
		
	}
	
	
	
	

}
