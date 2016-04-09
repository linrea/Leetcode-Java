package leetcode;
/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?
For example,
Given sorted array nums = [1,1,1,2,2,3],
Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesII {
	public static int removeduplicate(int[] nums)
	{
		int end=0, count=0;
		if(nums.length==1) return 1;
		else{
		for(int i=1;i<nums.length;i++)
		{
			if(nums[end]!=nums[i])
			{
				nums[end+1]=nums[i];
				end++;
				count=0;
			}
			else if (nums[end]==nums[i]&&count<1)
			{
				nums[end+1]=nums[i];
				end++;
				count++;
			}
			else count++;
		}
		}
		return end+1;
	}
	public static void main(String[] args)
	{
		int[] nums={1,2,2,2,2,3};
		int b=removeduplicate(nums);
		System.out.println(b);
	}

}
