package PatternPrinting;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd no to print the star cross pattern:");
        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("Not Possible. Enter an odd no.");
        }
        else{
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n; j++){
                    if ((i==j) || ((i+j)==n+1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
