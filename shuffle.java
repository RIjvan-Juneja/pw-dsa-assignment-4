// pw assign4 : q8
// leetcode 1470

class Solution {
    public int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[nums.length];
        int k=0;
        int j=0;
        for(int i=0; i<nums.length ;i++)
        {

            if(i==0 || i % 2==0)
            {
                ans[k] = nums[j];
                k++;
                j++;
            }
            else
            {
                ans[k] = nums[n];
                n++;
                k++;
            }
        }
        return ans;
    }
}
