package ArraylistQuestions;
/*
Write a Java program to insert an element into the array list at the first position.
*/

import java.util.ArrayList;

public class Question3 {
    void question3Output() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        arr.add(0,8);
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Question3 q = new Question3();
        q.question3Output();
    }
}
