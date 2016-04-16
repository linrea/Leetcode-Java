package leetcode2;
/*
 * Given inorder and postorder traversal of a tree, construct the binary tree.
Note:
You may assume that duplicates do not exist in the tree.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal
{
	public static TreeNode buildTree(int[] inorder, int[] postorder)
	{
		if(inorder==null||postorder==null||inorder.length==0||postorder.length==0) return null;
		return buildTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
				
	}
	public static TreeNode buildTree(int[] inorder, int[] postorder,int il,int ir,int pl, int pr)
	{
		if(pl>pr) return null;
		int i=il;
		for(;i<=ir;i++)
		{
			if(inorder[i]==postorder[pr])
				break;
		}
		TreeNode root=new TreeNode(postorder[pr]);
		int len=i-il;
		root.left=buildTree(inorder,postorder,il,i-1,pl,pl+len-1);
		root.right=buildTree(inorder,postorder,i+1,ir,pl+len,pr-1);
		
		
		return root;
		
		
				
	}
	public static void main(String[] args)
	{
		int[] postorder={2,1};
		int[] inorder={2,1};
		TreeNode result=buildTree(inorder,postorder);
	}
}
