package training;

public class MaxMinimumPath {
	
	public static void main (String[] args) {
		
		int[] path = {7,5,3};
		int[] path1 = {2,0,9};
		int[] path2 = {4,5,9};
		
		/*
		7,5,3
		2,0,9
		4,5,9
		*/
		
		//declare two dimensional array:
		
		int twoDArray[][] = new int[3][3]; //3 rows and 3 columns
		
		twoDArray[0][0] = 7;
		twoDArray[0][1] = 5;
		twoDArray[0][2] = 3;
		
		twoDArray[1][0] = 2;
		twoDArray[1][1] = 0;
		twoDArray[1][2] = 9;
		
		twoDArray[2][0] = 4;
		twoDArray[2][1] = 5;
		twoDArray[2][2] = 9;
		
		System.out.println("Value at [0] [2] is " + twoDArray[0][2]);
		
		for (int i =0 ; i <twoDArray.length; i++) {
			int first = twoDArray[0][0];
		}
		
	}

}
