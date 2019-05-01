package javainterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	
public static void main(String[] args) {
		
	int []array= {3,3,3,4,5,6,7,7,9,9};
	
	DuplicateNumber d= new DuplicateNumber();
	
	d.findDuplicateNumber(array);
	
	}
		
	
	public  void findDuplicateNumber(int [] ar) {
		
		List<Integer>duplicate_number= new ArrayList<>();
		
		for(int i=0; i<ar.length;i++) {
			
			for(int j=0;j<ar.length;j++) {
				if(ar [i]==ar [j] && i!=j) {
					  duplicate_number.add(ar[i]);
					
				}
				
			}
			
		}
		
		System.out.println(duplicate_number);
		
	}
	
	
	
		
		
		
	}
	


