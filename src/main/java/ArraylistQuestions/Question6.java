package ArraylistQuestions;
/*
Write a Java program to remove the third element from an array list.
*/
import java.util.ArrayList;

public class Question6 {
    void question6Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Green");
        arr.add("Blue");
        arr.add("Pink");
        arr.add("Red");
        arr.add("Yellow");
        arr.add("Orange");
        arr.add("Green");
        System.out.println("Before: " + arr);
        arr.remove(3);
        System.out.println("After: " + arr);
    }
    public static void main(String[] args) {
       Question6 q = new Question6();
       q.question6Output();
    }
}
