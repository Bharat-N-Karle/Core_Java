package ArraylistQuestions;
/*
Write a Java program to replace the second element of an ArrayList with the specified element.
*/
import java.util.ArrayList;

public class Question21 {
    void question21Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Orange");
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Pear");
        arr.add("Blueberry");
        System.out.println("Original Array : " + arr);
        arr.set(1, "Color");
        System.out.println("Original Array After : " + arr);
    }
    public static void main(String[] args) {
        Question21 q = new Question21();
        q.question21Output();
    }
}
