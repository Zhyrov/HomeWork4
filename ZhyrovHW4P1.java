package com.epam.lesson4;

import java.util.Scanner;

public class ZhyrovHW4P1 {
    public static void main(String[] args){
        System.out.print("Enter integer");
        Scanner sc = new Scanner (System.in);
        int integer = sc.nextInt();
        String result = subStr(integer);
        System.out.println("Res->" + result);
    }

    public static String subStr(int integer){
        int b;
        String binar = "";
        while(integer!=0){
            b = integer%2;
            binar = b + binar;
            integer = integer/2;
        }
        return binar;
    }
}
