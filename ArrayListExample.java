package training;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main (String[] args) {
	
	ArrayList<String> cars = new ArrayList<String>();
	
	cars.add("SEAT");
	cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    cars.set(1, "OPEL");
    
    cars.remove(2);
    
    System.out.println(cars);
    System.out.println("Item 2 in Cars ArrayList is " + cars.get(2));
    
    System.out.println("Size is " + cars.size());
	
	}

}
