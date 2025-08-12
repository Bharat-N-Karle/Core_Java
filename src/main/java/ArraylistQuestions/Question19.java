package ArraylistQuestions;
/*
Write a Java program for trimming the capacity of an array list.
*/
import java.util.ArrayList;

public class Question19 {
    void question19Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Yellow");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        System.out.println("Original Size: " + arr);
        arr.trimToSize();
        System.out.println("After trim: " + arr);
    }
    public static void main(String[] args) {
        Question19 q = new Question19();
        q.question19Output();
    }
}
