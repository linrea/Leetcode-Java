package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
OJ's Binary Tree Serialization:
The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
Here's an example:
   1
  / \
 2   3
    /
   4
    \
     5
The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
Subscribe to see which companies asked this question
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
public class BinaryTreeLevelOrderTraversal
{
	public static List<List<Integer>> levelOrder(TreeNode root)
	{
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> one=new ArrayList<Integer>();
		if (root==null) return result;
		LinkedList<TreeNode> current=new LinkedList<TreeNode>();
		LinkedList<TreeNode> next=new LinkedList<TreeNode>();
		current.add(root);
		boolean flag=false;
		while(!current.isEmpty())
		{
			TreeNode newnode=current.remove();
			if(newnode.left!=null)
				next.add(newnode.left);
			if(newnode.right!=null)
				next.add(newnode.right);
			one.add(newnode.val);
			flag=false;
		
		while(current.isEmpty()&&!flag)
		{
			current=next;
			flag=true;
			next=new LinkedList<TreeNode>();
			result.add(one);
			one=new ArrayList<Integer>();
		}}
		return result;
		
		
	}
	 public static void main(String[] args)
		{
			TreeNode root = new TreeNode(-2147483648);
			TreeNode newNodeB = new TreeNode(5);
			TreeNode newNodeC = new TreeNode(2147483647);
		/*	TreeNode newNodeD = new TreeNode(6);
			TreeNode newNodeE = new TreeNode(20);
TreeNode newNodeF = new TreeNode(20);
			TreeNode newNodeG = new TreeNode(13);
			TreeNode newNodeH = new TreeNode(4);
			TreeNode newNodeI = new TreeNode(1);*/
			root.left = newNodeB;
			root.right = newNodeC;
		/*	root.right.left = newNodeD;
			root.right.right= newNodeE;*/
			/*root.left.left.right = newNodeF;
			root.right.left = newNodeG;
			root.right.right = newNodeH;
			root.right.right.right = newNodeI;*/
			List<List<Integer>> result = levelOrder(root);
			System.out.println(result.toString());

		}
}
