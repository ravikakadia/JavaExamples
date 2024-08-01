class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (sb.length() > 0 && sb.charAt(sb.length() -1) == c){
                sb.deleteCharAt(sb.length() - 1);
            
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
  public static void main(String[] args){
    Solution s = new Solution();
    String ans = removeDuplicates("abbaca");
    System.out.println(ans);
}
