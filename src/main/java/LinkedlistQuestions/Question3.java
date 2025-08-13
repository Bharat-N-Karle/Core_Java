package LinkedlistQuestions;

import java.util.Iterator;
import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list starting at the specified position.
*/
public class Question3 {
    int age;
    String name;
    Question3(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question3> list = new LinkedList<>();
        list.add(new Question3(23,"Bharat"));
        list.add(new Question3(24,"Rohan"));
        list.add(new Question3(25,"Rahul"));
        list.add(new Question3(26,"Shyam"));
        list.add(new Question3(27,"Rahul"));
        list.add(new Question3(28,"Shyam"));
        list.add(new Question3(29,"Rahul"));
        Iterator<Question3> Check = list.listIterator(3);
        System.out.println("linked list starting at the index: ");
        while (Check.hasNext()) {
            System.out.print(Check.next());
        }
    }
}
