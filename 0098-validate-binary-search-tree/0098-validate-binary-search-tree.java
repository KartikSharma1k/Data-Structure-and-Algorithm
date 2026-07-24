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

    Set<Integer> set;

    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        set = new HashSet();
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, int min, int max) {

        System.out.println("min: "+min+", max: "+max);

        if (root == null)
            return false;

        if ((root.val > max || root.val < min))
            return false;

        if(set.contains(root.val)) return false;

        set.add(root.val);

        boolean left = true, right = true;

        if (root.left != null) {
            if (root.left.val < root.val) {
                left = isValidBST(root.left, min, root.val);
            } else
                return false;
        }

        if (root.right != null) {
            if (root.right.val > root.val) {
                right = isValidBST(root.right, root.val, max);
            } else
                return false;
        }

        if (!left || !right)
            return false;

        return true;

    }
}