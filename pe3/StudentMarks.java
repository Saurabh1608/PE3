package com.stackroute.unittest.pe3;

import java.util.*;
import java.util.Scanner;

public class StudentMarks {

    public static String checkGrade(int numOfStudents) {

        Scanner sc=new Scanner(System.in);

        int[] stuGrades= new int[numOfStudents];
        StringBuilder result=new StringBuilder();
        System.out.println("Enter grades of students:");


        for(int i = 0; i <numOfStudents ; i++)
        {
            stuGrades[i] = sc.nextInt();

            // chek if grade is between 0 and 100
            if ((stuGrades[i] >= 0) && (stuGrades[i] <= 100)) {

                continue;
            }
            result.append("ERROR,!Please give input again");
        }
        return result.toString();
    }


    public static void main(String[] args){

        int numOfStudents;
        System.out.println("Enter no of students:");
        Scanner sc=new Scanner(System.in);
        numOfStudents=sc.nextInt();


        StudentMarks doCheckGrade =new StudentMarks();
        String result=doCheckGrade.checkGrade(numOfStudents);
        System.out.println(result);

    }


}
