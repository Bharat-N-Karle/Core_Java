package HashmapQuestions;
/* Write a Java program to count the number of key-value (size) mappings in a map. */
import java.util.HashMap;
import java.util.Map;

public class Question2 {
    void question2Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Pink");
        map.put("2", "Red");
        map.put("3", "Blue");
        map.put("4", "Orange");
        map.put("5", "Green");
        map.put("6", "Yellow");
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            count++;

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Question2 q = new Question2();
        q.question2Output();
    }
}
