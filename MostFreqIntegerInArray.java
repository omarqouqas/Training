package training;

public class MostFreqIntegerInArray {
	
	public static void getMostFrequent(int[] someArray) {
		
	int element = 0;
	int count = 0;
	
	for (int i = 0; i<someArray.length; i++) {
		int tempElement = someArray[i];
		int tempCount = 0;
		for (int j = 0; j < someArray.length; j++) { //this is to count how many times an element shows up in the array
			if (someArray[j] == tempElement) {
				tempCount ++;
				
				if(tempCount > count) {
					element = tempElement;
					count = tempCount;
				}
			}
			
		}
	}
	System.out.println("The most common element is " + element + " with count of " + count);
	
	}
	
	public static void main (String[] args) {
			
		int[] values = {3,2,3,3,4,5,1,2,6,7,2,8,3,2,10,-2,3};
		getMostFrequent(values);
	}
}


