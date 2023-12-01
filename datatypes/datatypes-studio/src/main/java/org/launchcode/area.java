package org.launchcode;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
    }
         private static double calculateArea(double radius) {
        double pi = 3.14;
        return pi * radius * radius;





    }
}