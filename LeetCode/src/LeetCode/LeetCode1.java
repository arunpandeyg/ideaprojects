package LeetCode;


import java.util.Scanner;

public class LeetCode1 {

    public static void main(String[] args) {
        int m, n, c, d;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the items of matrix");
        m = scan.nextInt();
        n = scan.nextInt();
        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = scan.nextInt();

        System.out.println("Enter the elements of second matrix");
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                second[c][d] = scan.nextInt();
        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];  //replace + with - to subtract
        System.out.println("Sum of entered matrix: ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(sum[c][d] +" ");
            }
            System.out.println();
        }

    }

}