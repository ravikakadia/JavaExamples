import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class CharCount {
  public static void charCount(String str){
    if(str == null || str.length() == 0){
      System.out.println("Enter valid string");
     
    }
    HashMap<Character, Integer> charCount = new HashMap<>();
    char[] chArray = str.toCharArray();
    for (char c : chArray){
      if(charCount.containsKey(c)){
        charCount.put(c, charCount.get(c)+1);
      }else{
        charCount.put(c,1);
        }
      System.out.println(str + charCount);
    }
   Set<Entry<Character, Integer>> charSet = charCount.entrySet();
   int maxCount = 0;
   char maxChar = 0;
   for (Entry<Character, Integer> e : charSet){
     if(e.getValue() > maxCount){
      maxCount = e.getValue();
      maxChar = e.getKey();
     }
    
   }
    /*
    Set<Character> cs=charCount.keySet();
    for (Character c: cs){
      if (charCount.get(c) > maxCount){
        maxcount = charCount.get(c);
        maxChar = c;
      }
    }
      */
    System.out.println(maxChar + " : " + maxCount);
             
  }
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());
    charCount("abc");

    for (String string : strings) {
      System.out.println(string);
    }
  }
}
