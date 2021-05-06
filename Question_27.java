package workshop_array;

public class Question_27 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts an array and prints true if the array contains,
		 somewhere,three increasing adjacent numbers like 4,5,6,... or 23,24,25
		 */
		
		int[] x = {1,4,5,6,2}; 
		int[] y = {1,2,3};
		int[] z = {1,2,4,5,8,9}; 
		
		System.out.println(three_adjacent(z));
		

	}
	
	public static boolean three_adjacent(int[] array) {
		
		for(int i=0;i<array.length-2;i++) {
			if(array[i+1]==array[i]+1 && array[i+2]==array[i]+2) {
				return true;
			}
		}
		return false;
	}

}
