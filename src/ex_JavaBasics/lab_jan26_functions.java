package ex_JavaBasics;

import java.util.Scanner;

public class lab_jan26_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Enter only integer");
            System.exit(0);
        }

        System.out.println("Enter the second number");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Enter only integer");
            System.exit(0);
        }

        int result = sum(a,b);
        System.out.println(result);
    }
    public static int sum(int a, int b) {
        return a+b;
    }
}
