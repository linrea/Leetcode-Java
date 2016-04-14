package leetcode2;
/*
 * Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesinPairs
{
	public static ListNode swapPairs(ListNode head)
	{
		if(head==null||head.next==null)
			return head;
		ListNode newhead=head.next;
		ListNode p=head,q;
		ListNode temp=new ListNode(0);
		
		while(p!=null&&p.next!=null)
		{
			temp.next=p.next;
			q=p.next;
			p.next=q.next;			
			q.next=p;
			temp=p;
			p=p.next;
		
		}
		return newhead;
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
		ListNode p= swapPairs(a);
		System.out.println(p.val);
		
		
	}
}
