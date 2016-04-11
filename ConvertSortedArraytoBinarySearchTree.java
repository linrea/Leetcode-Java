package leetcode;

public class ConvertSortedArraytoBinarySearchTree
{
	public static TreeNode sortedArrayToBST(int[] nums)
	{
		if(nums.length==0) return null;
		int left=0;
		int right=nums.length-1;
		return sortedArrayToBST(nums,left,right);
	}
	public static TreeNode sortedArrayToBST(int []nums,int left,int right)
	{
		if(left>right) return null;
				
		
		int mid=(right+left)/2;
		TreeNode node=new TreeNode(nums[mid]);		
		node.left=sortedArrayToBST(nums,left,mid-1);
		node.right=sortedArrayToBST(nums,mid+1,right);
		return node;
	
	}
	public static void main(String[] args)
	{
		int[] nums={1,2,3,4,5,6};
		TreeNode a=sortedArrayToBST(nums);
		System.out.println(a);
	}
	
}
