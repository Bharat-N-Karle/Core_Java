package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Square Each Number in a List
*/
public class Question2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Integer> list2 = list.stream()
                .map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
