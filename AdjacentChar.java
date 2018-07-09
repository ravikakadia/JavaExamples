import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AdjacentChar {
	public static void main (String[] args){
	
	String sb= "AAAABBBB";
	int delcount =0;
	ArrayList<Character> temp = new ArrayList<>();
	//char[] temp = new char[sb.length()];
	//StringBuilder sb = new StringBuilder(s2);
	System.out.println(sb);
    if (sb.length() > 0) {
        char prev = sb.charAt(0);
        //sb.append(prev);
        temp.add(prev);
        for (int i = 1; i < sb.length(); ++i) {
            char cur = sb.charAt(i);
            if (cur != prev) {
          //      sb.append(cur);
            	temp.add(cur);
                prev = cur;
            }
        }
    }
    System.out.println(sb.length()-temp.size());
    
	
	}	
}
