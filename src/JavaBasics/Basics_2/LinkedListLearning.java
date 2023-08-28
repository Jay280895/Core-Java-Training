package JavaBasics.Basics_2;

import java.util.LinkedList;

public class LinkedListLearning {
    public static void main(String[] args) {

        LinkedList<Integer> items = new LinkedList<>();
        items.add(1);
        items.add(5);
        items.add(7);
        items.add(3);
        items.add(8);
        items.add(2);
        items.add(3);
        System.out.println("index of 7 is "+items.indexOf(7));
    }
}