package Conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price:");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price:");
        double sp = sc.nextDouble();

        if (sp>cp){
            System.out.println("Profit Percent: "+ (sp-cp)/cp*100);
        }
        else if(cp>sp){
            System.out.println("Loss Percent: "+ (cp-sp)/cp*100);
        }
        else{
            System.out.println("No profit or loss");
        }
    }
}
