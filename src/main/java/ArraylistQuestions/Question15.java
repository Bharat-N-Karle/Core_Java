package ArraylistQuestions;
/*
Write a Java program to join two array lists.
*/
import java.util.ArrayList;

public class Question15 {
    void question15Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Pink");
        arr.add("Blue");
        arr.add("White");
        arr.add("Red");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("4");
        arr2.addAll(arr);
        System.out.println("Joined Array : " + arr2);
    }
    public static void main(String[] args) {
        Question15 q = new Question15();
        q.question15Output();
    }
}
