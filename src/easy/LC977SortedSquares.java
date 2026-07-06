package easy;

public class LC977SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=nums.length-1;
        int []arr=new int[nums.length];
        while(left<=right){
            if(nums[left]*nums[left]<=nums[right]*nums[right]){
                arr[i]=nums[right]*nums[right];
                right--;
                i--;
            }
            else{
                arr[i]=nums[left]*nums[left];
                left++;
                i--;
            }
        }
        return arr;
    }
}
