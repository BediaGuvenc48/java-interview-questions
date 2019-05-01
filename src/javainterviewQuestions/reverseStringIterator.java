package javainterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseStringIterator {
	
	
	
	public static void main(String [] ars) {


		String sentence="Hey my name is Bedia";

		String rvs="";

		for (int i= sentence.length()-1; i>=0; i--){

			rvs= rvs+sentence.charAt(i);
		}

		System.out.println(rvs);

		
		String ar="Bedia";
		
		char [] arrayChar= ar.toCharArray();
		
		List<Character> list= new ArrayList<>();
		
		for(char ar2 : arrayChar) {
			
			list.add(ar2);
		}
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);


		
	}

}
