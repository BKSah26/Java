package Object_Oriented_Programming;

public class Constructors {
    public static class Car{
        String name;
        String type;
        int seats;

        //Default Constructor
        Car(){

        }

        //Constructor Overloading
        Car(String carName, String carType, int carSeats){
            name = carName;
            type=carType;
            seats=carSeats;
        }

        void print(){
            System.out.println("Name: "+ name);
            System.out.println("Type: "+ type);
            System.out.println("Seats: "+ seats);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Kia Carens", "SUV", 7);
        c1.print();

        Car c2 = new Car("Maruti Suzuki Ciaz", "Sedan", 6);
        c2.print();
        c2.seats=5;
        System.out.println("After changing value:");
        c2.print();

        Car c3 = new Car();
        c3.name = "Honda City";
        c3.seats=5;
        c3.type="Sedan";
        c3.print();
    }
}
