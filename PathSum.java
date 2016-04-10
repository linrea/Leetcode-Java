package leetcode;
/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

/**
 * Definition for a binary tree node. 
 * public class TreeNode { int val; 
 * TreeNode left;
 * TreeNode right; 
 * TreeNode(int x) { val = x; } }
 */
public class PathSum
{
	public static boolean hasPathSum(TreeNode root, int sum)
	{
		return hasPathSum (root,0,sum);
	}
	public static boolean hasPathSum(TreeNode root, int sum, int target)
	{
		if(root==null) return false;
		sum+=root.val;
		while(root!=null)
		{
		if(root.left==null&root.right==null&sum==target)
		{
			return true;
		}
		else 
		{
			return hasPathSum (root.left,sum,target)||hasPathSum (root.right,sum,target);
		}
		
		}
		return false;
	}
	public static void main(String[] args)
	{
		TreeNode root=new TreeNode(5);
		TreeNode newNodeB = new TreeNode(4);  
	        TreeNode newNodeC = new TreeNode(8);  
	        TreeNode newNodeD = new TreeNode(11);  
	        TreeNode newNodeE = new TreeNode(7);  
	        TreeNode newNodeF = new TreeNode(2);  
	        TreeNode newNodeG = new TreeNode(13);
	        TreeNode newNodeH = new TreeNode(4);
	        TreeNode newNodeI = new TreeNode(1);
	        root.left=newNodeB;  
	        root.right=newNodeC;  
	        root.left.left=newNodeD;  
	        root.left.left.left=newNodeE;  
	        root.left.left.right=newNodeF;
	        root.right.left=newNodeG;
	        root.right.right=newNodeH;
	        root.right.right.right=newNodeI;
	        boolean a=hasPathSum(root,19);
	        System.out.println(a);
		
		
		
		
	}
				
		

}
