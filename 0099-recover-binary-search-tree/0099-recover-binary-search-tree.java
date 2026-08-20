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

    static int idx;


    public static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int x = count(root.left);
        int y = count(root.right);

        return x + y + 1;
    }


    public static void store(TreeNode root, int[] arr) {
        if (root == null) {
            return;
        }

        store(root.left, arr);

        arr[idx++] = root.val;

        store(root.right, arr);
    }


    public static void add(TreeNode root, int[] arr) {
        if (root == null) {
            return;
        }

        add(root.left, arr);

        root.val = arr[idx++];

        add(root.right, arr);
    }

    public void recoverTree(TreeNode root) {

        if (root == null) {
            return;
        }

       
        int n = count(root);

        idx = 0;
        int[] arr = new int[n];

        store(root, arr);


        Arrays.sort(arr);

 
        idx = 0;
        add(root, arr);
    }
}