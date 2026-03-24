package Object_Oriented_Programming;

class Cricketer{
    final String country = "India";
    static String IPLTeam;
    String name;
    int runs;
    double avg;
}
public class FinalAndStaticKeyword {

    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //The country will be India for all cricketers and cannot be changed.
        System.out.println(c1.country);
        //Trying to change will give an error.
        //c1.country = "England";

        c1.IPLTeam = "Chennai Super Kings";
        System.out.println(c1.IPLTeam);

        //const creates a shareable variable.
        //Hence, c2 will also have the value of c1.
        Cricketer c2 = new Cricketer();
        System.out.println(c2.IPLTeam);

        c2.IPLTeam = "Sunrisers Hyderabad";
        System.out.println(c1.IPLTeam);
        System.out.println(c2.IPLTeam);
    }
}
