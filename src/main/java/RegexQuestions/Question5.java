package RegexQuestions;
/*Write a Java program that matches a string with a 'p' followed by anything ending in 'q'.*/
public class Question5 {
    public static boolean validate(String str) {
        if(str.matches("^p.*q$")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("phbwhdwjndwh___12q"));
    }
}
