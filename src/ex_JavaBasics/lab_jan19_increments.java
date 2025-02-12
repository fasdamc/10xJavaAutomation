package ex_JavaBasics;

public class lab_jan19_increments {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //++a > expA > 11, a becomes 11
        //a++ > expB > 11, a becomes 12
        //a++ > expC > 12, a becomes 13
        //expA + expB + expC = 34
        System.out.println(a);
    }
}
