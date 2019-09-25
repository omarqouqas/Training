package training;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int i = a.length - 1;
		System.out.println("Value of i: " + i + "\n");
		while (i>=0){
			System.out.println(a[i]);
			i--;
		}
		
//		int[] newArray;
		
		int[] newArray = new int[] {4,5,6,99};

	}

}
