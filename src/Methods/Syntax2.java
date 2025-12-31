package Methods;

public class Syntax2 {
    public static void AirForce(){
        System.out.println("Indian Air Force");
        Army();
    }
    public static void Army(){
        System.out.println("Army");
        Navy();
    }
    public static void Navy(){
        System.out.println("Navy");
        AirForce();
    }
    public static void main(String[] args) {
        AirForce();
    }
}
