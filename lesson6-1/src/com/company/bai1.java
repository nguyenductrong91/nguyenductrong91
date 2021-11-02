package com.company;
import java.util.Scanner;
public class bai1 {
    static void bai1(int n){
        Scanner sc = new Scanner(System.in);
        int [] numbers;
        int min = 0;
        int max = 0;
        numbers = new int[n];
        for (int i = 0;i < numbers.length;i++){
            System.out.printf("Nhập phần tử có index %d :" ,i);
            int number = sc.nextInt();
            numbers[i] = number;
            min = numbers[0];
            while (min > number){min = number;}
            while (max < number){max = number;}
        }
        System.out.println("Số nhỏ nhất là :"+min);
        System.out.println("Số lớn nhất là :"+max);
        System.out.println("Mảng sau khi nhập :");
        for (int i =0;i < numbers.length;i++) {
            System.out.print(numbers[i]+"\t");
        }
    }
}
