package workshop_array;

import java.util.Arrays;

public class Question_28 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts start and end numbers. 
		 Given start and end numbers, return a new array containing the sequence of integers from start up to
		 but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].
		 */
		
		fizzArray3(5, 10);
		fizzArray3(11, 18);
		fizzArray3(1,3); 

	}
	
	public static void fizzArray3(int n1,int n2) {
		int[] array=new int[n2-n1];
		for(int i=0; i<n2-n1 ;i++) {
			array[i]=i+n1;
		}
		System.out.println(Arrays.toString(array));
	}

}
