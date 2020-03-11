package training;

import java.util.Arrays;

public class ArraySumPairOfIntegers {
	
	public static void printPairs(int[] array, int sum) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
					count++;					
				}
			}
		}
		System.out.println("Total count of those pairs: " + count);
	}
	
	public static void prettyPrint(int[] givenArray, int givenSum) {
		//Arrays.sort(givenArray);
		System.out.println("Given Array : " + Arrays.toString(givenArray));
		System.out.println("Given Sum : " + givenSum);
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum );
		printPairs(givenArray, givenSum);
	}	
	
	public static void main (String[] args) {
		//call the methods here and provide some arrays
		
		int[] numbers = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};

		prettyPrint(numbers, 7); // accessing static method directly without the need to creat an object of the class
//		getPairsCount(numbers, 9);
		CountPairsWithGivenSum.getPairsCount(numbers, 7);
	}

}
