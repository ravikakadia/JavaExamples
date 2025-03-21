import java.util.*;

public class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int pivot = 0; pivot < n-2; pivot++){
            if (nums[pivot] > 0){
                break;
            }
            if (pivot > 0 && nums[pivot] == nums[pivot-1]){
                continue;
            }
            int low = pivot + 1;
            int high = n - 1;
            while (low < high){
                int sum = nums[pivot] + nums[low] + nums[high];
                if (sum < 0){
                    low++;
                } else if (sum > 0){
                    high --;
                }else {
                    result.add(Arrays.asList(nums[pivot], nums[low],nums[high]));
                    low ++;
                    high --;
                    while (low < high && nums[low] == nums [low-1]){
                        low ++;
                    }
                    while (low < high && nums[high] == nums [high+1]){
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public static void main( String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}
