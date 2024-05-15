package com.assignment17;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your parantheses");
		String str=sc.nextLine();
		ValidParentheses vp=new ValidParentheses();
		System.out.println(vp.isValid(str));
	}
	public boolean isValid(String s) {
	      Stack<Character>stack=new Stack<>();
	      for(char c:s.toCharArray()){
	        if(c=='('||c=='{'||c=='['){
	            stack.push(c);
	        }
	        else{
	            if(stack.isEmpty()||!isValidPair(stack.peek(),c)){
	                return false;
	            }
	            stack.pop();
	        }
	      }
	      return stack.isEmpty();
	    }
	    private boolean isValidPair(char open,char close){
	    return(open=='('&& close==')')||(open=='{'&& close=='}') || (open=='['&& close==']') ;   
	    }
}
