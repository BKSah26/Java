package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if (num<=1){
            System.out.println("Neither Prime nor Composite");
        }
        else{
            boolean flag = true;
            for (int i=2; i<Math.sqrt(num); i++){
                if (num%i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        }
    }
}
