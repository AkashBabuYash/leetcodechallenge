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
    public static boolean valid(TreeNode root,long minvalue,long maxvalue){
        if(root==null){
            return true;
        }
        if(root.val<=minvalue || root.val>=maxvalue){
            return false;
        }
    
        return valid(root.left,minvalue,root.val) && valid(root.right,root.val,maxvalue);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
}