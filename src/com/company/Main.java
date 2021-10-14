package com.company;

public class Main {

    public static void main(String [] args) throws Exception {
        double height =1.65;
        double weight = 60;
        double BMI;
        BMI = weight / ( height * height);
        System.out.println("Your BMI is:"+ BMI);
    }

}

