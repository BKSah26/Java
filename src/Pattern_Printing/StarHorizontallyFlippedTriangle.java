package PatternPrinting;

import java.util.Scanner;

public class StarHorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines for the triangle pattern:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
