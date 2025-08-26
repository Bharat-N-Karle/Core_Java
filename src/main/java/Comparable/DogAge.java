package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Dog implements Comparable<Dog>{
    String name;
    int age;
    Dog(){

    }
    Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Dog o) {
        return  this.age - o.age;
    }
    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + '}';
    }
}

public class DogAge {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Dog3",20));
        dogs.add(new Dog("Dog4",21));
        dogs.add(new Dog("Dog5",22));
        dogs.add(new Dog("Dog6",23));
        dogs.add(new Dog("Dog1",18));
        dogs.add(new Dog("Dog2",19));
        System.out.println("Before Sorting: " + dogs);
        Collections.sort(dogs);
        System.out.println("After Sorting: " + dogs);
        Collections.sort(dogs, Collections.reverseOrder());
        System.out.println("After Reverse: " + dogs);
    }
}
