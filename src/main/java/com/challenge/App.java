package com.challenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {

    /**
     * Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
     * <p>
     * Example:
     * Input: exp = “[()]{}{[()()]()}”
     * Output: Balanced
     * <p>
     * Input: exp = “[(])”
     * Output: Not Balanced
     */

    public static void main(String[] args) {
        System.out.println("Starting the validator, please provide an expression to be validate:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("The expression supplied is balanced");
        } else {
            System.out.println("The expression supplied is not Balanced");
        }

        System.out.println("the program has finished");
    }

    private static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        int sizeExpression = expression.length();

        for (int index = 0; index < sizeExpression; index++) {
            char token = expression.charAt(index);
            if (isOpeningToken(token)) {
                stack.push(token);
            }

            if (stack.isEmpty()) return false;
            char lastOpeningToken;
            switch (token) {
                case ')':
                    lastOpeningToken = stack.pop();
                    if (lastOpeningToken == '{' || lastOpeningToken == '[')
                        return false;
                    break;

                case '}':
                    lastOpeningToken = stack.pop();
                    if (lastOpeningToken == '(' || lastOpeningToken == '[')
                        return false;
                    break;

                case ']':
                    lastOpeningToken = stack.pop();
                    if (lastOpeningToken == '(' || lastOpeningToken == '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpeningToken(char token) {
        return token == '{' || token == '[' || token == '(';
    }

}
