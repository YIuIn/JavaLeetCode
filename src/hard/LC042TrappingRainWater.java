package hard;

public class LC042TrappingRainWater {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int sum=0;
        while(right>left){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(rightMax>leftMax){
                sum=sum+leftMax-height[left];
                left++;
            }
            else{
                sum=sum+rightMax-height[right];
                right--;
            }
        }
        return sum;
    }
}
