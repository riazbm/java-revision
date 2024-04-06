package org.example.chapter1;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double PI = 3.141;
        final double KG_per_POUND = 0.45359;
        final double Meter_per_INCH = 0.0254;
        double area;

        System.out.println("enter radius:");
        double radius = input.nextDouble();
        if (radius < 0) {
            System.out.println("incorrect input");
        }
        else {
            area = radius * radius * PI;
            System.out.println("the area is " + area);
        }
//        calculating BMI
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();

        double weightInKilograms = weight * KG_per_POUND;
        double heightInMeters = height * Meter_per_INCH;
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + BMI);
        if (BMI < 18.5){
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
//        boolean operators
        System.out.println("Enter a year:");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + "is a leap year? " + isLeapYear);
    }
}
