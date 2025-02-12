package ex_JavaBasics;

public class lab_jan19_decrements {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + --a);
        //--a > expA > 19, a becomes 19
        //a++ > expB > 19, a becomes 20
        //--a> expC > 19, a becomes 19
        //expA + expB + expC = 57
        System.out.println(a);

    }
}
