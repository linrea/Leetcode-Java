package leetcode;

import java.util.LinkedList;

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
public class PathSum2
{
	public static boolean hasPathSum(TreeNode root, int sum)
	{
		if(root==null) return false;
		LinkedList<TreeNode> lnode=new LinkedList<TreeNode>();
		LinkedList<Integer> lsum=new LinkedList<Integer>();
		lnode.add(root);
		lsum.add(root.val);
		
		while(!lnode.isEmpty())
		{
			TreeNode node=lnode.poll();
			int nowsum=lsum.poll();
			if(node.left==null&node.right==null&nowsum==sum)
				return true;				
			if (node.right!=null)
			{
				lnode.add(node.right);
				lsum.add(node.right.val+nowsum);
			}
			if (node.left!=null)
			{
				lnode.add(node.left);
				lsum.add(node.left.val+nowsum);
			}
			
		}
		return false;
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(5);
		TreeNode newNodeB = new TreeNode(4);
		TreeNode newNodeC = new TreeNode(8);
		TreeNode newNodeD = new TreeNode(11);
		TreeNode newNodeE = new TreeNode(7);
		TreeNode newNodeF = new TreeNode(2);
		TreeNode newNodeG = new TreeNode(13);
		TreeNode newNodeH = new TreeNode(4);
		TreeNode newNodeI = new TreeNode(1);
		root.left = newNodeB;
		root.right = newNodeC;
		root.left.left = newNodeD;
		root.left.left.left = newNodeE;
		root.left.left.right = newNodeF;
		root.right.left = newNodeG;
		root.right.right = newNodeH;
		root.right.right.right = newNodeI;
		boolean a = hasPathSum(root,18);
		System.out.println(a);

	}


}
