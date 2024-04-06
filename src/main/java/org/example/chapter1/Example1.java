package org.example.chapter1;
import java.util.Scanner;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.141;
        double area;
        double circumference;

        System.out.println("enter the number for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + "seconds is" + minutes + "minutes and" + remainingSeconds + "seconds");
        System.out.println(Math.pow(2, 5));

    }
}
