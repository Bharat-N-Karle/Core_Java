package ArraylistQuestions;
/*
Write a Java program to test whether an array list is empty or not.
*/
import java.util.ArrayList;

public class Question18 {
    void question18Output() {
        ArrayList<String> arr = new ArrayList<>();
        boolean isEmpty = true;
        isEmpty = arr.isEmpty();
        if (isEmpty) {
            System.out.println("ArrayList is Empty");
        }
        else{
            System.out.println("ArrayList is not empty");
        }
    }
    public static void main(String[] args) {
        Question18 q = new Question18();
        q.question18Output();
    }
}
