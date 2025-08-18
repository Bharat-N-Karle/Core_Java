package RegexQuestions;
/*Write a Java program that matches a string that has a p followed by zero or more q's.*/
public class Question2 {
    public static boolean validate(String str) {
        if(str.matches("pq*?")) { // p followed by zero or more q's
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("pqqqqqqq"));
        System.out.println(validate("pqqqqqq8"));

    }
}
