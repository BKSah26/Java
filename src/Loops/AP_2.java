package Loops;

import java.util.Scanner;

public class AP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 4, d=6;
        for (int i=0; i<n; i++){
            System.out.print(a+i*d+" ");
        }
    }
}
