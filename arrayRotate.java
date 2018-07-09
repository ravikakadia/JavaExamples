import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arrayRotate {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	if ((d==0)||(d==a.length)){
    		return a;
    	}
    	int i;
    	 for (i = 0; i < d; i++)
    	    leftRotatebyOne(a, a.length);
    	 return a;
    }
    static void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        
        int[] a = {1,2,3,4,5};
        int d=4;
        
        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
        //    bufferedWriter.write(String.valueOf(result[i]));
        		System.out.println(result[i]);
          //  if (i != result.length - 1) {
            //    bufferedWriter.write(" ");
            
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
