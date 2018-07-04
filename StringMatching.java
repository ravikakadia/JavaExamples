import java.util.Arrays;
import java.util.*;
public class stringTest {

	public static void main(String[] args) {
		 String s1 = "catag";
		 String s2 = "tacag";
		 int lens1 = s1.length();
		   Character[] array = new Character[lens1];
		   for (int i = 0; i < lens1 ; i++) {
		      array[i] = new Character(s1.charAt(i));
		   } 
		   int lens2 = s2.length();
		   Character[] array2 = new Character[lens2];
		   for (int i = 0; i < lens2 ; i++) {
		      array2[i] = new Character(s2.charAt(i));
		     
		   } 
		   
			   if (Arrays.asList(array).containsAll(Arrays.asList(array2)) && (lens1 == lens2))
			   {
				   System.out.println("Match");
			
			   }
	}
}
				   
			

