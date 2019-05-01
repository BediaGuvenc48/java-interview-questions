package javainterviewQuestions;

public class getSecondLargest {
	
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}




		public static void getSortedArray(int [] ar){

		int temp=0;int count=0;

		for (int i=0; i<ar.length;i++){
count=0;
			for (int j= i+1; j<ar.length;j++){

				if (ar[i]>ar[j]){

					temp= ar[i];
					ar[i]=ar[j];
					ar[j]= temp;
					count++;


					if (count==0)break;
				}
			}
		}

		for (int i=0; i<ar.length;i++){

			System.out.println(ar[i]+ " ");
		}




		}
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		getSortedArray(b);
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}}  


