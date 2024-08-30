import java.lang.Math;


public class MaxSubArray {
   /**
    * https://www.youtube.com/watch?v=8ML82w5v_To
    * Given a integer array nums, find the subarray with the 
    * largest sum, and return it's sum
    */ 

    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num: nums) {
            // negative number reset
            currentSum = Math.max(currentSum, 0);
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    
}
