package RegexQuestions;
/*Write a Java program to match a string containing only upper and lowercase letters, numbers, and underscores.*/
public class Question8 {
    public static boolean validate(String str) {
        if(str.matches("^[a-zA-Z0-9_].*$")){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("Indian_bharat1524"));

    }
}
