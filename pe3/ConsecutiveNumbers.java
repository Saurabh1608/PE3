package com.stackroute.unittest.pe3;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class ConsecutiveNumbers {

    public String consecutiveNumbers(String series) {
        String[] numberSeries = series.split(",");
        int[] numberInt = new int[numberSeries.length];

        for (int i = 0; i < numberSeries.length; i++) {
            numberInt[i] = Integer.parseInt(numberSeries[i].trim());
        }

        Arrays.sort(numberInt);
        for (int i = 0; i < numberSeries.length-1; i++) {
           if((numberInt[i+1]-numberInt[i])!=1){
               return "Not a consecutive series";
           }
        }
        return "Consecutive series";
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the series");
        String series = scanner.next();
        ConsecutiveNumbers consecNumbers = new ConsecutiveNumbers();
        String res = consecNumbers.consecutiveNumbers(series);
        System.out.println(res);
    }
}