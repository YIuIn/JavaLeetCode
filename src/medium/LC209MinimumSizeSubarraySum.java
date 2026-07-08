package medium;

public class LC209MinimumSizeSubarraySum {
    int start=0;
    int sum=0;
    int s=0;
    int min=nums.length+1;
        for(int end=0;end<nums.length;end++){
        sum+=nums[end];
        while(sum>=target){
            min=Math.min(min,end-start+1);
            sum-=nums[start];
            start++;
        }
    }
        if(min==nums.length+1)return 0;
        return min;
}
