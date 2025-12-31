package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle:");
        Scanner sc = new Scanner(System.in);
        double r=sc.nextDouble();
        double a=3.14*r*r;
        System.out.println("Area of circle: "+a);
    }
}
