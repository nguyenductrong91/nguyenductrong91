package com.company;
import java.util.Scanner;

public class Main {

    public static void number(int n) {
        String result = n % 2 == 0 ? n + " là số chẵn" : n + " là số lẻ";
        System.out.println(result);
    }

    public static void hypotenuse(double a,double b) {
        double c = Math.sqrt(a*a+b*b);
        System.out.printf("Cạnh huyền có độ dài là :%.2f", c );
        System.out.println();
    }

    public static void  math(int x,int y) {
        System.out.println("tổng 2 số là:"+(x+y));
        System.out.println("hiệu 2 số là:"+(x-y));
        System.out.println("tích 2 số là:"+(x*y));
        double value1 = (double)x;
        double value2 = (double)y;
        double value3 = value1 / value2;
        System.out.printf("thương 2 số là: %.2f ",value3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên bất kỳ");
        int n = sc.nextInt();
        number(n);

        System.out.println("Nhập vào 2 cạnh tam giác vuông");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        hypotenuse(a,b);

        System.out.println("Nhập vào 2 số nguyên bất kỳ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        math(x,y);

    }
}
