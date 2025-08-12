package ArraylistQuestions;
/*
Write a Java program to increase an array list size.
*/
import java.util.ArrayList;

public class Question20 {
    void question20Output() {
        ArrayList<String> arr = new ArrayList<>(9);
        arr.add("Yellow");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Orange");
        arr.add("Pink");
        arr.add("Yellow");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        System.out.println("Original Size: " + arr.size());
        arr.ensureCapacity(15);
        arr.add("Yellow");
        System.out.println("Original Size After: " + arr.size());
    }
    public static void main(String[] args) {
        Question20 q = new Question20();
        q.question20Output();
    }
}
