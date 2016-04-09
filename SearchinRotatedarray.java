package leetcode;
/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array.
 */
public class SearchinRotatedarray {
	public static int search(int[] nums, int target)
	{
		int first=0, last=nums.length-1, mid=0; 
		while(first<=last)
		{
			mid=(first+last)/2;
			if(nums[mid]==target) return mid;
			else if(nums[mid]<nums[first])
			{
				if(target>nums[mid]&&target<=nums[last])
					first=mid+1;
				else 
					last=mid-1;
			}
			else 
			{
				if(target>=nums[first]&&target<nums[mid])
					last=mid-1;
				else
					first=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] nums={4,5,6,7,0,1,2};
		int target=4;
		int sea=search(nums,target);
		System.out.println(sea);

		}
	}


