package com.bridgeLabz.dataStructure;

public class SimpleBalancedParentheses {
	
	//  checks the parenthesis and does required actions(push/pop).

	 
	public static boolean isBalanced(String inputString) {
		Stack1<Character> stack = new Stack1<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			
			char checkChar = inputString.charAt(i);
			if (checkChar == '(')
				stack.push(inputString.charAt(i));
			else if (checkChar == ')')
				stack.pop();
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String inputData = "((5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3))";
		String result = (isBalanced(inputData)) ? "Balanced" : "Not Balanced";
		System.out.println("Input String : " + inputData);
		System.out.println("Status of inputString : " + result);

	}

}