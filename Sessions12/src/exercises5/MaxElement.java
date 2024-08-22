package exercises5;

import java.util.Stack;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 14, 5, 9, 2, 15, 7};
        Stack<Integer> stack= new Stack<>();
        for (int number : arr){
            if (stack.isEmpty() || number > stack.peek()){
             stack.push(number);
            }else {
                stack.pop();
                stack.push(number);
            }
        }
        if (!stack.isEmpty()){
            System.out.println("Phần tử lớn nhất trong mảng là: "+stack.peek());
        }else {
            System.out.println("Mảng rỗng, không có phần tử để tìm kiếm");
        }
    }
}
