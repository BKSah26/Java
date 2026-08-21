package Object_Oriented_Programming;

class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num=num;
        this.den=den;
        simplify();
    }

    int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    void simplify(){
        int hcf = gcd(num, den);
        num = num/hcf;
        den = den/hcf;
    }

    void print(){
        System.out.println(num+"/"+den);
    }

    void add(Fraction f){
        num = num*f.den+f.num*den;
        den = den*f.den;
        this.simplify();
    }

    void subtract(Fraction f){
        num = num*f.den - f.num*den;
        den = den*f.den;
        this.simplify();
    }

    void multiply(Fraction f){
        num = num*f.num;
        den = den*f.den;
        this.simplify();
    }

    void divide(Fraction f){
        num = num*f.den;
        den = den*f.num;
        this.simplify();
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 10);
        Fraction f2 = new Fraction(10, 5);
        f1.print();
        f2.print();
        f1.add(f2);
        f1.print();
        f1.subtract(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        Fraction f3 = new Fraction(6, 26);
        f3.print();
        f3.divide(f2);
        f3.print();
    }
}
