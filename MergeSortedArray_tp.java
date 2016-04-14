package leetcode;
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

 */
public class MergeSortedArray_tp
{
	 public static void merge(int[] nums1, int m, int[] nums2, int n) 
	 {
	 int i=m-1;
	 int j=n-1;
	 int p=m+n-1;
	 while(p>=0)
	 {
		 if(i<0||(j>=0&&nums2[j]>=nums1[i]))
		 {
			 nums1[p]=nums2[j];
			 p--;
			 j--;
		 }
		 else 
		 {
			 nums1[p]=nums1[i];
			 p--;
			 i--;
		 }
	 }
	 
	 }
	 public static void main(String[] args)
		{
			int[] nums1={1,2,3,0,0,0};
			int[] nums2={2,5,6};
			merge(nums1,3,nums2,3);
			for(int i=0;i<nums1.length;i++)
				System.out.println(nums1[i]);
}
}
