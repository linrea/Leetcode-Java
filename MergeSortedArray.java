package leetcode;
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray
{
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		if(n==0) return;
		int j=0,a=m,i;
		for(i=0;i<n;i++)
		{
			while(j<a)
			{
				if(nums2[i]<=nums1[j])
				{
					for(int y=a;y>j;y--)
					{
						nums1[y]=nums1[y-1];
					}
					nums1[j]=nums2[i];
					j++;
					a++;
					break;
				}
				else
					j++;
			}
			if(j>=a) 
			{
				for(;i<n;i++)
				{
					nums1[j]=nums2[i];
					a++;
					j++;
				}
				break;
			}
			
		}
		
		
	}
	public static void main(String[] args)
	{
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		merge(nums1,3,nums2,3);

		
	}
}
