import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age>0) {
            System.out.println("Your age is " + age);
            int pages = 100 - age;
            System.out.print(age+"-year olds should read at least "+pages+" pages before giving up a book");
        }
        else {
            System.out.println("Please enter valid age");
        }
    }
}
