package PatternPrinting;

import java.util.Scanner;

public class Pyramid_M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines for the triangle:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
