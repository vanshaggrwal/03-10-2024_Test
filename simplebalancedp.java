
import java.util.Scanner;
import java.util.Stack;

ppublic class simplebalancedp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        boolean isBalanced = areParenthesesBalanced(expression);
        
        if (isBalanced) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

}
