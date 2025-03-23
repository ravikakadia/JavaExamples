import java.util.*;

class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "pwwkew";
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right=0; right < s.length(); right++){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }
           /* else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }*/
        }
        StringBuilder sb = new StringBuilder();
        for (Character c: set){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
