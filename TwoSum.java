package leetcode;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
 */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twosum(int[] numbers, int target)
	{
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] ret=new int[2];
		for(int i=0;i<numbers.length;i++)
		{
			hm.put(numbers[i], i);
		}
		for(int i=0;i<numbers.length;i++)
		{
			int gap=target-numbers[i];
			if(hm.get(gap)!=null &&hm.get(gap)>i )
			{
				ret[0]=i+1;
				ret[1]=hm.get(gap)+1;
			}
		}
		return ret;

	}
	public static void main(String[] args)
	{
		int[] num1={2,7,11,13};
		int num[]=twosum(num1,20);
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);	
	}

}
