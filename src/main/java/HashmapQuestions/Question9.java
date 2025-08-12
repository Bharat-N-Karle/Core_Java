package HashmapQuestions;

import java.util.HashMap;
import java.util.Set;

/* Write a Java program to create a set view of the mappings contained in a map. */
public class Question9 {
    void question9Output() {
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("1", "Pink");
        map2.put("2", "Yellow");
        map2.put("3", "Green");
        map2.put("4", "Blue");
        System.out.println("Original Map: " + map2);
        Set set = map2.entrySet();
        System.out.println("Original Set: " + set);
    }
    public static void main(String[] args) {
        Question9 q = new Question9();
        q.question9Output();
    }
}
