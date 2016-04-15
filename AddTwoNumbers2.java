package leetcode2;
/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers2
{
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		if(l1==null&&l2==null) return null;
		if(l1==null) return l2;
		if(l2==null) return l1;
		ListNode res=new ListNode(0),reshead=res;
		
		int result=0,temp=0;
		while(l1!=null||l2!=null)
		{result=0;
			if(l1!=null)
		{
			result+=l1.val;
			l1=l1.next;
		}		
		if(l2!=null)
		{
			result+=l2.val;
			l2=l2.next;			
		}
		ListNode node=new ListNode(result+temp);
		temp=0;
		if(node.val>=10)
		{
			temp=1;
			node.val-=10;	
		}
		res.next=node;
		res=res.next;
		}
		if(temp==1) {
			ListNode node=new ListNode(temp);
			res.next=node;
		}
		
		return reshead.next;
			
		
	}
	 public static void main(String[] args)
	 {

			ListNode a=new ListNode(1);
			ListNode b=new ListNode(9);
			ListNode c=new ListNode(9);
			ListNode d=new ListNode(9);
			ListNode e=new ListNode(9);
			ListNode f=new ListNode(9);
			ListNode g=new ListNode(9);
			ListNode h=new ListNode(9);
			ListNode i=new ListNode(9);
			ListNode j=new ListNode(9);
			ListNode k=new ListNode(9);
			
			//a.next=b;
			b.next=c;
			c.next=d;
			d.next=e;
			e.next=f;
			f.next=g;
			g.next=h;
			h.next=i;
			i.next=j;
			j.next=k;
			ListNode result=addTwoNumbers(a,b);
			while(result!=null)
			{
				System.out.println(result.val);
				result=result.next;
			}
	 }
}
