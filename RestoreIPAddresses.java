package leetcode2;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
For example:
Given "25525511135",
return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class RestoreIPAddresses
{
	public static List<String> restoreIpAddresses(String s) 
	{
		if(s.length()<4||s.length()>12) return null;
		List<String> result=new ArrayList<String>();
		String temp="";
		restoreIpAddresses(s,temp,0,result);
		return result;
		
		
	}
	public static void restoreIpAddresses(String s, String temp, int count,List<String> result)
	{
		if(count==3&&isvalid(s)) 
		{
			temp=temp+s;
			result.add(temp);
			return;
		}
		if(count==3&&(!isvalid(s)))
			return;
	
		for(int i=1;i<4&&i<s.length();i++)
		{
			String sub1=s.substring(0,i);
			if(isvalid(sub1)) 
				{				
				restoreIpAddresses(s.substring(i),temp+sub1+".",count+1,result);				
				}
			
		}
		
		
	}
	public static boolean isvalid(String s)
	{
		if(s.charAt(0)=='0') 
			{
			if(s.equals("0"))
				return true;			
			else return false;
			}
		int a=Integer.parseInt(s);
		if(a>0&&a<=255) return true;
		else return false;
		
	}
	public static void main(String[] args)
	{
		String s="01234";
		List<String>a=restoreIpAddresses(s);
		System.out.println(a.toString());
	}
}
