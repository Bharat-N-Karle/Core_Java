package StringQuestions;
/*
Write a Java program to get the character (Unicode code point) at the given index within the string.
*/
import java.util.Scanner;

public class Question2 {
    void question2Output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
        System.out.println("Please enter an index: ");
        int ind = sc.nextInt();
        int unicode= str.codePointAt(ind);
        System.out.println("unicode code of character at index is : " + unicode);
    }
    public static void main(String[] args) {
        Question2 q = new Question2();
        q.question2Output();
    }
}
