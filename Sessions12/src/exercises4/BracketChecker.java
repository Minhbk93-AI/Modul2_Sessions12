package exercises4;

import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        String expression = "s * (s – a) * (s – b) * (s – c)";
        if (isBracketCorrect(expression)){
            System.out.println("Biểu thức "+expression+" có sử dụng dấu ngoặc");
        }else {
            System.out.println("Biểu thức " +expression+ "không sử dụng dấu ngoặc");
        }


    }

    public static boolean isBracketCorrect(String expression) {
        Stack<Character> characterStack= new Stack<>();

        for (char c : expression.toCharArray()){
            if (c == '(' || c=='[' || c== '{'){
                characterStack.push(c);
            } else if (c==')' || c==']' || c=='}') {
                if (characterStack.isEmpty()){
                    return  false;
                }
                char left = characterStack.pop();
                if (!isMatchingPair(left,c)){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();

    }

    public static boolean isMatchingPair(char left, char right) {
        return (left=='(' && right==')') ||
                (left=='[' && right ==']') ||
                (left =='{' && right=='}');
    }

}
