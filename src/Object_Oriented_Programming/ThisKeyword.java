package Object_Oriented_Programming;

public class ThisKeyword {
    public static class Car{
        String name;
        String type;
        int seats;

        Car(String name, String type, int seats){
            //this points towards the class member
            this.name = name;
            this.type=type;
            this.seats=seats;
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
    }
}
