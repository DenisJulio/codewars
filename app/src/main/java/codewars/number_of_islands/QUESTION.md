# Number of Islands
[Problem](https://leetcode.com/problems/number-of-islands/description/)

Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Example 1:

```
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

```

## Example 2:

```
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
```

## Example 3:

```
Input: grid = [
  ["1","0","1","0","1"],
  ["1","1","1","0","0"],
]
Output: 2
```

## Constraints:

```
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
```
## Solution

* Check whether a land is part of an island
  * if not increase the island count, else iterate next

TODO: How to calculate whether a land is part of an island

* Count the number of islands in the first row
* Count the number of islands in the next row
* Count the number os islands of the previous row which borders the rows islands
