package PatternPrinting;

import java.util.Scanner;

public class OddNoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of lines for the triangle:");
        int n = sc.nextInt();

        int stat=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(stat+" ");
                stat+=2;
            }
            System.out.println();
            stat=1;
        }
    }
}
