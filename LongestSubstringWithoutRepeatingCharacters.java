package leetcode;
/*
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters
{
	public static int lengthOfLongestSubstring(String s)
	{
		if(s==null||s.length()==0) return 0;
		if(s.length()==1) return 1;
		int count=1,max=1;
		String result="";
		boolean flag=false;
		result+=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			flag=false;			
			for(int j=0;j<result.length();j++)
			{
				if(s.charAt(i)==result.charAt(j))
				{
					flag=true;
					if(j==result.length()-1)
					{
						result=""+s.charAt(i);	
						break;
					}
					else	
					{
						result=result.substring(j+1)+s.charAt(i);
						count=result.length();
						break;
					}					
				}		
			}	
			if(flag==false)
			{
				result+=s.charAt(i);
				count=result.length();
			}
			if(count>max)
				max=count;
		}
		return max;
	}
	public static void main(String[] args)
	{
		String s="dvdf";
		int a=lengthOfLongestSubstring(s);
		System.out.println(a);
	}

}
