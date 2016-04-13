package leetcode;
/*
 * Divide two integers without using multiplication, division and mod operator.
If it is overflow, return MAX_INT.
 */
public class DivideTwoIntegers
{
	 public static int divide(int dividend, int divisor) 
	 {
		 if(dividend==0) return 0;
		 if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
		 int result=0;
		 int abdividend=Math.abs(dividend);
		 int abdivisor=Math.abs(divisor);
		 while(abdividend>abdivisor)
		 {
			 int shift=0;
			 while(abdividend>=(abdivisor<<shift))
				 shift++;
			 result+=1<<shift-1;
			 abdividend-=(abdivisor<<(shift-1));
		 }
		 if((dividend>0&&divisor>0)|| (dividend<0&&divisor<0))return result;
		 else return -result;
	 }
	 public static void main(String[] args)
	 {
		 int dividend=98, divisor=-7;
		 int a=divide(dividend,divisor);
		 System.out.println(a);
	 }
}
