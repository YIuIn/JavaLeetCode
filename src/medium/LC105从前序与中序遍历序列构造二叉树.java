package medium;

public class LC105从前序与中序遍历序列构造二叉树 {
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
        Map<Integer, Integer> indexMap = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                indexMap.put(inorder[i], i);
            }
            return build(preorder,0,0,  inorder.length-1);
        }
        public TreeNode build(int[] preorder,int p,int iStart,int iEnd){
            if(iStart>iEnd)return null;
            int rootVal=preorder[p];
            TreeNode root=new TreeNode(rootVal);
            int rootIndex = indexMap.get(rootVal);
            int leftSize=rootIndex-iStart;
            root.left=build(preorder,p+1,iStart,rootIndex-1);
            root.right=build(preorder,p+leftSize+1,rootIndex+1,iEnd);
            return root;
        }
    }*/
}
