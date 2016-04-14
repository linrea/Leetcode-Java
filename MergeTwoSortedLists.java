package leetcode;
/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists
{
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	{
		ListNode a=l1,b=l2;
		ListNode head=new ListNode(0);
		ListNode l3=head;
		while(a!=null||b!=null)
		{
			if(a==null||(b!=null&&a.val>=b.val))
			{
				l3.next=b;
				b=b.next;
				l3=l3.next;
			}
			else 
			{
				l3.next=a;
				a=a.next;
				l3=l3.next;
			}
				
		}
		return head.next;
	}
	public static void main(String[] args)
	{
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(3);
		ListNode c=new ListNode(5);
		ListNode d=new ListNode(7);
		ListNode e=new ListNode(2);
		ListNode f=new ListNode(4);
		ListNode g=new ListNode(5);
		ListNode h=new ListNode(7);
		ListNode i=new ListNode(9);
		ListNode j=new ListNode(11);
		a.next=b;
		b.next=c;
		c.next=d;
		e.next=f;
		f.next=g;
		g.next=h;
		h.next=i;
		i.next=j;
		ListNode l3=mergeTwoLists(a,e);
		System.out.println(l3.val);
				
				
		
	}
}
