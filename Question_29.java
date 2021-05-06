
package workshop_array;

import java.util.Arrays;

public class Question_29 {

	public static void main(String[] args) {
		/*
		 Write a function that accepts and array. For each multiple of 10 in the given array, change all
		 the values following it to be that multiple of 10, until encountering another multiple of 10.  
		 */
	
		int[] x = {0,10,1,20,2,0,9};
		
		int repeat_num=0;
		boolean original_num=true;
		
		for(int i=0;i<x.length;i++) {
			if(original_num==false) {//so if we see before multiple of 10 number  we can run this control
				if(x[i]!=0 && x[i]%10==0) {//if we see current element also multiple of 10,then repeat_num 
					repeat_num=x[i];
				}
				x[i]=repeat_num;
			}
			
			if(x[i]%10==0) {//so if we see before multiple of 10 number
				original_num=false;  //until now array not made up of original array elements
				repeat_num=x[i];	//repeat_num is became this number
				
				
			}
			
		
			
			
		}
		
		System.out.println(Arrays.toString(x));
	
		
		
	

	}

}
