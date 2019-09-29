package training;

public class ThisKeywordDemo {
	//instance variables
	int a = 0;
	int b = 1;
	
	private void setValue(int c, int d){ //c and d are local variables
		
		this.a=c; //whichever has the keyword this its value will change. In this case the value of instance variable a will change to 2
		this.b=d;
		
	}
	
	private void showData(){
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	}
	
	public static void main (String[] args){
		ThisKeywordDemo obj = new ThisKeywordDemo();
		obj.setValue(2, 3);
		obj.showData();
	}

}
