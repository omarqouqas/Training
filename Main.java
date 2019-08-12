package training;

import java.awt.*;
import java.util.Scanner;

//import static java.awt.*;
//import static java.awt.Color.BLUE;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is the main function");

		Car myCar = new Car(32.5, "ls02eoh", "Blue", 4);

		Car yourCar = new Car(45.5, "ABC123", "Black", 5);

		System.out.println("My Car's color is " + myCar.paintColor);
		System.out.println("My Car's number plate is: " + (myCar.numberPlate.toUpperCase()));
		System.out.println("Your Car's color is " + yourCar.paintColor);

		System.out.println("my car's original number of doors: " + myCar.numberOfDoors);
		int newNumberOfDoors = myCar.changeNumberOfDoors(3);
		System.out.println("my car's new number of doors: " + newNumberOfDoors);
		System.out.println("my car's number plate contains 'ls' ? " + myCar.numberPlate.contains("ls"));

		System.out.println("Enter something");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		System.out.println("You entered " + userInput);

		int[] firstArray = new int[5];
		firstArray[0] = 31;
		firstArray[1] = 45;
		System.out.println(firstArray[0]);
		System.out.println("index 2 in firstArray has number " + firstArray[2]);
		System.out.println("index 3 firstArray has " + firstArray[3]);

		int[] secondArray = {1,2,3,4,5,6};
		System.out.println(secondArray[3]);
		System.out.println("the size of the first array is "  + firstArray.length);
		System.out.println("the size of the second array is "  + secondArray.length);
	}
}

