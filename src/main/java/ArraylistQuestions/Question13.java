package ArraylistQuestions;
/*
Write a Java program to compare two array lists.
*/
import java.util.ArrayList;

public class Question13 {
    void question13Output() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Orange");
        arr.add("Pink");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Red");
        System.out.println("Original Array 1: " + arr);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Orange");
        arr2.add("Pink");
        arr2.add("Blue");
        arr2.add("White");
        arr2.add("Red");
        System.out.println("Original Array 2 : " + arr2);
        ArrayList<String> arr3 = new ArrayList<>();
        for(String element : arr){
            arr3.add(arr2.contains(element) ? "Yes" : "No");
        }
        System.out.println("Original Array 3 : " + arr3);
    }
    public static void main(String[] args) {
        Question13 q = new Question13();
        q.question13Output();

    }
}
