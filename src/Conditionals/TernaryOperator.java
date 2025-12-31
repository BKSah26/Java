package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        boolean val = (a==0) ? false : true;
        System.out.println(val);

    }
}
