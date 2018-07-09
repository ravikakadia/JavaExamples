import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagram {
	public static void main (String[] args){
	String s1= "bacdcvn";
	String s2= "dcbacx";
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	int count =0;
	List <Character> l1 = new ArrayList <>();
	
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)){
			System.out.println(0);
		}else{

			for (int i=0;i<c1.length;i++){
				for (int j=0; j<c2.length;j++){
					if (c1[i]==c2[j]){
						l1.add(c1[i]);
					}
				}
			}
			System.out.println(l1);
			Set<Character>s = new HashSet<>(l1);
			int len =s.size();
			// make hash array for both string 
	        // and calculate frequency of each
	        // character
	        int count1[] = new int[26]; 
	        int count2[] = new int[26];
	 
	        // count frequency of each charcter 
	        // in first string
	        for (int i = 0; i < s1.length() ; i++)
	            count1[s1.charAt(i) -'a']++;
	        
	        // count frequency of each charcter 
	        // in second string
	        for (int i = 0; i < s2.length() ; i++)
	            count2[s2.charAt(i) -'a']++;
	 
	        // traverse count arrays to find 
	        // number of charcters to be removed
	        int result = 0;
	        for (int i = 0; i < 26; i++)
	            result += Math.abs(count1[i] -
	                               count2[i]);
	        System.out.println(result);
			
			
		
		}
		}
	
	
}
