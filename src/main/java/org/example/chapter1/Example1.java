package org.example.chapter1;
import java.util.Scanner;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.141;
        double area;
        double circumference;

        System.out.println("enter the number for radius: ");
        double radius = input.nextDouble();

        area = radius * radius * PI;
        circumference = PI * (radius * 2);

        System.out.println("area of a circle is" + area);
        System.out.println("circumference of the circle is " + circumference);
    }
}
