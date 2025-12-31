package Methods;

public class MaxOf3 {
    public static int max(int a, int b, int c){
        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(5, 10, 11));
        System.out.println(max(5, 10, 10));
        System.out.println(max(5, 2, 5));
    }
}
