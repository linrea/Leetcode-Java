package leetcode2;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
For example,
If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
public class Combinations
{
	public static List<List<Integer>> combine(int n, int k) 
	{
		if(n<k) return null;
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> item=new ArrayList<Integer>();
		combine(n,k,1,item,result);
		return result;
		
	}
	public static void combine(int n,int k, int start,List<Integer> item,List<List<Integer>> result)
	{
		if(item.size()==k)
		{			
			List<Integer> a=new ArrayList<Integer>(item);
			result.add(a);
			return;
		}
		for(int i=start;i<=n;i++)
		{
			item.add(i);
			combine(n,k,i+1,item,result);
			item.remove(item.size()-1);
		}
		return;
	}
	
	public static void main(String[] args)
	{
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		result=combine(4,3);
		System.out.println(result.toString());
	}
}
