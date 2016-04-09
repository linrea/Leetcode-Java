package leetcode;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSumsolution(int[] nums)
	{
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(nums.length==0) return result;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			if (i>0&&nums[i-1]==nums[i]) continue;
			int left=i+1, right=nums.length-1, a=nums[i];
			int sum=-a;
			ArrayList<Integer> sub=new ArrayList<Integer>();
			while(left<right)
			{
				if((nums[left]+nums[right])==sum)
				{
					sub.add(nums[i]);
					sub.add(nums[left]);
					sub.add(nums[right]);
					result.add((ArrayList<Integer>)sub.clone());
					sub=new ArrayList<Integer>();
					while(nums[left+1]==nums[left]&&(left+1)<right) left++;
					while(nums[right-1]==nums[right]&&(right-1)>left) right--;
					left++;
					right--;	
				}
				else if((nums[left]+nums[right])<sum)
					left++;
				else
					right--;
			}
			
		}
		return result;
		
	}
	public static void main(String[] args)
	{
		int[] nums={0,0,0};
		List<List<Integer>> result=threeSumsolution(nums);
		System.out.println(result.toString());
	}

}
