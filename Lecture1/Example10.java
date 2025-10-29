package Module1.lesson1;

public class Example10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 21;

        System.out.println(a + "+" + b + "=" +(a+b)); //31
        System.out.println(a + "-" + b + "=" +(a-b)); //-11
        System.out.println(a + "*" + b + "=" +(a*b)); //210
        System.out.println(a + "/" + b + "=" +(a/b)); //0
        System.out.println(b + "/" + a + "=" +(b/a)); //2
        System.out.println(a + "%" + b + "=" +(a%b)); //10
        System.out.println(b + "%" + a + "=" +(b%a)); //1
        System.out.println((a%2)==0);

    }
}
