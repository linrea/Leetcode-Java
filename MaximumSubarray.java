package leetcode;
/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray
{
	public static int maxSubArray(int[] nums)
	{
		if(nums.length==0) return 0;
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		int max=dp[0];
		for(int i=1;i<nums.length;i++)
		{
			if(dp[i-1]<0)
			{
				dp[i]=nums[i];
			}
			else
			{
				dp[i]=dp[i-1]+nums[i];
			}
			if(dp[i]>max)
				max=dp[i];
		}
		return max;
	}
	public static void main(String[] ar)
	{
		int[] nums={1,2,-3,4,5,-1};
		int a=maxSubArray(nums);
		System.out.println(a);
	}

}
