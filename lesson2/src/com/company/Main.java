package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        String s = "học lập trình java không khó";
        System.out.println("chuỗi ban đầu là :" + s);
        String s_kUpperCase = s.replace("k", "K");
        System.out.println("chuỗi sau khi in hoa chữ k là : " + s_kUpperCase);
        String s_wordReplace = s.replace("khó", "dễ");
        System.out.println("chuỗi sau khi đổi khó sang dễ là:" + s_wordReplace);
        System.out.println("index của ký tự j là :" + s.indexOf('j'));


        Day monday = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day wednesday = Day.WEDNESDAY;
        Day thursday = Day.THURSDAY;
        Day friday = Day.FRIDAY;
        Day saturday = Day.SATURDAY;
        Day sunday = Day.SUNDAY;
        System.out.printf("Thứ Hai :"+ monday);
        System.out.printf("Thứ Ba :"+ tuesday);
        System.out.printf("Thứ Tư :"+ wednesday);
        System.out.printf("Thứ Năm :"+ thursday);
        System.out.printf("Thứ Sáu :"+ friday);
        System.out.printf("Thứ Bảy :"+ saturday);
        System.out.printf("Chủ Nhật :"+ sunday);

    }
}

