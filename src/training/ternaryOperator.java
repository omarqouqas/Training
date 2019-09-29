package training;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		int score;
		int goodScore = 80;
		int topScore = 100;
		int passMark = 50;
		
		Scanner scoreInput = new Scanner(System.in);
		System.out.println("Please enter a score");
		
		score = scoreInput.nextInt();
		System.out.println("You entered score of " + score);
		
		if (score > goodScore && score < topScore) {
			System.out.println("Your score = " + score);
			System.out.println("Your score is between good score (" + goodScore + ") and top score (" + topScore + ")");
		}
		else if ((score < goodScore) && (score >= 80)) {
			System.out.println("Your score = " + score);
			System.out.println("Your score is not bad");
		}
		
		else if ((score >=0) && (score < passMark)) {
			System.out.println("Your score = " + score);
			System.out.println("You failed!. The pass mark is "+ passMark);
		}
		
		else if ((score <0) || (score > 100)) {
			System.out.println("The entered score must be between 0 and 100. " + score + " is not a valid score!");
			
		}
							
		boolean isPass = ((score >= passMark) && (score <=topScore)) ? true : false; //Ternary operator
		
		if (isPass) {
			System.out.println("You passed, pass mark is " + passMark);
		}
		/*else {
			System.out.println("You failed!, pass mark is " + passMark);
		}*/

	}


}


