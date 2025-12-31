package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd no to print the star plus pattern:");
        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("Not Possible. Enter an odd no.");
        }
        else{
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n; j++){
                    if ((i%((n+1)/2)==0) || (j%((n+1)/2)==0)){
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
