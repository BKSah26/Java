package Loops;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to print its multiplication table:");
        int num = sc.nextInt();
        for (int i = num; i <= num*10; i+=num) {
            System.out.print(i+" ");
        }
    }
}
