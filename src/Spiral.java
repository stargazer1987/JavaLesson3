import java.util.Arrays;

public class Spiral {
    private int rows = 2;
    private int cols = 2;

    public Spiral() {}

    public Spiral(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }


    public int[][] createSpiral() {
        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }

        return arr;
    }

    public void printSpiral(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

