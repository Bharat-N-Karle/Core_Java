package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to count Unicode code points in the specified text range of a string.
*/
public class Question4 {
    void question4Output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
        int unicode= str.codePointCount(0, str.length());
        System.out.println("Codepoint count is : " + unicode);
    }
    public static void main(String[] args) {
        Question4 q = new Question4();
        q.question4Output();
    }
}
