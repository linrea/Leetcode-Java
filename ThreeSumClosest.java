package leetcode;


import java.util.Arrays;


public class ThreeSumClosest {
	public static int threeSumsolution(int[] nums, int target)
	{

		Arrays.sort(nums);
		int gap=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			if (i>0&&nums[i-1]==nums[i]) continue;
			int left=i+1, right=nums.length-1, a=nums[i];
			int need=target-a;
			while(left<right)
			{
				if(nums[right]+nums[left]==need) return target;
				else if(nums[right]+nums[left]>need)
				{
					if(Math.abs(nums[left]+nums[right]-need)<Math.abs(gap))
						{
						gap=nums[left]+nums[right]-need;
//						while(nums[left+1]==nums[left]&&(left+1)<right) left++;
//						while(nums[right-1]==nums[right]&&(right-1)>left) right--;
//						left++;
						right--;	
						}
					else
						right--;
				}
				else
				{
					if(nums[right]+nums[left]<need)
					{
						if(Math.abs(nums[left]+nums[right]-need)<Math.abs(gap))
							{
							gap=nums[left]+nums[right]-need;
//							while(nums[left+1]==nums[left]&&(left+1)<right) left++;
//							while(nums[right-1]==nums[right]&&(right-1)>left) right--;
							left++;
//							right--;	
							}
						else
							left++;
					}
				}
			}
		
		}
		return (target+gap);

	}
	public static void main( String[] args)
	{
		int[] nums={0,2,1,-3};
		int target=1;
		int closest=threeSumsolution(nums,target);
		System.out.println(closest);
	}

}
