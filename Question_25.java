package workshop_array;

public class Question_25 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts two arrays of the same length. For every 
		 element in array1, consider the corresponding element in array2 (at
		 the same index). Return the count of the number of times that two
		 elements differ by 2 or less, but are not equal.
		 */

		int[] x = {1,2,3};
		int[] y = {2,3,10};
//		int[] x = {1,2,3};
//		int[] y = {2,3,5};
//		int[]x= {2,5};
//		int[]y= {2,5};
		System.out.println(differ2Arrays(x, y));
		

	}
	
	public static int differ2Arrays(int[] array1, int[] array2) {
		int count=0;
		if(acceptable(array1, array2)) {//if they have same length :
			for(int i=0;i<array1.length;i++) {
				if((array2[i]-array1[i]==2) || (array2[i]-array1[i]==1)) {//two elements differ by 2 or less, but are not equal
					count++;											 //increase count
				}
			}
			return count;
		}else {											
			System.out.println("Arrays must same length"); //its a good part!!! 
			return -1;
		}
		
		
		
	}
	public static boolean acceptable(int[] arr1, int[] arr2) {
		//TERNARY OPERATOR=>>    variable= booleanExpression ? expression1 : expression2
		boolean accept=arr1.length==arr2.length? true:false;
		return accept;
	}

}
