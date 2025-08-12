package ArraylistQuestions;
/*
Write a Java program to update an array element by the given element.
*/
import java.util.ArrayList;

public class Question5 {
    void question5Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Green");
        arr.add("Blue");
        arr.add("Red");
        arr.add("Yellow");
        arr.add("Orange");
        arr.add("Green");
        System.out.println("Before: " + arr);
        arr.set(2,"Pink");
        System.out.println("After: " + arr);
    }
    public static void main(String[] args) {
        Question5 q = new Question5();
        q.question5Output();
    }
}
