package easy;

public class LC724FindPivotIndex {
    int sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    int rightsum=0;
        for(int i=0;i<nums.length;++i){
        if(rightsum==sum-rightsum-nums[i])return i;
        rightsum+=nums[i];
    }
        return -1;
}
