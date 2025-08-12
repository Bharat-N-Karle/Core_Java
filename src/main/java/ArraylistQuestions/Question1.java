package ArraylistQuestions;
/* Write a Java program to create an array list, add some colors (strings) and print out the collection.*/
import java.util.ArrayList;

public class Question1 {
    void question1Output() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("White");
        arr.add("Black");
        arr.add("Red");
        arr.add("Blue");
        arr.add("Green");
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Question1 q = new Question1();
        q.question1Output();
    }
}
