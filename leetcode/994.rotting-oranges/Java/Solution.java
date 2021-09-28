import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/* 994. Rotting Oranges
You are given an m x n grid where each cell can have one of three values:

* 0 representing an empty cell,
* 1 representing a fresh orange, or
* 2 representing a rotten orange.

Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
*/

/**
 * Solution
 */
public class Solution {
    public static int visit(int[][] grid, HashSet<String> fresh, Queue<String> queue) {
        int r = grid.length, c = grid[0].length;
        int ans = 0;
        if (fresh.size() == 0) {
            return 0;
        }
        while (!queue.isEmpty()) {
            String coord = queue.poll();
            if (!coord.equals("d")) {
                int i = coord.charAt(0) - '0';
                int j = coord.charAt(1) - '0';
                String neighbour;
                // West neighbour
                if (i > 0) {
                    neighbour = "" + (i - 1) + j;
                    if (fresh.contains(neighbour)) {
                        queue.add(neighbour);
                        fresh.remove(neighbour);
                    }
                }
                // North
                if (j > 0) {
                    neighbour = "" + i + (j - 1);
                    if (fresh.contains(neighbour)) {
                        queue.add(neighbour);
                        fresh.remove(neighbour);
                    }
                }
                // East
                if (i < r - 1) {
                    neighbour = "" + (i + 1) + j;
                    if (fresh.contains(neighbour)) {
                        queue.add(neighbour);
                        fresh.remove(neighbour);
                    }
                }
                if (j < c - 1) {
                    neighbour = "" + i + (j + 1);
                    if (fresh.contains(neighbour)) {
                        queue.add(neighbour);
                        fresh.remove(neighbour);
                    }
                }
            } else {
                if (queue.peek() != null)
                    queue.add("d");
                ans++;
                if (fresh.isEmpty()) {
                    break;
                }
            }
        }
        if (!fresh.isEmpty()) {
            return -1;
        }
        return ans;
    }

    public static int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        HashSet<String> fresh = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    fresh.add(new String("" + i + j));
                } else if (grid[i][j] == 2) {
                    queue.add(new String("" + i + j));
                }
            }
        }
        queue.add("d");

        return visit(grid, fresh, queue);
    }

    public static int test1() {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        return orangesRotting(grid);
    }


    public static int test2() {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        return orangesRotting(grid);
    }


    public static int test3() {
        int[][] grid = {{0,2}};
        return orangesRotting(grid);
    }


    public static int test4() {
        int[][] grid = {{2, 1, 0, 2, 1},
                         {1, 0, 1, 2, 1},
                         {1, 0, 0, 2, 1}};
        return orangesRotting(grid);
    }

    public static void main(String[] args) {
        if (4 == test1())
            System.out.println("test1() passed!");
        else 
            System.out.println("test1() failed!");
        if (-1 == test2()) {
            System.out.println("test2() passed!");
        } else {
            System.out.println("test2() failed!");
        }
        if (0 == test3()) {
            System.out.println("test3() passed!");
        } else {
            System.out.println("test3() failed!");
        }
        if (2 == test4()) {
            System.out.println("test4() passed!");
        } else {
            System.out.println("test4() failed!");
        }   
    }
}