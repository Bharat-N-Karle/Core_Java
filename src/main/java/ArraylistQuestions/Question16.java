package ArraylistQuestions;
/*
Write a Java program to clone an array list to another array list.
*/
import java.util.ArrayList;

public class Question16 {
    void question16Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pink");
        arr.add("White");
        arr.add("Yellow");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Red");
        arr.add("Orange");
        System.out.println("Original Array: " + arr);
        ArrayList<String> arr2 = (ArrayList<String>)arr.clone();
        System.out.println("After clone: " + arr2);
    }
    public static void main(String[] args) {
        Question16 q = new Question16();
        q.question16Output();
    }
}
