package com.greatlearning.Lab3;

import java.util.Stack;

public class BalancingBrackets {

	 static boolean checkingBracketsBalanced(String bracketExpression) {
		  
		  Stack<Character> stack = new Stack<Character>();
		  
		  for (int i=0; i < bracketExpression.length(); i++) {
			  char character = bracketExpression.charAt(i);
			  if(character == '(' || character == '[' || character == '{') {
				  stack.push(character);
				  continue;
			  }
			  if (stack.isEmpty())
				  return false;
			  char c;
			  switch(character) {
			  
			   case '}' :
				  c = stack.pop();
				  if (c== '(' || c == '[')
					  return false;
			    break;
			   
			   case ')' :
				   c = stack.pop();
					  if (c== '{' || c == '[')
						  return false;
				    break;
				    
			   case ']' :
				   c = stack.pop();
					  if (c== '(' || c == '{')
						  return false;
				    break;   
			  }
				  
		  }
		  return (stack.isEmpty());
	  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bracketExpression = "([[{}]])";
		Boolean result;
		result = checkingBracketsBalanced(bracketExpression);
		
		if (result)
			System.out.println("The enterred string has Balanced Brackets");
		else
			System.out.println("The enterred string do not contain Balanced Brackets");
	}

}
