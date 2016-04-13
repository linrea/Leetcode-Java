package leetcode;
/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
Subscribe to see which companies asked this question
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesfromSortedList
{
	public static ListNode deleteDuplicates(ListNode head)
	{
		if(head==null) return null;
		ListNode Lcurrent=head;
		ListNode Lnext=head.next;
		while(Lnext!=null)
		{
			if(Lnext.val==Lcurrent.val)
			{
				Lnext=Lnext.next;
				Lcurrent.next=Lnext;
			}
			else
			{
				Lcurrent=Lnext;
				Lnext=Lcurrent.next;
			}
			
		}
	
		return head;
	}
	public static void main(String[] args)
	{
		ListNode head =new ListNode(3);
		ListNode a1 =new ListNode(4);
		ListNode a2 =new ListNode(4);
		ListNode a3 =new ListNode(5);
		head.next=a1;
		a1.next=a2;
		a2.next=a3;
		head=deleteDuplicates(head);
		System.out.println(a1.next.val);
		
	}
}
