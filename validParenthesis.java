
/*
Valid Parenthesis 检验括号 
一个str,里面只有 '('和‘)’,让你数valid pairs一共有多少,如果不是valid就返回-1. (判断是不是valid的parenthesis string，不是的话返回-1，是的话返回valid pair个数，即String.length() / 2 )

*/
package com;

import java.util.Stack;

public class Test {

	public static int parentheses(String s){
		 Stack<Character> stk = new Stack<>();
		
		for(char c: s.toCharArray()){
			if(c == '('){
				stk.push(c);
				
			}else{
				if(stk.isEmpty()) return -1; // invalid
				else{
					stk.pop();
				}
			}
		}
		
		return stk.isEmpty() ? s.length()/2 : -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "((()))";
		String s2 = "()()()";
		String s3 = "((())";
		System.out.println( parentheses(s1) );
		System.out.println( parentheses(s2) );
		System.out.println( parentheses(s3) );
	}

}
