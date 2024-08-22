package demoQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> list= new PriorityQueue<>();

        list.add(5);
        list.add(10);
        list.add(8);
        list.add(15);
        list.add(8);
        list.add(6);

        while (!list.isEmpty()){
            System.out.println(list.poll());

        }
        System.out.println(list.peek());
    }
}
