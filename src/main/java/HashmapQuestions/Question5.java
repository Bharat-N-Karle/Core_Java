package HashmapQuestions;

import java.util.HashMap;

/* Write a Java program to check whether a map contains key-value mappings (empty) or not. */
public class Question5 {
    void question5Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Pink");
        map.put("2", "Red");
        map.put("3", "Yellow");
        map.put("4", "Blue");
        map.put("5", "Green");
        map.put("6", "Orange");
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map Empty: " + isEmpty);
        map.clear();
        isEmpty = map.isEmpty();
        System.out.println("Is map Empty: " + isEmpty);
    }
    public static void main(String[] args) {
        Question5 q = new Question5();
        q.question5Output();
    }
}
