package medium;

public class LC236二叉树的最近公共祖先 {
/*    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return search(root,p,q);
        }
        public TreeNode search(TreeNode root,TreeNode p, TreeNode q){
            if(root==null)return null;
            if(root==p||root==q)return root;
            TreeNode leftroot=search(root.left,p,q);
            TreeNode rightroot=search(root.right,p,q);
            if(leftroot!=null&&rightroot!=null)return root;
            if(leftroot!=null)return leftroot;
            if(rightroot!=null)return rightroot;
            return null;
        }
    }*/
}
