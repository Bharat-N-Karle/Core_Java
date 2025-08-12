package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Write a class MyString that wraps a string and implements Comparable to sort by string length.
Focus: Comparing object fields other than primitive numbers.*/
class MyString implements Comparable<MyString> {
    private String str;

    public MyString(String str) {
        this.str = str;

    }
    @Override
    public int compareTo(MyString o1) {
        int lengthdiff =  Integer.compare(this.str.length(), o1.str.length());
        if(lengthdiff==0){
            return this.str.compareTo(o1.str);
        }
        return lengthdiff;
    }
    public String toString(){
        return str;
    }
    public static void main(String[] args) {
        ArrayList<MyString> list = new ArrayList<>();
        list.add(new MyString("Pinkaaaa"));
        list.add(new MyString("Blue"));
        list.add(new MyString("Yellow"));
        System.out.println("Before Sorting" + list);
        Collections.sort(list);
        System.out.println("After Sorting: " + list);
    }
}
