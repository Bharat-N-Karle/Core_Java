package LinkedlistQuestions;

import java.util.Iterator;
import java.util.LinkedList;

/*
Write a Java program to iterate a linked list in reverse order.
*/
public class Question4 {
    int age;
    String name;
    Question4(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question4> list = new LinkedList<>();
        list.add(new Question4(23, "Bharat"));
        list.add(new Question4(24, "Rohan"));
        list.add(new Question4(25, "Rahul"));
        list.add(new Question4(26, "Shyam"));
        list.add(new Question4(27, "Rahul"));
        list.add(new Question4(28, "Shyam"));
        list.add(new Question4(29, "Rahul"));
        Iterator<Question4> Check = list.descendingIterator();
        System.out.println("linked list in reverse order: ");
        while (Check.hasNext()) {
            System.out.print(Check.next());
        }
    }
}
