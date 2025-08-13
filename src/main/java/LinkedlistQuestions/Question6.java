package LinkedlistQuestions;

import java.util.LinkedList;
import java.util.Scanner;

/*
Write a Java program to insert elements into the linked list at the first and last positions.
*/
public class Question6 {
    int age;
    String name;
    Question6(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question6> list = new LinkedList<>();
        list.add(new Question6(23, "Bharat"));
        list.add(new Question6(24, "Rohan"));
        list.add(new Question6(25, "Rahul"));
        list.add(new Question6(26, "Shyam"));
        list.add(new Question6(27, "Rahul"));
        list.add(new Question6(28, "Shyam"));
        list.add(new Question6(29, "Rahul"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for first position & 2 for last position inserting elements at into the list");
        System.out.print("Enter Your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("--Enter element for First Position--");
                System.out.print("Enter the age: ");
                int age = sc.nextInt();
                System.out.print("Enter the name: ");
                String name = sc.next();
                list.addFirst(new Question6(age, name));
                System.out.println("Element of Linked list after inserting at first position are: " + list);
                break;
            }
            case 2: {
                System.out.println("--Enter element for Last Position--");
                System.out.print("Enter the age: ");
                int age = sc.nextInt();
                System.out.print("Enter the name: ");
                String name = sc.next();
                list.addLast(new Question6(age, name));
                System.out.println("Element of Linked list after inserting at Last position are: " + list);
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
