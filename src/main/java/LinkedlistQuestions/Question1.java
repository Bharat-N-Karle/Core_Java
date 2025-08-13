package LinkedlistQuestions;

import java.util.LinkedList;

/*
Write a Java program to append the specified element to the end of a linked list.
*/
public class Question1 {
    int age;
    String name;
    Question1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "[ " + name + "," + age + "]" + "-->";
    }

    public static void main(String[] args) {
        LinkedList<Question1> list = new LinkedList<>();
        list.add(new Question1(23,"Bharat"));
        list.add(new Question1(24,"Shyam"));
        list.add(new Question1(25,"Rahul"));
        list.add(new Question1(26,"Shyam"));
        list.add(new Question1(27,"Rahul"));
        list.add(new Question1(25,"Rahul"));
        System.out.println("Element of Linked list are: " + list);
    }
}
