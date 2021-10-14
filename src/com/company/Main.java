package com.company;

public class Main {
        public static void voidBMI(double weight,double height) {
            System.out.println("chi so BMI kieu void la:"+ weight/(height*height));
        }
        public static double doubleBMI (double weight,double height) {
            System.out.println("chi so BMI kieu double la:"+ weight/(height*height));
            return weight/(height*height);
        }
        public static double noneParamBMI () {
            double weight  ;
            double height;
            weight =60;
            height = 1.65;
            System.out.println("chi so BMI kieu noneparamBMI la:"+ weight/(height*height));
            return weight/(height*height);
        }

        public static void main(String [] args) throws Exception {
           voidBMI(60,1.65);
           doubleBMI(60,1.65);
           noneParamBMI();




    }


}

