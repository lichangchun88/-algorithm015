/**
 * 283. 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums==null || nums.length<2) return;
        for (int i = 0, pre=0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[pre] = nums[i];
                if (i!=pre) nums[i]=0;
                pre++;
            }
        }
    }
}
