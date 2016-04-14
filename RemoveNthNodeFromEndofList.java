package leetcode2;
/*
 * Given a linked list, remove the nth node from the end of list and return its head.
For example,
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndofList
{
	public static ListNode removeNthFromEnd(ListNode head, int n)
	{
		if(head==null) return null;
		if(head.next==null&&n==1) return null;
		ListNode p=head, q=head;

		for(int i=0;i<n;i++)
		{
			p=p.next;
		}
		if(p==null) return head.next;//in case when n=list.size, have to delete the head node 
		while(p.next!=null)
		{
			p=p.next;
			q=q.next;
		}
		q.next=q.next.next;
		return head;
	}
	public  static void main(String[] args)
	{
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		ListNode e=new ListNode(5);
		ListNode f=new ListNode(6);
		ListNode g=new ListNode(7);
		ListNode h=new ListNode(8);
		ListNode i=new ListNode(9);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		g.next=h;
		h.next=i;
		ListNode p= removeNthFromEnd(a,9);
		while(p!=null)
		{
			System.out.println(p.val);
			p=p.next;
		}
}
}
