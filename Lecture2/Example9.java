package Module1.lesson2;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        int age;
        String name;
        String aboutMe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello.What is your name?");
        name = scanner.next();
        System.out.println("What is your age?");
        age = scanner.nextInt();
        System.out.println("Some words about you");
        aboutMe = scanner.nextLine();
        System.out.println("Hello " + name + ".Nice to see you. It seems that you have " + age + " years.");
        System.out.println(aboutMe);

    }
}
