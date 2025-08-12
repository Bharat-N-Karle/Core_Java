package ArraylistQuestions;
/*Write a Java program to iterate through all elements in an array list.*/
import java.util.ArrayList;

public class Question2 {
    void question2Output() {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Blue");
        arr.add("Green");
        arr.add("Red");
        arr.add("Yellow");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static void main(String[] args) {
       Question2 q = new Question2();
       q.question2Output();
    }
}
