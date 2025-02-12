package ex_JavaBasics;

import java.util.Scanner;
public class lab_jan19_cli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Your name is: " + name + " Your age is: " + age + " Your salary is: " +salary);

    }
}
