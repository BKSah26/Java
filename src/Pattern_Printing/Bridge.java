package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines for the bridge:");
        int n = sc.nextInt();

        for (int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("  ");
            }
            for (int l=1; l<=n-i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
