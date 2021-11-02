package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số phần tử");
//        int n = sc.nextInt();
//        bai1.bai1(n);

        System.out.println("Nhập số phần tử :");
        int n = sc.nextInt();
        Vehicle[] listVehicle = new Vehicle[n];
        for(int i = 0 ; i < listVehicle.length; i++){
            System.out.printf("Nhập thông tin Phương tiện %d: \n" , i+1);
            System.out.print("mã số: ");
            int id = sc.nextInt();
            String c = sc.nextLine();
            System.out.print("tên phương tiện: ");
            String name = String.valueOf(sc.nextLine());
            System.out.println("vận tốc : ");
            int speed = sc.nextInt();
            Vehicle vehicle = new Vehicle(id, name,speed);
            listVehicle[i] = vehicle;
        }

        for (Vehicle p : listVehicle ) {
            System.out.println(p);
        }
    }
}
