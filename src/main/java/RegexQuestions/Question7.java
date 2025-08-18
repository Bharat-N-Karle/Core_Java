package RegexQuestions;
/*Write a Java program that matches a word containing 'g', not at the start or end of the word.*/
public class Question7 {
    public static boolean validate(String str) {
        if(str.matches("^.+g.+$")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validate("indiangag"));
    }
}
