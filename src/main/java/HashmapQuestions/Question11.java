package HashmapQuestions;
/* Write a Java program to get a set view of the keys contained in this map. */
import java.util.HashMap;
import java.util.Set;

public class Question11 {
    void question11Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Yellow");
        map.put("2", "Red");
        map.put("3", "Blue");
        map.put("4", "Green");
        map.put("5", "Red");
        map.put("6", "Blue");
        Set set = map.keySet();
        System.out.println("Original Key Set: " + set);
    }
    public static void main(String[] args) {
        Question11 q = new Question11();
        q.question11Output();
    }
}
