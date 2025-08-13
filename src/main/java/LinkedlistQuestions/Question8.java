package LinkedlistQuestions;
/*
Write a Java program to remove a specified element from a linked list.
*/

import java.util.LinkedList;

public class Question8 {
    int age;
    String name;
    Question8(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question8> list = new LinkedList<>();
        list.add(new Question8(23, "Bharat"));
        list.add(new Question8(24, "Rohan"));
        list.add(new Question8(25, "Rahul"));
        list.add(new Question8(26, "Shyam"));
        list.add(new Question8(27, "Rahul"));
        list.add(new Question8(28, "Shyam"));
        list.add(new Question8(29, "Rahul"));
        System.out.println("The before removing element from list is: " + list);
        list.remove(4);
        System.out.println("The after removing element from list is: " + list);

    }
}
