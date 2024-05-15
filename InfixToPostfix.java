package com.assignment17;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	
	public static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String operators = "+-*/^"; 
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c); 
            } else if (c == '(') {
                stack.push(c); 
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()); 
                }
                stack.pop(); 
            } else {
                int currPrecedence = getPrecedence(c, operators);
                while (!stack.isEmpty() && getPrecedence(stack.peek(), operators) >= currPrecedence) {
                    postfix.append(stack.pop()); 
                }
                stack.push(c); 
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()); 
        }

        return postfix.toString();
    }

    private static int getPrecedence(char c, String operators) {
        return operators.indexOf(c); 
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your expression");
    	String infix=sc.nextLine();
        String postfix = toPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
	
	
}
