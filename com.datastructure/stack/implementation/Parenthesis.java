package stack.implementation;

import java.util.Stack;

public class Parenthesis {
    // Function to find duplicate parenthesis in an expression
    public static boolean duplicateparenthesis(String exp) {
        if (exp.length() <= 3)
            return false;

        // take an empty stack of characters
        Stack<Character> stack = new Stack();

        // traverse the input expression
        for (char c: exp.toCharArray()) {
            // if current char in the expression is a not a closing parenthesis
            if (c != ')') {
                stack.push(c);
            }
            // if current char in the expression is a closing parenthesis
            else {
                // if we top element in the stack is an opening parenthesis,
                // the sub-expression of the form ((exp)) is found
                if (stack.peek() == '(') {
                    return true;
                }

                // pop till '(' is found for current ')'
                while (stack.peek() != '(') {
                    stack.pop();
                }

                // pop '('
                stack.pop();
            }
        }

        // if we reach here, then the expression does not have any
        // duplicate parenthesis
        return false;
    }
    public static void main(String[] args) {
        String exp = "(x+y))";	 // assumes valid expression

        if (Parenthesis.duplicateparenthesis(exp)) {
            System.out.println("The expression have duplicate parenthesis.");
        } else {
            System.out.println("The expression does not have duplicate parenthesis");
        }
    }
}

