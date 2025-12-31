package Methods;

import java.util.Scanner;

public class MaxOf3_BuilitIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Enter C:");
        int c = sc.nextInt();

        int max = Math.max(Math.max(a, b), c);
        System.out.println("Max of 3: "+max);
    }
}
