package ex_JavaBasics;

public class lab_jan19_ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        int c = 60;

        int largest = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("The largest number is " + largest);
    }
}
