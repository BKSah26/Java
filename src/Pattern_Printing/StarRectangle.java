package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns:");
        int cols = sc.nextInt();
        for (int i=1; i<=cols; i++){
            for (int j=1; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
