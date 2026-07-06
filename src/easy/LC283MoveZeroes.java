package easy;

public class LC283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                a=nums[i];
                nums[i]=nums[count];
                nums[count]=a;
                count++;
            }
        }
    }
}
