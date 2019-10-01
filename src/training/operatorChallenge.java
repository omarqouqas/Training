package training.src.training;

public class operatorChallenge {

	public static void main(String[] args) {

		double val1 = 20.00;
		double val2 = 80.00;
		double val3 = (val1 + val2) * 100.00;
		double theRemainder = val3 % 40.00;
		boolean val5 = (theRemainder == 0) ? true : false; // ternary operator

		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println("The remainder = " + theRemainder);
		System.out.println("The remainder == 0? is " + val5);

		if (!val5) {
			System.out.println("The remainder of val 4 is NOT 0. Got some remainder = " + (val3 % 40.00));
		}

	}

}
