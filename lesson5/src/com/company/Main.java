package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        //bai1
        bai1.findE();

        //bai2
        System.out.println("Nhập vào chuỗi A :");
        String strA = sc.nextLine();
        System.out.println("Nhập vào chuỗi B :");
        String strB = sc.nextLine();
        bai2.findStrB(strA,strB);

        //bai3
        bai3.longestWord();
    }



}
