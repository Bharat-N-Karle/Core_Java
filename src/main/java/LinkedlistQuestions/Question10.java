package LinkedlistQuestions;

import java.util.LinkedList;

/*
Write a Java program to remove all elements from a linked list.
*/
public class Question10 {
    int age;
    String name;
    Question10(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question10> list = new LinkedList<>();
        list.add(new Question10(23, "Bharat"));
        list.add(new Question10(24, "Rohan"));
        list.add(new Question10(25, "Rahul"));
        list.add(new Question10(26, "Shyam"));
        list.add(new Question10(27, "Rahul"));
        list.add(new Question10(28, "Shyam"));
        list.add(new Question10(29, "Rahul"));
        System.out.println("Original list is: " + list);
        list.clear();
        System.out.println("After removing list is: " + list);
    }
}
