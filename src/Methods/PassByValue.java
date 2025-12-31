package Methods;

public class PassByValue {
    public static void Change(int x){
        x = 10;
        System.out.println("Value inside function: "+x);
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println("Value in main: "+x);
        Change(x);
        System.out.println("Value in main after applying function: "+x);
    }
    //There is no Pass by Reference in Java.
}
