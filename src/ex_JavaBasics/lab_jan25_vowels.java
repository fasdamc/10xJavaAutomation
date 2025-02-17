package ex_JavaBasics;

public class lab_jan25_vowels {
    public static void main(String[] args) {
        String vc = "pramod";
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < vc.length(); i++){
            char ltr = vc.charAt(i);
            if (ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u'){
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println("vowels count is " + vCount);
        System.out.println("consonants count is " + cCount);
    }
}
