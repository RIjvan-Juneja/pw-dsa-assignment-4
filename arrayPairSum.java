// pw assign 4  : 4
// leetcode 561

public class arrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int itr = 0; itr < nums.length; itr += 2){
            result += nums[itr];
        }
        return result;
    }
}
