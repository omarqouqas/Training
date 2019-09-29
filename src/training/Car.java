package training;

public class Car {
	
	double milesPG;
	String numberPlate;
	String paintColor;
	int numberOfDoors;
	
	public Car(double milesPG, String numberPlate, String paintColor, int numberOfDoors){
		this.milesPG = milesPG;
		this.numberPlate = numberPlate;
		this.paintColor = paintColor;
		this.numberOfDoors = numberOfDoors;

	}
	
	protected int changeNumberOfDoors (int newDoors){

		this.numberOfDoors = newDoors;
		return newDoors;

	}


}
