package HashmapQuestions;

import java.util.HashMap;

/* Write a Java program to get the value of a specified key in a map. */
public class Question10 {
    void question10Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "B");
        map.put("B", "C");
        map.put("C", "D");
        map.put("D", "E");
        map.put("E", "F");
        String str = map.get("B");
        System.out.println("Value by Given key: " + str);
    }
    public static void main(String[] args) {
        Question10 q = new Question10();
        q.question10Output();
    }
}
