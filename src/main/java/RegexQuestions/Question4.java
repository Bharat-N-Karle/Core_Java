package RegexQuestions;
/*Write a Java program to find the sequence of one upper case letter followed by lower case letters.*/
public class Question4 {
    public static boolean validate(String str) {
        if(str.matches("[A-Z][a-z]+$")){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("Bharat"));
    }
}
