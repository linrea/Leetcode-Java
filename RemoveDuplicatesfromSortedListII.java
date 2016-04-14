package leetcode2;

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesfromSortedListII
{
	   public static ListNode deleteDuplicates(ListNode head) 
	   {
		   if(head==null||head.next==null) return head;
		   ListNode distinctp=new ListNode(0);
		   ListNode result=distinctp;
		   int temp=head.val-1;
		   ListNode p=head;
		   while(p.next!=null)
		   {
			   
			   if(p.val!=p.next.val&&p.val!=temp)
			   {		   				   
				   distinctp.next=p;
				   distinctp=distinctp.next;
			   }
			   temp=p.val;
			   p=p.next;
			   
			   
		   }
		   if(p.val!=temp) 
		   {
			   distinctp.next=p;
			   distinctp=distinctp.next;
		   }
		   distinctp.next=null;
		   return result.next;
	   }
	   public static void main(String[] args)
		{
			ListNode a=new ListNode(1);
			ListNode b=new ListNode(2);
			/*ListNode c=new ListNode(2);
			ListNode d=new ListNode(2);
			ListNode e=new ListNode(2);
			ListNode f=new ListNode(4);
			ListNode g=new ListNode(5);
			ListNode h=new ListNode(5);
			ListNode i=new ListNode(9);
			ListNode j=new ListNode(11);*/
			a.next=b;
			/*b.next=c;
			c.next=d;
			d.next=e;
			e.next=f;
			f.next=g;
			g.next=h;
			h.next=i;
			i.next=j;*/
			ListNode result=deleteDuplicates(a);
			while(result!=null)
			{
				System.out.println(result.val);
				result=result.next;
			}
		}
}
