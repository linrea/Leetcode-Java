package leetcode;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */
public class ValidPalindrome
{
	public static boolean isPalindrome(String s)
	{
		if(s.isEmpty()) return true;
		s=s.trim();
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				sub+=(char)s.charAt(i);
		}*/
		for(int i=0;i<s.length()/2;i++)
		{ 
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;		
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s="race a car";
		boolean a=isPalindrome(s);
		System.out.println(a);
	
	}

}
