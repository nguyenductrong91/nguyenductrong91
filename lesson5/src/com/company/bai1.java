package com.company;

public class bai1 {
    static void findE() {
        String str = "Hello every one";
        int count = 0;
        System.out.println("Vị trí của ký tự e trong chuỗi lần lượt là :");
        for (int i =0;i <= str.length()-1;i++) {
            if (str.charAt(i) == 'e') {
                System.out.print(i+"\t");
                count++;

            }
        }
        System.out.println("\nSố chữ e có trong chuỗi là :" + count);
    }
}
