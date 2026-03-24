package Object_Oriented_Programming;

public class ComplexNumbers {
    public static class ComplexNumber{
        int x;
        int y;

        ComplexNumber(int x, int y){
            this.x = x;
            this.y=y;
        }

        void print(){
            if (y<0){
                System.out.println(x+" - "+(-y)+"i");
            }
            else{
                System.out.println(x+" + "+y+"i");
            }
        }
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, -2);
        ComplexNumber c2 = new ComplexNumber(2, 5);
        c1.print();
        c2.print();
    }
}
