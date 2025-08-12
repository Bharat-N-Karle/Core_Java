package HashmapQuestions;

import java.util.HashMap;

/* Write a Java program to get a shallow copy of a HashMap instance.*/
public class Question6 {
    void question6Output() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        System.out.println("Original map: " + map);
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1=(HashMap) map.clone();
        System.out.println("Cloned Map: " + map1);
    }
    public static void main(String[] args) {
        Question6 q = new Question6();
        q.question6Output();
    }
}
