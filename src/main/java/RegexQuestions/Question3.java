package RegexQuestions;
/*Write a Java program to find sequences of lowercase letters joined by an underscore.*/
public class Question3 {
    public static boolean validate(String str) {
        if(str.matches("^[a-z]+_[a-z]+$")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("bnkarl_bharat"));
        System.out.println(validate("bnkarlebharat"));
    }
}
