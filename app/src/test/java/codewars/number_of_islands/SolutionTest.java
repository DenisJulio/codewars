package codewars.number_of_islands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void testSingleRow() {
    char[][] grid = new char[][] {
        { '1', '0', '1', '0', '1' }
    };
    assertEquals(3, solution.numIslands(grid));
  }

  @Test
  void testTwoRows() {
    char[][] grid = new char[][] {
        { '1', '0', '1', '0', '1' },
        { '1', '1', '1', '0', '0' }
    };
    assertEquals(2, solution.numIslands(grid));
  }
}