package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to get the character at the given index within the string.
*/
public class Question1 {
    void question1Output() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
/*        if you want to get a char at ith index then*/
        System.out.println("Please enter an index: ");
        int ind = sc.nextInt();
        System.out.println("The character at the given index " + ind + " is " + str.charAt(ind) );
    }
    public static void main(String[] args) {
        Question1 q = new Question1();
        q.question1Output();
    }
}
