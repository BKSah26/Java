package Object_Oriented_Programming;

public class ShallowCopy {
    private static class Pokemon{
        String name;
        String type;;
        int hp;
        int attack;

        void print(){
            System.out.println("Name: "+ name);
            System.out.println("Type: "+ type);
            System.out.println("HP: "+ hp);
            System.out.println("Attack: "+ attack);
        }
    }
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.type = "Electric";
        p1.hp=100;
        p1.attack=70;
        p1.print();

        Pokemon p2 = new Pokemon();
        p2.name="Charizard";
        p2.type="Fire";
        p2.hp=120;
        p2.attack=110;
        p2.print();

        Pokemon p3 = p1;
        //This creates a shallow copy of p1, which means p3 can control p1.
        p3.name="Zapdos";
        p3.print();
        p1.print();
    }
}
