package Conditionals;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if (num>999 && num<10000){
            System.out.println(num+" is a 4 digit number.");
        }
        else{
            System.out.println(num+" is not a 4 digit number.");
        }
    }
}
