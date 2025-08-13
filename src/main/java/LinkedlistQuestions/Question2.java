package LinkedlistQuestions;

import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list.
*/
public class Question2 {
    int age;
    String name;
    Question2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question2> list = new LinkedList<>();
        list.add(new Question2(23,"Bharat"));
        list.add(new Question2(24,"Rohan"));
        list.add(new Question2(25,"Rahul"));
        list.add(new Question2(26,"Shyam"));
        list.add(new Question2(27,"Rahul"));
        list.add(new Question2(28,"Shyam"));
        list.add(new Question2(29,"Rahul"));
        System.out.println("List is given below: ");
        for (Question2 question : list) {
            System.out.print( question);
        }
    }
}
