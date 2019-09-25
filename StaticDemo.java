package training;

public class StaticDemo {
	
	private int employeeID = 123;
	private static String companyName = "Big Company";
	protected static String companyLocation = "Big City"; //protected so it can be access by classes in the same package i.e. Staticdemo2
	
	protected static String displayInfo(){
		return "Some info from display info method";
	}
	
	private int displayID(){
		return employeeID;
	}
	
	private int addNumbers(int x, int y){
		return x+y;
	}

	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		System.out.printf("Employee ID is %d and company name is %s \n", obj.employeeID, companyName);
		System.out.println(displayInfo()); //static method access it directly
		System.out.println(obj.displayID()); //class method you need an instance in order to access it
		System.out.println(obj.addNumbers(1, 2));

	}

}
