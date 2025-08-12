package ArraylistQuestions;
/*
Write a Java program to sort a given array list.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
    void question8Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pink");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Red");
        System.out.println("Before Sorting: " + arr);
        Collections.sort(arr);
        System.out.println("After Sorting: " + arr);
    }
    public static void main(String[] args) {
        Question8 q = new Question8();
        q.question8Output();
    }
}
