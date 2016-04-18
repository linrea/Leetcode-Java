package leetcode2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/*
 * Given a set of distinct integers, nums, return all possible subsets.
Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
public class Subsets
{
	public static List<List<Integer>> subsets(int[] nums)
	{
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// List<Integer> temp=new ArrayList<Integer>();
		// result.add(temp);
		for (int i = 0; i < nums.length; i++)
		{
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
			{
				for (List<Integer> a : result)
				{

					temp.add(new ArrayList<Integer>(a));//Cannot use temp.add(a); cuz the pointer question

				}
				for (List<Integer> b : temp)
				{
					b.add(nums[i]);
					Collections.sort(b);// Cuz elements in a subset must be in non-descending order.
				}

				ArrayList<Integer> one = new ArrayList<Integer>();
				one.add(nums[i]);
				temp.add(one);
				result.addAll(temp);

			}
			
		}
		ArrayList<Integer> nullset = new ArrayList<Integer>();
		result.add(nullset);
		return result;

	}

	public static void main(String[] args)
	{
		int[] nums = {1,2,3};
		List<List<Integer>> a = subsets(nums);
		System.out.println(a.toString());
	}
}
