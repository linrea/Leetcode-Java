package leetcode;

/*
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
An example is the root-to-leaf path 1->2->3 which represents the number 123.
Find the total sum of all root-to-leaf numbers.
For example,
    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Return the sum = 12 + 13 = 25.
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class SumRoottoLeafNumbers
{
	public static int sumNumbers(TreeNode root)
	{
		if (root == null)
			return 0;
		return sumNumbers(root, 0);

	}

	public static int sumNumbers(TreeNode root, int sum)
	{

		sum = sum * 10 + root.val;
		if(root.left != null&&root.right != null)
			sum=sumNumbers(root.left, sum)+sumNumbers(root.right, sum);
		else if (root.left != null)
			sum = sumNumbers(root.left, sum);
		else if (root.right != null)
			sum =sumNumbers(root.right, sum);
		return sum;
	}

	

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		TreeNode newNodeB = new TreeNode(2);
		TreeNode newNodeC = new TreeNode(3);
		/*
		 * TreeNode newNodeD = new TreeNode(11); TreeNode newNodeE = new
		 * TreeNode(7); TreeNode newNodeF = new TreeNode(2); TreeNode newNodeG =
		 * new TreeNode(13); TreeNode newNodeH = new TreeNode(4); TreeNode
		 * newNodeI = new TreeNode(1);
		 */
		root.left = newNodeB;
		root.right = newNodeC;
		/*
		 * root.left.left = newNodeD; root.left.left.left = newNodeE;
		 * root.left.left.right = newNodeF; root.right.left = newNodeG;
		 * root.right.right = newNodeH; root.right.right.right = newNodeI;
		 */
		int a = sumNumbers(root);
		System.out.println(a);
	}
}
