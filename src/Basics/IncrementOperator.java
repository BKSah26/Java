package Basics;

public class IncrementOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a=a+1;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);

        int x = 10;
        int y = x++;
        System.out.println("X: "+x+"\n"+"Y: "+y);

        int p = 10;
        int q = ++p;
        System.out.println("P: "+p+"\n"+"Q: "+q);
    }
}
