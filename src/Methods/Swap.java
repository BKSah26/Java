package Methods;

import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b){
        System.out.println("Values before swap:");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap:");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        swap(a, b);
    }
}
