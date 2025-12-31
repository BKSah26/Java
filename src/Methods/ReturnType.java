package Methods;

public class ReturnType {
    public static int Function(int x){
        System.out.println("Methods in Java");
        System.out.println("Raghav Garg");
        if (x > 10){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int val = Function(7);   //Just calling this will print all the print statements
        System.out.println(val-5);  //The value will only be printed when written inside print statement
    }
}
