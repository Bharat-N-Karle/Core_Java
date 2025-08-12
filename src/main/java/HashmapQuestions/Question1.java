package HashmapQuestions;
/* Write a Java program to associate the specified value with the specified key in a HashMap. */
import java.util.HashMap;
import java.util.Map;
public class Question1 {
    void question1Output(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Pink");
        map.put("2", "Red");
        map.put("3", "Blue");
        map.put("4", "Orange");
        map.put("5", "Green");
        map.put("6", "Yellow");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Question1 q = new Question1();
        q.question1Output();

    }
}
