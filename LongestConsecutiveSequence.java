package leetcode;
/*
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 */
import java.util.HashSet;
import java.util.Iterator;



public class LongestConsecutiveSequence {
	public static int solution(int[]nums)
	{
		int max=0;
		if(nums==null) return -1;
		else
		{
			HashSet<Integer> set=new HashSet<Integer>();
			for(int i=0;i<nums.length;i++)
			{
				set.add(nums[i]);
			}
			Iterator<Integer> itor=set.iterator();
			while(itor.hasNext())
			{
				int expl=(int)itor.next();
				int count=0,a=expl;
				//set.remove(expl);
				while(set.contains(a--))
					{
					count++;
					//set.remove(a);
					}
				a=expl;
				while(set.contains(++a))
					{
					count++;
					//set.remove(a);
					}
					
				if(count>max)
				{
					max=count;
				}
			}
			return max;
		} 
	}
	public static void main(String[] args)
	{
		int[] nums={200,100,1,2,3,4,5,6,101,102,103,104,105,106,107,108};
		int a=solution(nums);
		System.out.println(a);
	}

}
