import java.util.*;

public class ProductExceptSelfClass{
public static int [] productExceptSelf(int[] nums){
    int n = nums.length;
    int[] res = new int[n];
    Arrays.fill(res,1);

    int lefp=1,rightp=1;
    int l = 0, r = n-1;
    while (l < n && r > -1){
        res[l] *= leftp;
        res[r] *=rightp;

        leftp *= nums[l];
        rightp *= nums[r];

        l++;
        r--;
    }
        return res;
  }

  public static void main(String[] args){
     int[] nums = {1,5,10};
     int[] result = productExceptSelf(nums);
     for (int i = 0; i < result.length; i++){
        System.out.println(result[i]);
     }
  }

}
