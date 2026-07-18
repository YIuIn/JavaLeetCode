package easy;

public class LC021合并两个有序链表 {
/*    class Solution {
        public int maxArea(int[] height) {
            int left=0;
            int leftmax=height[left];

            int right=height.length-1;
            int rightmax=height[right];
            int max=Math.min(leftmax,rightmax)*(right-left);
            while(left!=right){
                if(height[left]<=height[right]){
                    left++;
                    if(height[left]>leftmax){

                        leftmax=height[left];
                        max=Math.max(Math.min(leftmax,rightmax)*(right-left),max);
                    }
                }
                else{
                    right--;
                    if(height[right]>rightmax){

                        rightmax=height[right];
                        max=Math.max(Math.min(leftmax,rightmax)*(right-left),max);
                    }
                }

            }
            return max;
        }
    }*/
}
