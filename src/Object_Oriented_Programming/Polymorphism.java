package Object_Oriented_Programming;

public class Polymorphism {
    public static class Dog{
        void sound(){
            System.out.println("Bark");
        }
    }
    public static class Cat{
        void sound(){
            System.out.println("Meow");
        }
    }
    public static class Cow{
        void sound(){
            System.out.println("Moo");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.sound();
        cat.sound();
        cow.sound();
    }
}
