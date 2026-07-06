package medium;

public class LC167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(target!=numbers[left]+numbers[right]){
            if(numbers[left]+numbers[right]>target)right--;
            else left++;
        }
        int arr[]={left+1,right+1};
        return arr;
    }
}
