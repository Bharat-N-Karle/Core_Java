package ArraylistQuestions;
/*
Write a Java program to reverse elements in an array list.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {
    static void Reverse(ArrayList<Integer> arr){
        Collections.reverse(arr);
        System.out.println("Reversed Array : " + arr);
    }
    void question11Output(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("Original Array : " + arr);
        Reverse(arr);
    }
    public static void main(String[] args) {
        Question11 q = new Question11();
        q.question11Output();

    }
}
