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
            if (x<0){
                System.out.print("-"+(-x));
            }
            else{
                System.out.print(x);
            }
            if (y<0){
                System.out.print(" - "+(-y)+"i");
            }
            else{
                System.out.print(" + "+y+"i");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, -2);
        ComplexNumber c2 = new ComplexNumber(2, 5);
        ComplexNumber c3 = new ComplexNumber(-6, 7);
        ComplexNumber c4 = new ComplexNumber(-5, -5);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
