package Stream;

import java.util.ArrayList;
import java.util.List;
/*
Find minimum number
*/
public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int min = list.stream()
                .min(Integer::compare)
                .get();
        System.out.println(min);
    }
}
