package HashmapQuestions;
/* Write a Java program to remove all mappings from a map. */
import java.util.HashMap;

public class Question4 {
    void question4Output() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "Bharat");
        map1.put("2", "Bharat");
        map1.put("3", "Bharat");
        System.out.println("Before: " +map1);
        map1.clear();
        System.out.println("After: " + map1);
    }
    public static void main(String[] args) {
        Question4 q = new Question4();
        q.question4Output();
    }
}
