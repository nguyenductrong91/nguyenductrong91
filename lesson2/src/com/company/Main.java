package com.company;

import java.util.Locale;

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
        String s1 = s.substring(0,1);
        String s2 = s.substring(1, s.length()-2);
        String s3 = s.substring(s.length()-1,s.length());
        System.out.println("chuỗi ký tự khi viết hoa chữ cái đầu và cuối là :"+s1.toUpperCase()+s2+s3.toUpperCase());


        Day monday = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day wednesday = Day.WEDNESDAY;
        Day thursday = Day.THURSDAY;
        Day friday = Day.FRIDAY;
        Day saturday = Day.SATURDAY;
        Day sunday = Day.SUNDAY;



        System.out.println("Thứ Hai :"+ monday);
        System.out.println("Thứ Ba :"+ tuesday);
        System.out.println("Thứ Tư :"+ wednesday);
        System.out.println("Thứ Năm :"+ thursday);
        System.out.println("Thứ Sáu :"+ friday);
        System.out.println("Thứ Bảy :"+ saturday);
        System.out.println("Chủ Nhật :"+ sunday);
    }
}



