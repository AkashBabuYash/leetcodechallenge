/**
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
 */
class Solution {
    public static int deapth(TreeNode root){
        if(root==null){
            return 0;
        }

        if(root.left==null){
            return deapth(root.right)+1;
        }

          if(root.right==null){
            return deapth(root.left)+1;
        }

        int x=deapth(root.left);
        int y=deapth(root.right);

        return Math.min(x,y)+1;
    }
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return deapth(root);
        
    }
}