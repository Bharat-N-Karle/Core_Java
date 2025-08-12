package ArraylistQuestions;
/*
Write a Java program to shuffle elements in an array list.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
    void question10Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        arr.add("6");
        arr.add("7");
        arr.add("8");
        System.out.println("Before Shuffling: " + arr);
        Collections.shuffle(arr);
        System.out.println("After Shuffling: " + arr);
    }
    public static void main(String[] args) {
        Question10 q = new Question10();
        q.question10Output();
    }
}
