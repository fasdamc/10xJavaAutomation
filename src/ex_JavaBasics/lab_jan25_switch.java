package ex_JavaBasics;

import java.util.Scanner;

public class lab_jan25_switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            default:
                System.out.println("Not sure what day it is");
        }

    }
}
