package Methods;

public class Syntax1 {
    public static void Greet(){
        System.out.println("Jai Hind!");
    }
    public static void main(String[] args) {
        Trishakti();
        Greet();
        System.out.println("India");
        Army();
    }
    public static void Trishakti(){
        System.out.println("National Defence Academy");
    }
    public static void Army(){
        System.out.println("Indian Army");
        AirForce();
        Navy();
    }
    public static void AirForce(){
        Navy();
        System.out.println("Indian Air Force");
    }
    public static void Navy(){
        System.out.println("Indian Navy");
    }
}
