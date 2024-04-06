package org.example.chapter1;
import java.util.Scanner;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number for radius: ");
        double radius = input.nextDouble();
        double area = input.nextDouble();

        area = radius * radius * 3.14;

        System.out.println("area of a circle is" + area);
    }
}
