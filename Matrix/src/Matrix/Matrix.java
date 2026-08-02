package Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int row, col, i, j;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        row = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        col = scanner.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] res = new int[row][col];

        System.out.println("Enter the elements of matrix1: ");

        for (i = 0; i < row; i++){
            for (j = 0; j < col; j++)
                mat1[i][j] = scanner.nextInt();
        }
        System.out.println("Enter the elements of matrix2: ");

        for (i = 0; i < row; i++){
            for (j = 0; j < col; j++)
                mat2[i][j] = scanner.nextInt();
        }

        for (i = 0; i < row; i++){
            for (j = 0; j < col; j++)
               res[i][j] = mat1[i][j] - mat2[i][j];

            System.out.println("Subtraction of two matrices: ");

            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++){
                    System.out.print(res[i][j] +"\t ");

                    System.out.println();
                }

            }
        }


        scanner.close();
    }

}
