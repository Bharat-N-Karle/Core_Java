package ArraylistQuestions;
/*
Write a Java program to extract a portion of an array list.
*/
import java.util.ArrayList;
import java.util.List;

public class Question12 {
    void question12Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("White");
        arr.add("Black");
        arr.add("Red");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Orange");
        arr.add("Pink");
        List<String> arr2 = arr.subList(2,5);
        System.out.println("Original Array : " + arr);
        System.out.println("Substring of Original Array: " + arr2);
    }
    public static void main(String[] args) {
        Question12 q = new Question12();
        q.question12Output();
    }
}
