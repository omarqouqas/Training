package training;

//import javax.xml.ws.AsyncHandler;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
//		int y = 2;
		
		try {
			for (int z = 2; z >=0; z--){
				int ans = x/z;
				System.out.println(ans + " ");
			}
		} catch (Exception E1){
				System.out.println("E1");
//			} catch (ArithmeticException e1){
//				System.out.println(E2);
//			}
		}

	}
}


