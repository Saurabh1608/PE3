package com.stackroute.unittest.pe3;
import java.util.Scanner;

public class MatrixAdd {

    void error(int rows, int colomn) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[rows][colomn];
        int[][] matrix2 = new int[rows][colomn];
        int[][] sum = new int[rows][colomn];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomn; j++) {

                System.out.println("enter the elements for the Matrix1");
                matrix1[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomn; j++) {

                System.out.println("enter the elements for the Matrix2");
                matrix2[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < colomn; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < colomn; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }

    }

}
