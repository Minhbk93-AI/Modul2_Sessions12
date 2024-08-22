package exercises1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsWithStack {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhập số lượng từ: ");
        int wordCount= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < wordCount; i++) {
            System.out.println("Nhập từ thứ "+(i+1)+":");
            String word= scanner.nextLine();
            stack.push(word);

        }
        System.out.println("Các từ theo thứ tự đảo ngược");
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");

        }

    }
}
