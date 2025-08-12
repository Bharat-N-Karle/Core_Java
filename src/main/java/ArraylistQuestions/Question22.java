package ArraylistQuestions;
/*
Write a Java program to print all the elements of an ArrayList using the elements' position.
*/
import java.util.ArrayList;

public class Question22 {
    void question22Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Orange");
        arr.add("Color");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Red");
        arr.add("Yellow");
        for(String str : arr) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Question22 q = new Question22();
        q.question22Output();
    }
}
