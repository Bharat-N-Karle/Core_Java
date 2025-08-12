package StringQuestions;
/*
Write a Java program to get the character (Unicode code point) before the specified index within the string.
*/
import java.util.Scanner;

public class Question3 {
    void question3Output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
        System.out.println("Please enter an index: ");
        int ind = sc.nextInt();
        int unicode= str.codePointBefore(ind);
        System.out.println("unicode code of character at index is : " + unicode);
    }
    public static void main(String[] args) {
        Question3 q = new Question3();
        q.question3Output();
    }
}
