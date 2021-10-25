package com.company;

public class bai3 {
    static void longestWord() {
       String input = "Không có gì quý hơn độc lập tự do";
       int len = 0;
       int maxLength = 0;
       int address = 0;
       for (int i = 0; i < input.length();i++) {
           if (input.charAt(i) == ' ') {
               len = 0;
           }else if (input.charAt(i) != ' ') {
               len++;

           }
           if (len > maxLength) {
               maxLength = len;
               address = i-maxLength+1;
           }
       }
        System.out.println("Từ dài nhất là : "+input.substring(address,address+maxLength));
    }
}
