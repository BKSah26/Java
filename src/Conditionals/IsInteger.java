package Conditionals;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n = sc.nextDouble();
        int x = (int)n;

        if ((n-x) == 0){
            System.out.println("Integer");
        }
        else {
            System.out.println("Not an Integer");
        }
    }
}
