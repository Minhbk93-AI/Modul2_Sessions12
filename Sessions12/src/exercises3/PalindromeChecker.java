package exercises3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input ="Able was I ere I saw Elba";
        if (isPalindrome(input)) {
            System.out.println("Chuỗi '" + input + "' là chuỗi Palindrome.");
        } else {
            System.out.println("Chuỗi '" + input + "' không phải là chuỗi Palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        // Xóa khoảng trắng và chuyển chuỗi về chữ thường để so sánh không phân biệt chữ hoa chữ thường
        String normalizedStr = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // B1: Duyệt qua từng ký tự và thêm vào stack và queue
        for (char ch : normalizedStr.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // B2: So sánh từng ký tự của stack và queue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }
}
