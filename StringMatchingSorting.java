import java.util.Arrays;
import java.util.*;
public class StringTestDruva {

	public static void main(String[] args) {
		 String s1 = "cat";
		 String s2 = "tac";
		 char arr1[] = s1.toCharArray();
		 char arr2[] = s2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
			 
		 if (Arrays.equals(arr1, arr2)){
			 System.out.println("True");
		 } else {
			 System.out.println("False");
		 }
	}
}
				   
			

