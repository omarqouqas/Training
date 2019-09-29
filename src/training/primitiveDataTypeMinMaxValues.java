package training;

public class primitiveDataTypeMinMaxValues {

	public static void main(String[] args) {
		
		int minValue = Integer.MIN_VALUE; // int has a width of 32 as it occupies 32 bits. int takes the most memory space in comparison with byte and short
		int maxvalue = Integer.MAX_VALUE;
		
		float f3 = (float) (10); //This is casting, converting a number from one format to another. This will return 10.0
		
		int i1 = (int) (10.5); //This is casting, converting a number from one format to another. This will return 10
		
		byte b1 = Byte.MIN_VALUE;// byte has a width of 8 as it occupies 8 bits
		byte b2 = Byte.MAX_VALUE;
		
		short s1 = Short.MIN_VALUE; //short has a width of 16 as it occupies 16 bits
		short s2 = Short.MAX_VALUE;
		
		long lo = 100L; // long has a width of 64 as it occupies 64 bits. So it's bigger than int
		
//		char c1 = Character.MIN_LOW_SURROGATE;
//		char c2 = Character.MAX_VALUE;
		
		char atSign = '\u0040'; //unicode from https://unicode-table.com/en/#0040
		
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		
		float f1 = Float.MIN_VALUE;
		float f2 = Float.MAX_VALUE;
		
		int x = 10;
		int y = 2_147_483_647;
		
		String st1 = "this is a string";
		String st2 = st1 + ", and this is more.";
				
		System.out.println("Min Value is " + minValue);
		System.out.println("Max Value is " + maxvalue);
		
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
		System.out.println("b1 is " + b1);
		System.out.println("b2 is " + b2);
		
		System.out.println("short min value is " + s1);
		System.out.println("short max value is " + s2);
		
//		System.out.println("char min value is " + c1);
//		System.out.println("char max value is " + c2);
		
		System.out.println("long min value is " + l1);
		System.out.println("long max value is " + l2);
		
		System.out.println("float min value is " + f1);
		System.out.println("float max value is " + f2);
		
		System.out.println("Value of lo is " + lo);
		
		//Casting print out below
		
		System.out.println(f3);
		System.out.println(i1);
		/////////////////////
		
		System.out.println("String 1 is " + st1);
		System.out.println("String 2 is " + st2);
		System.out.println("@ sign is " + atSign);
		

	}

}
