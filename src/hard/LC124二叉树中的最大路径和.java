package hard;

public class LC124二叉树中的最大路径和 {
/*    class Solution {
        int max=Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            dfs(root);
            return max;
        }
        public int dfs(TreeNode root){
            if(root==null)return 0;
            int left=dfs(root.left);
            if(left<0)left=0;
            int right=dfs(root.right);
            if(right<0)right=0;
            int sum=Math.max(left,right)+root.val;
            //max=Math.max(Math.max(sum,max),root.val+left+right);
            max=Math.max(max,root.val+left+right);
            return sum;
        }
    }*/
}
