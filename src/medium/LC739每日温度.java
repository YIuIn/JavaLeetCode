package medium;

public class LC739每日温度 {
/*    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            Deque<Integer> stack=new LinkedList<>();
            int[] nums=new int[temperatures.length];
            for(int i=0;i<temperatures.length;i++){
                int temperature = temperatures[i];
                while(!stack.isEmpty()&&temperature>temperatures[stack.peek()]){
                    int index=stack.pop();
                    nums[index]=i-index;
                }
                stack.push(i);
            }
            return nums;
        }
    }*/
}
