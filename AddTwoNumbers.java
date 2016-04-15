package leetcode2;
/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers
{
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	 {
		 if(l1==null&&l2==null) return null;
		 if(l1==null) return l2;
		 if(l2==null) return l1;
		 ListNode result=l1;
		 int temp=0;
		 while(l1.next!=null&l2.next!=null) 
		 {
			 l1.val=l1.val+l2.val+temp;
			 temp=0;
			 if(l1.val>=10)
			 {
				 temp=1;
				 l1.val-=10;
			 }
			 l1=l1.next;
			 l2=l2.next;
			
		 }
		 if(l1.next==null&&l2.next!=null)
		 {
			 l1.val=l1.val+l2.val+temp;
			 temp=0;
			 if(l1.val>=10)
			 {
				 temp=1;
				 l1.val-=10;
			 }
			 l2=l2.next;
			 l1.next=l2;
			 l1=l1.next;
			 l1.val+=temp;
			 temp=0;
			 while(l1.val>=10&&l1.next!=null)
			 {
				 l1.val-=10;
				 l1.next.val++;
				 l1=l1.next;
			 }
		 }
		 else if(l2.next==null&&l1.next!=null)
		 {
			 l1.val=l1.val+l2.val+temp;
			 temp=0;
			 if(l1.val>=10)
			 {
				 temp=1;
				 l1.val-=10;
			 }
			 l1=l1.next;
			 l1.val+=temp;
			 temp=0;
			 while(l1.val>=10&&l1.next!=null)
			 {
				 l1.val-=10;
				 l1.next.val++;
				 l1=l1.next;
			 }
		 }
		 else if (l1.next==null&&l2.next==null)
		 {
			 l1.val=l1.val+l2.val+temp;
		 }
		 if(l1.val>=10)
		 {
			 l1.val-=10;
			 ListNode nnode=new ListNode(1);
			 l1.next=nnode;
		 }
		 return result;
		 
	 }
	 public static void main(String[] args)
	 {

			ListNode a=new ListNode(1);
			ListNode b=new ListNode(2);
			ListNode c=new ListNode(2);
			ListNode d=new ListNode(2);
			ListNode e=new ListNode(2);
			ListNode f=new ListNode(4);
			ListNode g=new ListNode(5);
			ListNode h=new ListNode(5);
			ListNode i=new ListNode(9);
			ListNode j=new ListNode(2);
			a.next=b;
			b.next=c;
			c.next=d;
		//	d.next=e;
			e.next=f;
			f.next=g;
			g.next=h;
			h.next=i;
			i.next=j;
			ListNode result=addTwoNumbers(a,e);
			while(result!=null)
			{
				System.out.println(result.val);
				result=result.next;
			}
	 }
	 
}
