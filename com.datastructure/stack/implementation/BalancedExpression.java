package stack.implementation;
import java.util.Stack;

public class BalancedExpression {

        // Function to check if given expression is balanced or not
        public static boolean balParenthesis(String exp) {
            // take an empty stack of characters
            Stack<Character> stack = new Stack();

            // traverse the input expression
            for (int i = 0; i < exp.length(); i++) {
                // if current char in the expression is an opening brace,
                // push it to the stack
                if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
                    stack.push(exp.charAt(i));
                }

                // if current char in the expression is a closing brace
                if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                    // return false if mismatch is found (i.e. if stack is
                    // empty, the number of opening braces is less than number
                    // of closing brace, so expression cannot be balanced)
                    if (stack.empty()) {
                        return false;
                    }

                    // pop character from the stack
                    Character top = stack.pop();

                    // if the popped character if not an opening brace or does
                    // not pair with current character of the expression
                    if ((top == '(' && exp.charAt(i) != ')') || (top == '{' && exp.charAt(i) != '}') || (top == '[' && exp.charAt(i) != ']')) {

                        return false;
                    }
                }
            }

            // expression is balanced only if stack is empty at this point
            return stack.empty();
        }

        public static void main(String[] args) {
            String exp = "{()}[{}]";

            if (balParenthesis(exp)) {
                System.out.println("The expression is balanced");
            } else {
                System.out.println("The expression is not balanced");
            }
        }
}
