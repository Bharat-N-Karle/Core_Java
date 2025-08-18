package RegexQuestions;
/*Write a Java program to check if a word contains the character 'g' in a given string.*/
public class Question6 {
    public static boolean validate(String str) {
        if(str.matches(".*g.*")){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(validate("Bharag"));
    }
}
