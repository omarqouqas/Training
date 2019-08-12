package training;

public class words {
	
	public static void main (String[] args){
		
		String[] words = {"funky", "funny", "Alex", "fuss"};
		
		for (String w : words)
		{
			if (w.startsWith("fu")){
				System.out.println(w + " Starts with fu ");					
				}
			else System.out.println(w + " Does not start with fu");
			}
		}
	}


