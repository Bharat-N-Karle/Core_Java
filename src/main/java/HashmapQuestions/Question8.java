package HashmapQuestions;
/* Write a Java program to test if a map contains a mapping for the specified value. */
import java.util.HashMap;

public class Question8 {
    void question8Output() {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("1", "Pink");
        map1.put("2", "Yellow");
        map1.put("3", "Green");
        map1.put("4", "Blue");
        System.out.println("Original Map: " + map1);
        if(map1.containsValue("Yellow")){
            System.out.println("Contains Value" );
        }
        else {
            System.out.println("Does not contains 1");
        }
    }
    public static void main(String[] args) {
        Question8 q = new Question8();
        q.question8Output();
    }
}
