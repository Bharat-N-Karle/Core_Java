package LinkedlistQuestions;

import java.util.LinkedList;

/*
Write a Java program to display elements and their positions in a linked list.
*/
public class Question7 {
    int age;
    String name;
    Question7(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "[" + name + "," + age + "]" + "-->";
    }
    public static void main(String[] args) {
        LinkedList<Question7> list = new LinkedList<>();
        list.add(new Question7(23, "Bharat"));
        list.add(new Question7(24, "Rohan"));
        list.add(new Question7(25, "Rahul"));
        list.add(new Question7(26, "Shyam"));
        list.add(new Question7(27, "Rahul"));
        list.add(new Question7(28, "Shyam"));
        list.add(new Question7(29, "Rahul"));
        for(int position = 0; position < list.size(); position++) {
            System.out.println("The position is: " + position + " & " + "Element at that position is: " + list.get(position).toString());
        }
    }
}
