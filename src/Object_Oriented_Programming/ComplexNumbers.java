package Object_Oriented_Programming;

public class ComplexNumbers {
    public static class ComplexNumber {
        double x;
        double y;

        ComplexNumber(double x, double y) {
            this.x = x;
            this.y = y;
        }

        void print() {
            if (x < 0) {
                System.out.print("-" + (-x));
            } else {
                System.out.print(x);
            }
            if (y < 0) {
                System.out.print(" - " + (-y) + "i");
            } else {
                System.out.print(" + " + y + "i");
            }
            System.out.println();
        }

        void add(ComplexNumber z) {
            x += z.x;
            y += z.y;
        }

        void subtract(ComplexNumber z) {
            x -= z.x;
            y -= z.y;
        }

        void multiply(ComplexNumber z) {
            double r = x * z.x - y * z.y;
            double i = x * z.y + y * z.x;
            x = r;
            y = i;
        }

        void divide(ComplexNumber z) {
            double denominator = z.x * z.x + z.y * z.y;
            if (denominator == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }

            ComplexNumber conjugate = new ComplexNumber(z.x, -z.y);
            this.multiply(conjugate);
            this.x /= denominator;
            this.y /= denominator;
        }
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(-6, 7);
        ComplexNumber c2 = new ComplexNumber(-5, -5);

        c1.print();
        c2.print();

        c1.add(c2);
        c1.print();

        c1.subtract(c2);
        c1.print();

        c1.multiply(c2);
        c1.print();

        c1.divide(c2);
        c1.print();
    }
}