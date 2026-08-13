package medium;

public class LC230二叉搜索树中第K小的元素 {
/*    *//**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     *//*
    class Solution {
        int i = 0, num = 0;
        public int kthSmallest(TreeNode root, int k) {
            inorder(root, k);
            return num;
        }
        private boolean inorder(TreeNode root, int k) {
            if (root == null) return false;
            if (inorder(root.left, k)) return true;
            i++;
            if (i == k) { num = root.val; return true; }
            return inorder(root.right, k);
        }
    }
}*/
}
