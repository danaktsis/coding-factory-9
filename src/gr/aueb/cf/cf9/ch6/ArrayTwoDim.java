package gr.aueb.cf.cf9.ch6;

public class ArrayTwoDim {

    public static void main(String[] args) {
        int[][] grid2 = new int[2][3];
        int[][] grid = {{ 1, 2, 3},
                         { 4, 5, 6}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
