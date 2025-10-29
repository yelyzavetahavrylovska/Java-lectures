package Module1.lesson1;

public class Example7 {
    public static void main(String [] args){
        int a = 2_000_000_000;
        int b = 5;
        System.out.println(b);

        b = 1; // b --> 5 --> 1
        System.out.println(b);

        b = a; // a --> 2 000 000 000 --> b
        System.out.println(b);
    }
}
