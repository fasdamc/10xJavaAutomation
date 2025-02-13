package ex_JavaBasics;

import java.util.Scanner;

public class lab_jan25_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input: Side lengths must be positive.");
        } else {
            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("The triangle is equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles");
            } else {
                System.out.println("The triangle is scalene.");
            }
        }

        sc.close();

    }
}
