package RegexQuestions;
/*Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).*/
public class Question1 {
    public static void main(String[] args) {
        System.out.println(validate("bnkarle1508"));
        System.out.println(validate("bnkarle_1508"));

    }
    public static boolean validate(String txt) {
        return txt.matches("^[a-zA-Z0-9]+$");
    }
}
