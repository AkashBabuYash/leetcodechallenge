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
    public static void count(TreeNode root,int k,PriorityQueue<Integer> pq){
        if(root==null){
            return ;
        }

        count(root.left,k,pq);
        if(pq.size()<k){
            pq.add(root.val);
        }
        else{
            if(pq.peek()>root.val){
                pq.poll();
                pq.add(root.val);
            }
        }
       
        count(root.right,k,pq);
        
    }
    public int kthSmallest(TreeNode root, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       count(root,k,pq);
       return pq.peek();
        
    }
}