package easy;

public class LC169MajorityElement {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=num){
                count--;
                if(count==0){
                    num=nums[i];
                    count++;
                }

            }  else count++;
        }
        return num;
    }
}
