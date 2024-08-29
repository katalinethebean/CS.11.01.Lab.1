import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age > 0) {
            System.out.println("Your age is " + age);
            int dateable = age / 2 + 7;
            System.out.println("a " + age+"-year old should only date somebody who is at least "+dateable+" years old");
        } else {
            System.out.println("Please enter valid age");
        }
    }
}
