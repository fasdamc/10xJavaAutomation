package ex_JavaBasics;

public class lab_print {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Variable name is %d" ,a);
        // %d will be replaced with the variable value of a - %d is usd for int, byte, long, short data types
        // %s is used for string data type
        // %f is for float data type
        // %b is for boolean data type
        boolean x = true;
        System.out.printf("another variable replaced identifier %b", x);
    }
}
