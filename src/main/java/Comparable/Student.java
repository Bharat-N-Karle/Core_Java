package Comparable;
/*
Write a program to sort a list of Student objects by their roll number in ascending order using Comparable.
        Focus: Implementing compareTo() for primitive values.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    Student(String Name, int Roll) {
        this.name = Name;
        this.age = Roll;
    }
    public String toString(){
        return "Student Name: " + name + " Age: " + age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 20));
        students.add(new Student("Jack", 21));
        students.add(new Student("Jack", 18));
        System.out.println("Before sorting" + students);
        Collections.sort(students);
        System.out.println("After sorting" + students);
    }
}
