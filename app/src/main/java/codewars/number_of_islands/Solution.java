package codewars.number_of_islands;

import java.util.ArrayDeque;

class Solution {
  public int numIslands(char[][] grid) {
    var numIslands = 0;
    for (var row = 0; row < grid.length; row++)
      for (var col = 0; col < grid[row].length; col++)
        if (grid[row][col] == '1') {
          searchIslands(grid, row, col);
          numIslands++;
        }
    return numIslands;
  }

  private record Pair(int row, int col) {
  }

  private void searchIslands(char[][] grid, int row, int col) {
    var stack = new ArrayDeque<Pair>();
    stack.push(new Pair(row, col));
    while (!stack.isEmpty()) {
      var pair = stack.pop();
      grid[pair.row()][pair.col()] = '0';
      pushIfLand(grid, pair.row() - 1, pair.col(), stack);
      pushIfLand(grid, pair.row(), pair.col() + 1, stack);
      pushIfLand(grid, pair.row() + 1, pair.col(), stack);
      pushIfLand(grid, pair.row(), pair.col() - 1, stack);
    }
  }

  private void pushIfLand(char[][] grid, int row, int col, ArrayDeque<Pair> stack) {
    if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == '1')
      stack.push(new Pair(row, col));
  }
}
