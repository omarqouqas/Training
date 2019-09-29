package training;

import java.io.*;
import java.util.stream.IntStream;

public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    private static int simpleArraySum() {
        /*
         * Write your code here.
         */

        int[] arr = {1,2,3,4,5};
        int sum = IntStream.of(arr).sum();
        return sum;
         

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	System.out.println(simpleArraySum());
    	
    }
}
