package Stream;

import java.util.ArrayList;
import java.util.List;

/*
Find maximum number
*/
public class Question5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(95);
        list.add(90);
        list.add(18);
        list.add(27);
        int max = list.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);

    }
}
