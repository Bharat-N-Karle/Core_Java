package HashmapQuestions;
/* Write a Java program to test if a map contains a mapping for the specified key. */
import java.util.HashMap;

public class Question7 {
    void question7Output() {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("1", "Pink");
        map1.put("2", "Yellow");
        map1.put("3", "Green");
        map1.put("4", "Blue");
        System.out.println("Original Map: " + map1);
        if(map1.containsKey("1")){
            System.out.println("Contains: " + map1.get("1"));
        }
        else {
            System.out.println("Does not contains 1");
        }
    }
    public static void main(String[] args) {
        Question7 q = new Question7();
        q.question7Output();

    }
}
