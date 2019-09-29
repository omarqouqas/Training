package training;

import java.util.ArrayList;
import java.util.List;

//import javax.print.DocFlavor.STRING;

public class StringArrayList {
	public static void main (String[] args){
		List<String> items = new ArrayList<>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		
		for (String i : items){
			if (i.indexOf("P") == 0){
				continue;
			}
			else {
				System.out.println(i + " ");
			}
		}
	}

}
