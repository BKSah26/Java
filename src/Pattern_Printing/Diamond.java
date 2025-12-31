package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of sides for the diamond:");
        int n = sc.nextInt();

        //nsp = no of spaces
        //nst = no of stars
        int nsp=n-1, nst=1;
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

        nsp = 1; nst = 2*n-3;
        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            nsp+=1;
            nst-=2;
            System.out.println();
        }
    }
}
