package easy;

public class LC543二叉树的直径 {
    //定义全局变量
/*    class Solution {
        int max=0;
        public int diameterOfBinaryTree(TreeNode root) {
            inorder(root);
            return max;
        }

        public int inorder(TreeNode root) {
            if(root==null)return 0;
            int left=inorder(root.left);
            int right=inorder(root.right);
            max=Math.max(max,left+right);
            return Math.max(left,right)+1;
        }
    }*/
/*
    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            int[] a=inorder(root);
            return a[1];
        }

        public int[] inorder(TreeNode root){
            if(root==null)return new int[2];
            int[] left = inorder(root.left);
            int[] right = inorder(root.right);
            int[] a=new int[2];
            a[0]=Math.max(left[0],right[0])+1;
            a[1] = Math.max(Math.max(left[1], right[1]),left[0] + right[0]);
            return a;
        }

    }*/
    //变更节点值为最大子树高度
    /*    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            return inorder(root);
        }

        public int inorder(TreeNode root) {
            if(root == null) {
                return 0;
            }

            // 获取左右子树的最大直径
            int left = inorder(root.left);
            int right = inorder(root.right);

            // 保存当前节点高度
            root.val = Math.max(
                    root.left == null ? 0 : root.left.val,
                    root.right == null ? 0 : root.right.val
            ) + 1;

            // 当前节点直径
            int cur =
                    (root.left == null ? 0 : root.left.val) +
                            (root.right == null ? 0 : root.right.val);

            // 返回最大直径
            return Math.max(Math.max(left, right), cur);
        }
    }*/
}
