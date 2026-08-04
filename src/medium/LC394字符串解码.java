package medium;

public class LC394字符串解码 {
/*    class Solution {
        public String decodeString(String s) {
            StringBuilder ptr = new StringBuilder();
            Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray()){
                if(c!=']'){
                    stack.push(c);
                }
                else if(c==']'){
                    StringBuilder sb=new StringBuilder();
                    while(Character.isLetter(stack.peek())){
                        sb.insert(0, stack.pop());
                    }

                    String sub=sb.toString();
                    stack.pop();
                    sb=new StringBuilder();
                    while(!stack.isEmpty()&&Character.isDigit(stack.peek())){
                        sb.insert(0, stack.pop());
                    }
                    for(int i=0;i<Integer.valueOf(sb.toString());i++){
                        for(char ch:sub.toCharArray())stack.push(ch);
                    }
                }
            }
            StringBuilder retv= new StringBuilder();
            while(!stack.isEmpty()){
                retv.insert(0, stack.pop());
            }
            return retv.toString();
        }
    }*/
}
