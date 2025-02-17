package ex_JavaBasics;

import java.util.Scanner;

public class lab_jan25_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = sc.next();

        int strlength = str.length();
        String reverseStr = "";

        for (int i = (strlength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
