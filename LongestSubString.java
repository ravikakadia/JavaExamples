import java.util.*;

class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int left = 0;
        int maxStr = 0;
        int maxL = 0, maxR = 0;
        Set<Character> set = new HashSet<>();
        for (int right=0; right < s.length(); right++){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
             //   if(right-left+1 > maxStr){
               //     maxStr=right-left+1;
                    maxL=left;
                    maxR=right;
                //}
                
            }
           else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        for (int i=maxL; i<maxR;i++){
            System.out.print(s.charAt(i));
        }
       System.out.println();
    }
}
