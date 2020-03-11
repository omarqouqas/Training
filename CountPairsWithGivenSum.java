/*Count pairs with given sum
Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.*/

//https://www.geeksforgeeks.org/count-pairs-with-given-sum/

package training;

public class CountPairsWithGivenSum { 
    public static void main(String args[])  { 
        int[] numbers = { 2, 5, 7, -1, 5, 0, 4, -4, -7, 0 }; 
        int givenSum = 0; 
        getPairsCount(numbers, givenSum); 
    } 
  
    // Prints number of pairs in arr[0..n-1] with sum equal 
    // to 'sum' 
    public static void getPairsCount(int[] someArray, int sum) 
    { 
  
        int count = 0;// Initialize result 
  
        // Consider all possible pairs and check their sums 
     for (int i = 0; i < someArray.length; i++) {
		int firstNumber = someArray[i];
		for (int j = i + 1; j < someArray.length; j++) {
			int secondNumber = someArray[j];
			if (firstNumber + secondNumber == sum) {
				count ++;
				System.out.printf("(%d,%d) %n", firstNumber, secondNumber);
			}
			
		}
		  
	}
  
        System.out.printf("Count of pairs is %d",count); 
      
    } 
} 