package leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * Given an array of strings, group anagrams together.
For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:
[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:
For the return value, each inner list's elements must follow the lexicographic order.
All inputs will be in lower-case.
 */
public class GroupAnagrams
{
	public static List<List<String>> groupAnagrams(String[] strs) 
	{
		//if(strs==null) return null;
		List<List<String>> result=new ArrayList<List<String>>();
		HashMap<String,ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
		for(int i=0;i<strs.length;i++)
		{
			char[] chars=strs[i].trim().toCharArray();
			Arrays.sort(chars);
			String str=new String(chars);
			if(!hm.containsKey(str))
			{
				ArrayList<String> reslist=new ArrayList<String>();
				hm.put(str, reslist);
				hm.get(str).add(strs[i]);
			}
			else
			{
				hm.get(str).add(strs[i]);				
			}
			
		}
		for(String s: hm.keySet())
		{
			Collections.sort(hm.get(s));// Cuz each inner list's elements must follow the lexicographic order.
			if(hm.get(s).size()>=1)
			{
				result.add(hm.get(s));
			}
			
		}
		
			return result;
	}
	public static void main(String[] args)
	{
		String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> a=groupAnagrams(strs);
		System.out.println(a.toString());
	}
}
