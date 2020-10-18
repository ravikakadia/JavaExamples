
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class DuplicateCharCount {
  public static void charCount(String str){
    char[] ch = str.toCharArray();
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (char c : ch){
      if(charCount.containsKey(c)){
        charCount.put(c, charCount.get(c)+1);
      }
      else{
        charCount.put(c,1);
      }
    }
    Set<Character> charSet = charCount.keySet();
    for (Character c : charSet){
      if(charCount.get(c) > 1){
        System.out.println(c);      
      }
    }
  }
  
  public static void main(String[] args) {
    charCount("Ravi  kakadia");
  }
}
