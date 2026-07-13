package easy;

public class LC485最大连续1的个数 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max=0;
            int sum=0;
            for(int num:nums){
                if(num==0){
                    max=Math.max(sum,max);
                    sum=0;
                    continue;
                }
                sum++;
            }
            max=Math.max(sum,max);
            return max;
        }
    }
}
