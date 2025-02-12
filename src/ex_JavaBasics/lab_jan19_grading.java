package ex_JavaBasics;

public class lab_jan19_grading {
    public static void main(String[] args) {
        String score_string = args[0];
        int score = Integer.parseInt(score_string);
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B": (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println(grade);
    }
}