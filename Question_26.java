package workshop_array;

public class Question_26 {
	public static void main(String[] args) {
	/*
	 Write a method that accepts an array and prints true if the array 
	 contains 3 even
or 3 odd values all next to each other
	 */
//      int[] array= {2,1,3,5};
		int[] array= {2,1,2,5};
		three_even_odd(array);	
	}
	
	public static void three_even_odd(int[] array) {
		int count,count_odd,count_even;
		count = count_odd = count_even =0;//Initializing multiple variables to the same value in Java
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				count_even++;
			}else {
				count_odd++;			}
		}
		if((count_even==3) || (count_odd==3) ) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
