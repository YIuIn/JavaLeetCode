package medium;

public class LC437路径总和三 {
/*    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            Map<Long, Integer> prefix = new HashMap<Long, Integer>();
            prefix.put(0L, 1);
            return dfs(root, prefix, 0, targetSum);
        }
        public int dfs(TreeNode root, Map<Long, Integer> prefix, long curr, int targetSum) {
            if (root == null) {
                return 0;
            }
            int ret = 0;
            curr += root.val;
            ret = prefix.getOrDefault(curr - targetSum, 0);
            prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
            ret += dfs(root.left, prefix, curr, targetSum);
            ret += dfs(root.right, prefix, curr, targetSum);
            prefix.put(curr, prefix.getOrDefault(curr, 0) - 1);
            return ret;
        }
    }*/
}
