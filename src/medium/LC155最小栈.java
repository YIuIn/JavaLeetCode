package medium;

public class LC155最小栈 {
/*    class MinStack {
        Deque<Long> Stack;
        long min;
        public MinStack() {
            Stack=new LinkedList<>();
        }

        public void push(int value) {
            if(Stack.isEmpty()){
                Stack.push(0L);
                min=value;
                return;
            }
            Stack.push(value-min);
            if(value<min)min=value;
        }

        public void pop() {
            long diff=Stack.peek();
            if(diff<0)min-=diff;
            Stack.pop();
        }

        public int top() {
            long diff = Stack.peek();
            if(diff < 0){
                return (int)min;
            }
            return (int)(min + diff);
        }

        public int getMin() {
            return (int)min;
        }
    }

*/
}
