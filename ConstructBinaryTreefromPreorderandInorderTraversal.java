package leetcode2;
/*
 * Given preorder and inorder traversal of a tree, construct the binary tree.
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
public class ConstructBinaryTreefromPreorderandInorderTraversal
{
	public static TreeNode buildTree(int[] preorder, int[] inorder)
	{
		
		if(preorder==null||preorder.length==0||inorder==null||inorder.length==0) return null;
		
		return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
		
	}
	public static TreeNode buildTree(int[] preorder, int[] inorder,int pl, int pr,int il,int ir)
	{
		if(pl>pr) return null;
		int i=il;
		for(;i<=ir;i++)
			if(inorder[i]==preorder[pl]) 
			{
				break;
			}
		int len=i-il;
		TreeNode root=new TreeNode(inorder[i]);
		
		root.left=buildTree(preorder,inorder,pl+1,pl+len,il,i-1);//cannot use pl++ here
		root.right=buildTree(preorder,inorder,pl+len+1,pr,i+1,ir);
		return root;		
	}
	public static void main(String[] args)
	{
		int[] preorder={1,2,3};
		int[] inorder={2,1,3};
		TreeNode result=buildTree(preorder,inorder);
		
		
		
	}
	
}
