package ArraylistQuestions;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
*/
import java.util.ArrayList;

public class Question4 {
    void question4Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Yellow");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        System.out.println(arr.get(1));
    }
    public static void main(String[] args) {
        Question4 q = new Question4();
        q.question4Output();
    }
}
