import java.util.*;

public class PalindromePermutation {
  
  public static boolean permutePalindrome(String st) {
    
    HashMap < Character,Integer > frequencies = new HashMap < Character,Integer > ();
    int index = 0;
    for (int i = 0; i < st.length(); i++) {
      index += 1;
      if (frequencies.containsKey(st.charAt(i))) {
        frequencies.put(st.charAt(i), frequencies.get(st.charAt(i)) + 1);
      }
      else {
        frequencies.put(st.charAt(i), 1);
      }
    }
  
    int count = 0;
    for (int i: frequencies.values()){
        if(i % 2 != 0){
            count += 1;
        }
    }

    /*for (Character ch: frequencies.keySet()) {
      if (frequencies.get(ch) % 2 != 0) {
        count += 1;
      }
    }*/

    if (count <= 1) {
      return true;
    }
    else {
      return false;
    }
  }
  public static void main(String args[]) {
    List < String > strArray = Arrays.asList("baefeab", "abc", "xzz", "jjadd", "kllk");
    for (int i = 0; i < strArray.size(); i++) {
      System.out.println(i + 1 + ".\tInput string: " + strArray.get(i));
      boolean result = permutePalindrome(strArray.get(i));
      if (result) System.out.println("\n\tInput string has permutations that are palindromes");
      else System.out.println("\n\tInput string does not have a permutation that's a palindrome");
      
    }
  }
}
