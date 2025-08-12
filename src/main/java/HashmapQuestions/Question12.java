package HashmapQuestions;

import java.util.HashMap;

/* Write a Java program to get a collection view of the values contained in this map. */
public class Question12 {
    void question12Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("E", "Red");
        map.put("B", "Pink");
        map.put("A", "Yellow");
        map.put("B", "Green");
        map.put("A", "Blue");
        System.out.println("Collection View of the values : " + map.values());
    }
    public static void main(String[] args) {
        Question12 q = new Question12();
        q.question12Output();
    }
}
