package com.stackroute.unittest.pe3;

import java.util.*;
import java.util.Scanner;

public class Matrix {


    public static void main(String[] args) {

        int rows, colomn;
        System.out.println("Enter no of rows:");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();

        System.out.println("Enter no of colomn:");
        colomn = sc.nextInt();

        MatrixAdd addition = new MatrixAdd();
        addition.error(rows,colomn);
    }
}
