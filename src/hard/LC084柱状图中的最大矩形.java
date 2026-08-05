package hard;

public class LC084柱状图中的最大矩形 {
/*    class Solution {
        public int largestRectangleArea(int[] heights) {
            Deque<Integer> stack=new LinkedList<>();
            int max=0;
            int h=0;
            int s=0;
            int n=heights.length;
            for(int i=0;i<=n;i++){
                int cur = (i == n ? 0 : heights[i]);
                while(!stack.isEmpty() && cur <=heights[stack.peek()]){
                    h=stack.pop();
                    if(stack.isEmpty())s=i;
                    else {
                        s=i-stack.peek()-1;
                    }
                    max=Math.max(max,s*heights[h]);
                }
                stack.push(i);
            }
            return max;
        }
    }*/
}
