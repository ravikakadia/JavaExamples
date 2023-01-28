import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(numMap.containsKey(diff)){
                return new int[] {numMap.get(diff), i};
            }
            else numMap.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] a = {7,4,3,2};
        int [] ans = twoSum(a,7);
        for (int i =0; i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}