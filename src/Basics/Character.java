package Basics;

public class Character {
    public static void main(String[] args) {
        char ch1='a';
        System.out.println(ch1);

        char ch2= 'A';
        System.out.println(ch2);

        char ch3='$';
        System.out.println(ch3);

        char ch4= '0';
        System.out.println(ch4);

        //ASCII Values
        int a = ch1, b = ch2, c = ch3, d = ch4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        char x = 'O';
        System.out.println(x+0);    //This prints the ASCII value of the character.

        int y=65, z=33;
        System.out.println((char)(y));
        System.out.println((char)(z));
    }
}
