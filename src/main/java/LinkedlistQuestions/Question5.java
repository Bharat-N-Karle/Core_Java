package LinkedlistQuestions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
Write a Java program to insert the specified element at the specified position in the linked list.
*/
public class Question5 {
    int age;
    String name;
    Question5(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question5> list = new LinkedList<>();
        list.add(new Question5(23, "Bharat"));
        list.add(new Question5(24, "Rohan"));
        list.add(new Question5(25, "Rahul"));
        list.add(new Question5(26, "Shyam"));
        list.add(new Question5(27, "Rahul"));
        list.add(new Question5(28, "Shyam"));
        list.add(new Question5(29, "Rahul"));
        System.out.println("Enter the element yo want to insert into the list: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.print("Enter the position to insert into the list: ");
        int position = sc.nextInt();
        Question5 question5 = new Question5(age, name);
        list.add(position,question5);
        System.out.println("List Elements after inserting Into the list: " + list);
    }
}
