package com.stackroute.unittest.pe3;

import java.util.*;



public class HandleExceptionCheck {

    public static void checkExceptions(){
        /*Negative Array Size Exception*/
        try{
            int array[] = new int[-2];
        }
        catch (Exception e){
            e.printStackTrace();
        }

        /*ArrayIndexOutOfBounds Exception*/
        try{
            int array[] = new int[1];
            array[0] = 0;
            System.out.println(array[1]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        /*NullPointerException*/
        try{
            String str = null;
            int len = str.length();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){

        checkExceptions();
    }
}