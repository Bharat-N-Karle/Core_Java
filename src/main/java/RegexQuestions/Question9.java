package RegexQuestions;
/*Write a Java program where a string starts with a specific number.*/
public class Question9 {
    public static boolean validate(String str) {
        return str.matches("^6.*$");
    }
    public static void main(String[] args) {
        System.out.println(validate("Indian_bharat1524"));
        System.out.println(validate("6__-Indian_bharat1524"));
    }
}
