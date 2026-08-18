package medium;

public class LC114二叉树展开为链表 {
/*    class Solution {
        public void flatten(TreeNode root) {
            TreeNode curr =root;
            while(curr!=null){
                if(curr.left!=null){
                    TreeNode next=curr.left;
                    TreeNode predecessor =next;
                    while(predecessor.right!=null){
                        predecessor =predecessor.right;
                    }
                    predecessor.right=curr.right;
                    curr.left=null;
                    curr.right=next;
                }
                curr = curr.right;
            }
        }

    }*/
}
