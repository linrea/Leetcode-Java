package leetcode;

import java.util.HashMap;

/*
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */

public class LongestSubstringWithoutRepeatingCharacters_hm
{
	public static int lengthOfLongestSubstring(String s)
	{
		if(s.length()==0||s==null) return 0;
		if(s.length()==1) return 1;
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] str=s.toCharArray();
		int max=1;
		for(int i=0;i<str.length;i++)
		{
			if(!(hm.containsKey(str[i])))
				{
				hm.put(str[i], i);
				max=Math.max(max, hm.size());
				}
			
			else
			{
				i=hm.get(str[i]);
				hm.clear();
			}
		}
		return max;
		
	}
	public static void main(String[] args)
	{
		String s="aabbcdf";
		int a=lengthOfLongestSubstring(s);
		System.out.println(a);
	}

}
