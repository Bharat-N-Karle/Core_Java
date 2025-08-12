package Comparable;
/*Create an Employee class with name and salary fields. Implement Comparable so that employees are sorted by salary in descending order.
Focus: Reverse ordering inside compareTo().*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    public String name;
    public long salary;
    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return name + " " + salary;
    }
    @Override
    public int compareTo(Employee o1) {
        return Long.compare(this.salary, o1.salary);
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jack", 10000));
        employees.add(new Employee("Jill", 30000));
        employees.add(new Employee("James", 20000));
        System.out.println("Before sorting" + employees);
        Collections.sort(employees);
        System.out.println("After sorting" + employees);
    }
}
