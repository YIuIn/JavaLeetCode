package medium;

public class LC098验证二叉树 {
    //1.比较子树最值
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
        public boolean isValidBST(TreeNode root) {
            return search(root);
        }
        public boolean search(TreeNode root){
            if(root==null)return true;
            if(root.left!=null&&root.val<=max(root.left))return false;
            if(root.right!=null&&min(root.right)<=root.val)return false;
            return search(root.left)&&search(root.right);
        }
        public int min(TreeNode root){
            if(root.left==null)return root.val;
            return min(root.left);
        }
        public int max(TreeNode root){
            if(root.right==null)return root.val;
            return max(root.right);
        }
    }*/
    //2.自顶向下传约束，之后向上传结果
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
        public boolean isValidBST(TreeNode root) {
            if(root==null)return true;
            return search(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }
        public boolean search(TreeNode root,long max,long min){
            if(root==null)return true;
            if(root.val>=max||root.val<=min)return false;
            return search(root.left,(long)root.val,min)&&search(root.right,max,(long)root.val);
        }

    }*/

}
