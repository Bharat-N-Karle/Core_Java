package ArraylistQuestions;
/*
Write a Java program to empty an array list.
*/
import java.util.ArrayList;

public class Question17 {
    void question17Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        arr.add("g");
        System.out.println("Original Array: " + arr);
        arr.removeAll(arr);
        System.out.println("After removeAll: " + arr);
    }
    public static void main(String[] args) {
       Question17 q = new Question17();
       q.question17Output();

    }
}
