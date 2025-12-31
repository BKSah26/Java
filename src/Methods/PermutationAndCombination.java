package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();

        int nFactorial = Factorial(n);
        int rFactorial = Factorial(r);
        int nrFactorial = Factorial(n-r);

        System.out.print("Combination: "+(nFactorial/(rFactorial*nrFactorial))+"\n");
        System.out.print("Permutation: "+(nFactorial/rFactorial));
    }
    public static int Factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
}
