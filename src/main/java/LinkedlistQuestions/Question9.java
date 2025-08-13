package LinkedlistQuestions;

import java.util.LinkedList;

/*
Write a Java program to remove the first and last elements from a linked list.
*/
public class Question9 {
    int age;
    String name;
    Question9(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question9> list = new LinkedList<>();
        list.add(new Question9(23, "Bharat"));
        list.add(new Question9(24, "Rohan"));
        list.add(new Question9(25, "Rahul"));
        list.add(new Question9(26, "Shyam"));
        list.add(new Question9(27, "Rahul"));
        list.add(new Question9(28, "Shyam"));
        list.add(new Question9(29, "Rahul"));
        System.out.println("The Original list is: " + list);
        list.removeFirst();
        System.out.println("The list after removing first element is: " + list);
        list.removeLast();
        System.out.println("The list after removing last element is: " + list);
    }
}
