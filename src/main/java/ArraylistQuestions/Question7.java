package ArraylistQuestions;
/*
Write a Java program to search for an element in an array list.
*/

import java.util.ArrayList;

public class Question7 {
    void question7Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Green");
        arr.add("Pink");
        arr.add("Red");
        arr.add("Blue");
        arr.add("Orange");
        arr.add("Green");
        arr.add("Pink");
        boolean isfound = false;
        String element = "Green";
        isfound = arr.contains(element);
        if(isfound){
            System.out.println("Found element");
        }
        else{
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        Question7 q = new Question7();
        q.question7Output();
    }
}
