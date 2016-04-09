package leetcode;

import java.util.HashMap;
import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	 public static boolean isValid(String s)
	 {
		 if(s.length()<2||s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'||s.length()%2==1) return false;
		 HashMap<Character,Character> hm= new HashMap<Character,Character>();
		 hm.put(')','(');
		 hm.put('}','{');
		 hm.put(']','[');
		 Stack<Character> stack=new Stack<Character>();
		 for(int i=0;i<s.length();i++)
		 {
			 char a=s.charAt(i);
			 if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
				 stack.push(s.charAt(i));
			 else
			 {
				 if(hm.get(s.charAt(i))!=stack.pop())
					 return false;
			 }		 
		 }
		 if(stack.empty()) 
			 return true;
		 else 
			 return false;
		 
	 }
	 public static void main(String[] args)
	 {
		 String s="]]]]";
		 boolean a=isValid(s);
		 System.out.println(a);
	 }

}
