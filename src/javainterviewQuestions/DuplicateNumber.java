package javainterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	
public static void main(String[] args) {
		
	int []array= {3,3,3,4,5,6,7,7,9,9,1};

	findUniqueNumber(array);
	
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


	public static  void findUniqueNumber(int [] array) {
		List<Integer>uniqueNumbers= new ArrayList<>();



		for (int i=0;i<array.length ;i++ ) {


			int first= array[i];

			for (int z=0;z<array.length ;z++ ) {

				if (first!=array[z]&& i!=z) {
					uniqueNumbers.add(first);

				}

			}

		}

		System.out.println(uniqueNumbers);

	}





		
		
		
	}
	


