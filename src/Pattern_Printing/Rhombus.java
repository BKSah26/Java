package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of sides for the rhombus:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
