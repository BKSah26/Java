package Object_Oriented_Programming;

public class PassingClassesToMethods {
    public static class Car{
        String name;
        String type;
        int seats;
        int torque;
        void print(){
            System.out.println("Name: "+name);
            System.out.println("Type: "+type);
            System.out.println("Seats: "+seats);
            System.out.println("Torque: "+torque);
        }
    }

    public static void Change(Car x){
        x.type="Hatchback";
        x.seats=5;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Kia Sonet";
        c.type =  "SUV";
        c.seats=7;
        c.torque=180;
        c.print();

        Change(c);

        c.print();
    }
}
