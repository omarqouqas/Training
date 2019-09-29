package training;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Java");
		System.out.println("First s1 value: " + s1);
		String s2 = "love";
		s1.append(s2);
		System.out.println("After append s1 value: " + s1);
		s1.substring(4);
		System.out.println("After substring s1 value: " + s1);
		int foundAt = s1.indexOf(s2); //this finds the index where s2 starts which is 4
		System.out.println(s1);
		System.out.println (foundAt);

	}

}
