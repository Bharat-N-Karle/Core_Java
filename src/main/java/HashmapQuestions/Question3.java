package HashmapQuestions;
/* Write a Java program to copy all mappings from the specified map to another map. */
import java.util.HashMap;

public class Question3 {
    void question3Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Pink");
        map.put("2", "Red");
        map.put("3", "Blue");
        map.put("4", "Orange");
        System.out.println(map);
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("5", "Yellow");
        map1.put("6", "White");
        System.out.println(map1);
        map1.putAll(map);
        System.out.println("After: " + map1);
    }
    public static void main(String[] args) {
        Question3 q = new Question3();
        q.question3Output();

    }
}
