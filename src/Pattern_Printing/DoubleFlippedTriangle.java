package Pattern_Printing;

import java.util.Scanner;

public class DoubleFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of sides for the triangle:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=n+1-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
