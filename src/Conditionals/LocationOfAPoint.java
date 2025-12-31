package Conditionals;

import java.util.Scanner;

public class LocationOfAPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X Coordinate:");
        int x = sc.nextInt();
        System.out.print("Enter Y Coordinate:");
        int y = sc.nextInt();

        if (x>0 && y>0){
            System.out.println("Point lies in 1st Quadrant.");
        }
        else if(x<0 && y>0){
            System.out.println("Point lies in 2nd Quadrant.");
        }
        else if(x<0 && y<0){
            System.out.println("Point lies in 3rd Quadrant.");
        }
        else if(x>0 && y<0){
            System.out.println("Point lies in 4th Quadrant.");
        }
        else if(x!=0 && y==0){
            System.out.println("Point lies on the X-Axis.");
        }
        else if(x==0 && y!=0){
            System.out.println("Point lies on the Y-Axis.");
        }
        else {
            System.out.println("Point is at the Origin.");
        }
    }
}
