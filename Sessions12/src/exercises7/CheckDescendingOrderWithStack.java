package exercises7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckDescendingOrderWithStack {
    public static void main(String[] args) {
        String str = "hgfedcba";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        boolean isDescending= true;
        char previous= stack.pop();
        while (!stack.isEmpty()){
            char current= stack.pop();
            if ((current>previous)){
                isDescending= false;
                break;
            }
            previous= current;
        }
        if (isDescending){
            System.out.println("Chuỗi là dãy giảm dần");
        }else {
            System.out.println("Chuỗi không phải là dãy giảm dần");
        }
    }
}
