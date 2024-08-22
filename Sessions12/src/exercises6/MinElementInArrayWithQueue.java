package exercises6;

import java.util.LinkedList;
import java.util.Queue;

public class MinElementInArrayWithQueue {
    public static void main(String[] args) {

            int[] arr = {3, 14, 5, 9, 2, 15, 7};
        Queue<Integer> queue= new LinkedList<>();
            for(int num:arr) {
                queue.add(num);
            }
            int min= queue.poll();

        while (!queue.isEmpty()){
            int current = queue.poll();
            if (current<min){
                min=current;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: "+min);
    }
}
