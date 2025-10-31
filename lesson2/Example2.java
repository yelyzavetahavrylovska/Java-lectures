package Module1.lesson2;

public class Example2 {
    public static void main(String[]args){
        byte a = 127;
        a+= 128;

        System.out.println(a);

        byte b = -128;
        b -= 128;
        System.out.println(b);

        byte c = Byte.MIN_VALUE;
        System.out.println(c);

        byte d = Byte.MAX_VALUE;
        System.out.println(d);
    }
}
