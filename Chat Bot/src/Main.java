import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Thunder", 2024);
        remind();
        age();
        count();
        test();
        end();
    }
    public static void greet(String botName, int birthYear) {
        System.out.println("Hello! My name is " + botName + ".\nI was created in" + birthYear + ".\nPlease, remind me your name.");
    }
    public static void remind() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public static void age() {
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + ";that 's a good time to start programming!");
    }
    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of a program.\n4. To interrupt the execution of a program.");

        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 2) {
                System.out.println("Please, try again.");
            }
        } while (answer != 2);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}