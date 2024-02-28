package codewars.range_sum_of_bst;


public class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        var sum = 0;
        if (root == null) return 0;
        if (root.val >= low && root.val <= high) sum += root.val;
        if (low < root.val) sum += rangeSumBST(root.left, low, high);
        if (high > root.val) sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}
