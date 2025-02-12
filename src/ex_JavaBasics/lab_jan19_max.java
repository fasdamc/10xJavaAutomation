package ex_JavaBasics;

public class lab_jan19_max {
    public static void main(String[] args) {
        //argument input 40 50
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        int max = (first > second) ? first : second;
        System.out.println("The maximum number is " + max);
    }
}
