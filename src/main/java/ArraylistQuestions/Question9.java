package ArraylistQuestions;
/*
Write a Java program to copy one array list into another.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Question9 {
    void question9Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pink");
        arr.add("Green");
        arr.add("Red");
        arr.add("Blue");
        System.out.println(arr);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("4");
        System.out.println("Before: " + arr2);
        Collections.copy(arr2, arr);
        System.out.println("After: " + arr2);

    }
    public static void main(String[] args) {
        Question9 q = new Question9();
        q.question9Output();
    }
}
