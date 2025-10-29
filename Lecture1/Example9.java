package Module1.lesson1;

public class Example9 {
    public static void main(String[] args) {
        String text = "Hello " + "Dnipro" + "!";
        System.out.println(text);

        int a = 10;
        int b = 27;
        String s = "1";

        String result1 = a + s;
        System.out.println(result1);

        String result2 = a + b + s;
        System.out.println(result2);

        String result3 = s + a + b;
        System.out.println(result3);

        String result4 = s + (a + b);
        System.out.println(result4);
    }
}
