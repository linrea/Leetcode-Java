package leetcode;
/*
 * Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
click to show spoilers.
 */
public class ReverseInteger
{
	 public static int reverse(int x)
	 {
		 int result=0,n=0;
		 boolean flag=false;
		 if(x==Integer.MIN_VALUE) return 0;
		
		 if(x<0)
		 {
			 flag=true;
			 x=-x;
		 }
		 
		 while(x>=10)
		 {
			 n=x%10;
			 if((result+n)>(Integer.MAX_VALUE/10)||(((result+n)==(Integer.MAX_VALUE/10))&&((x/10>7&&flag==false)||(x/10>8&&flag==true))))return 0;//in case of the reverse of the integer would be overflow...
			 if(n!=0||result!=0) result=(n+result)*10;
			 x/=10;
			 			 
		 }
		 
		 result=x+result;
		 if(flag==true) return -result;
		 else return result;
		 
	 }
	 public static void main(String[] args)
	 {
		 int x=1463847412;
		 int a=reverse(x);
		 System.out.println(a);
	 }
}
