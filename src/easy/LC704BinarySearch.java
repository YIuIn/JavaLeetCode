package easy;

public class LC704BinarySearch {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(right-left>>1)+left;
            if(target<nums[mid]){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
            if(nums[mid]==target)
            {
                return mid;
            }
        }
        return -1;
    }
}
