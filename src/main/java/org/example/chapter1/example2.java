package org.example.chapter1;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.141;
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
    }
}
