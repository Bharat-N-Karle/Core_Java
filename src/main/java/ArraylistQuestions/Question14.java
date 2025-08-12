package ArraylistQuestions;
/*
Write a Java program that swaps two elements in an array list.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
    void question14Output() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Pink");
        arr.add("Blue");
        arr.add("White");
        arr.add("Red");
        System.out.println("Original Array 2 : " + arr);
        Collections.swap(arr,1,3);
        System.out.println("Swapped Array : " + arr);
    }
    public static void main(String[] args) {
        Question14 q = new Question14();
        q.question14Output();
    }
}
