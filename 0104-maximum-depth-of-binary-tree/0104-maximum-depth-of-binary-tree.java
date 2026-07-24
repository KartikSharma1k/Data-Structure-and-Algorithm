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
    public int maxDepth(TreeNode root) {
        
        int depth = 0;

        if(root != null){
            int leftDepth = findDepth(root.left, depth + 1);
            int rightDepth = findDepth(root.right, depth + 1);

            depth = Math.max(leftDepth, rightDepth);
        }

        return depth;
    }

    public int findDepth(TreeNode root,int depth){

        if(root != null){
            int leftDepth = findDepth(root.left, depth+1);
            int rightDepth = findDepth(root.right, depth+1);

            depth = Math.max(leftDepth, rightDepth);
        }

        return depth;

    }


}