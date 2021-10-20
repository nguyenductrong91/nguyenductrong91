package com.company;

import java.util.Scanner;

public class Main {


    public static void triangle(double x,double y,double z) {
        if ((x + y) > z && (x + z) > y && (y + z) > x) {
            System.out.println("3 cạnh có thể hợp thành tam giác");
        }else
        {
            System.out.println("3 cạnh không thể hợp thành tam giác");
        }

    }


    public static void studenAverage (double math,double physics,double literature,double chemistry) {
        double average = (math + physics + literature + chemistry) / 4;
        if (average < 4.5) {
            System.out.println("Học lực yếu");
        }
        if (average >= 4.5 && average < 6) {
            System.out.println("Học lực trung bình");
        }
        if (average >= 6 && average < 8) {
            System.out.println("Học lực khá");
        }
        if (average >= 8) {
            System.out.println("Học lực giỏi");
        }
    }


    public static void quadratic (double a,double b,double c) {
        double delta = (b * b) - (4 * a * c);
        if (a == 0) {
            System.out.println("bạn nhập sai giá trị biến a!");
        }
        if (a != 0 && delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        }
        if (a != 0 && delta == 0) {
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + ((b / (2 * a)) * (-1)));
        }
        if (a != 0 && delta > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn lựa chọn");
        System.out.println("1-Kiểm tra 3 cạnh tam giác");
        System.out.println("2-Đánh giá học lực học sinh");
        System.out.println("3-Giải phương trình bậc 2");
        System.out.println("0-Thoát chương trình");
        int choice = sc.nextInt();
        switch (choice) {


            case 1:
                //bài 1
                System.out.println("Mời bạn nhập vào số đo 3 cạnh:");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double z = sc.nextDouble();
                triangle(x,y,z);
            break;

            case 2:


                //bài 2
                System.out.println("Nhập điểm lần lượt 4 môn Toán , Văn , Lý , Hóa :");
                double math = sc.nextDouble();
                double physics = sc.nextDouble();
                double literature = sc.nextDouble();
                double chemistry = sc.nextDouble();
                studenAverage(math,physics,literature,chemistry);
                break;

            case 3:
                //bài 3
                System.out.println("Nhập vào 3 biến a , b , c của phương trình bậc 2 ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                quadratic(a,b,c);
                break;


            case 0:
                System.exit(0);


            default:
                System.out.println("bạn nhập sai");
                break;


        }


    }

}
