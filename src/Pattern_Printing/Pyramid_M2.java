package PatternPrinting;

import java.util.Scanner;

public class Pyramid_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines for the triangle:");
        int n = sc.nextInt();

        //nsp = no of spaces
        //nst = no of stars
        int nsp = n-1, nst = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }
    }
}
