package com.stackroute.unittest.pe3;

public class Chess {

    public static void main(String[] args){
        int i,j;
        String[][] arr =new String[8][8];
        for(j=0;j<8;j=j+2){
            for (i=0;i<8;i=i+2){
                arr[j][i]= ("ww|");
            }
        }
        for(j=1;j<8;j=j+2){
            for (i=1;i<8;i=i+2){
                arr[j][i]= ("ww|");
            }
        }
        for(j=0;j<8;j=j+2){
            for (i=1;i<8;i=i+2){
                arr[j][i]= ("bb|");
            }
        }
        for(j=1;j<8;j=j+2){
            for (i=0;i<8;i=i+2){
                arr[j][i]= ("bb|");
            }
        }



        for(j=0;j<8;j++) {
            for (i = 0; i < 8; i++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

    }
}
