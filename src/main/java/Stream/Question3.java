package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Find Numbers Divisible by 5
*/
public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(32);
        list.add(45);
        list.add(50);
        list.add(60);
        list.add(70);
        List<Integer> list2 = list.stream()
                .filter(x->x%5==0)
                .collect(Collectors.toList());
        System.out.println(list2);

    }
}
