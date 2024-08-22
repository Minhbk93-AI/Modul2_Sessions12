package exercises8;

import java.util.Stack;

public class CheckPrimeSequenceWithStack {
    public static void main(String[] args) {
        String input = "2356";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }
        }


        boolean isPrimeSequence = true;

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (!isPrime(num)) {
                isPrimeSequence = false;
                break;
            }
        }


        if (isPrimeSequence) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
