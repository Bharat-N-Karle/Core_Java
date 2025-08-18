package RegexQuestions;
/*Write a Java program to remove leading zeros from a given IP address.*/
public class Question10 {
    public static String validate(String str) {
        return str.replaceAll("\\b0+(\\d)", "$1");
    }
    public static void main(String[] args) {
        System.out.println(validate("192.168.001.001"));
    }
}
