package leetcode;
/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
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
import java.util.ArrayList;

public class ValidateBinarySearchTree2
{
	 public static boolean isValidBST(TreeNode root)
	 {
		 if(root==null) return true;
		 ArrayList<Integer> order=new ArrayList<Integer>();
		 inorder(root,order);
		 for(int i=0;i<order.size()-1;i++)
			 if(order.get(i)>=order.get(i+1))
				 return false;
		 return true;
		 
	 }
	 public static void inorder(TreeNode root, ArrayList<Integer> order)
	 {
		 if(root!=null)
		 {
			 inorder(root.left,order);
			 order.add(root.val);
			 inorder(root.right,order);
		 }
	 }
	 public static void main(String[] args)
		{
			TreeNode root = new TreeNode(-2147483648);
		//	TreeNode newNodeB = new TreeNode(5);
			TreeNode newNodeC = new TreeNode(2147483647);
		//	TreeNode newNodeD = new TreeNode(6);
			//TreeNode newNodeE = new TreeNode(20);
			/*TreeNode newNodeF = new TreeNode(20);
			TreeNode newNodeG = new TreeNode(13);
			TreeNode newNodeH = new TreeNode(4);
			TreeNode newNodeI = new TreeNode(1);*/
			//root.left = newNodeB;
			root.right = newNodeC;
			//root.right.left = newNodeD;
			//root.right.right= newNodeE;
			/*root.left.left.right = newNodeF;
			root.right.left = newNodeG;
			root.right.right = newNodeH;
			root.right.right.right = newNodeI;*/
			boolean a = isValidBST(root);
			System.out.println(a);

		}
}
