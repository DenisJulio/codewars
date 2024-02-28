package codewars.range_sum_of_bst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void test() {
        var tree = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));    
        var sum = solution.rangeSumBST(tree, 7, 15);
        assertEquals(32, sum);
    }
}
