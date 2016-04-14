package leetcode2;
/*
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.
For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PartitionList
{
	public static ListNode partition(ListNode head, int x) 
	{
		if(head==null) return head;
		ListNode p=head;
		ListNode less=new ListNode(0), greater=new ListNode(0);
		ListNode headless=less, headgreater=greater;
		while(p!=null)
		{
			if(p.val<x)
			{
				less.next=p;
				less=less.next;
			}
			else 
			{
				greater.next=p;
				greater=greater.next;
			}
			p=p.next;
		}
		greater.next=null;  //It's necessary, otehrwise the result may have a loop.
		less.next=headgreater.next;
		return headless.next;
	}
	public static void main(String[] args)
	{
		ListNode a=new ListNode(6);
		ListNode b=new ListNode(3);
		ListNode c=new ListNode(5);
		ListNode d=new ListNode(7);
		ListNode e=new ListNode(2);
		ListNode f=new ListNode(4);
		ListNode g=new ListNode(4);
		ListNode h=new ListNode(7);
		ListNode i=new ListNode(9);
		ListNode j=new ListNode(11);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		g.next=h;
		h.next=i;
		i.next=j;
		ListNode result=partition(a,4);
		while(result!=null)
		{
			System.out.println(result.val);
			result=result.next;
		}
}
}
