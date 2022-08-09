import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the field size:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        char[][] massive = new char[rows][cols];
        System.out.println("Generating bombs:");
        fillMatrix(massive,rows,cols);
        System.out.println();
        char[][] numberArray = new char[rows][cols];

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length;  j++) {
                numberArray[i][j] = checkNextField(i, j, massive);
            }
        }
        System.out.println("Putting number of bombs around:");
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length;  j++) {
                if (massive[i][j]=='*') {
                    numberArray[i][j]='*';
                    System.out.print(numberArray[i][j]+" ");
                } else System.out.print(numberArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void fillMatrix (char[][] matrix,int rows,int cols)
    {
        Random random = new Random(System.currentTimeMillis());
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                if (random.nextInt(2)==0) matrix[i][j]='.';
                else matrix[i][j]='*';
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static char checkNextField(int i, int j, char[][] massive) {
        int count = 0;
        if (j <= massive[i].length - 2) { // to the right
            count += massive[i][j + 1] == '*' ? 1 : 0;
        }
        if (j <= massive[i].length - 2 && i <= massive.length - 2) { // move to top right
            count += massive[i + 1][j + 1] == '*' ? 1 : 0;
        }
        if (j <= massive[i].length - 2 && i > 0) { // move to bottom right
            count += massive[i - 1][j + 1] == '*' ? 1 : 0;
        }
        if (j > 0) { // to the left
            count += massive[i][j - 1] == '*' ? 1 : 0;
        }
        if (j > 0 && i <= massive.length - 2) { // to top left
            count += massive[i + 1][j - 1] == '*' ? 1 : 0;
        }
        if (j > 0 && i > 0) { // to bottom left
            count += massive[i - 1][j - 1] == '*' ? 1 : 0;
        }
        if (i <= massive.length - 2) { // move to top
            count += massive[i + 1][j] == '*' ? 1 : 0;
        }
        if (i > 0) { // move top bottom
            count += massive[i - 1][j] == '*' ? 1 : 0;
        }
        String stringValue = String.valueOf(count);
        return stringValue.charAt(0);
    }
}

