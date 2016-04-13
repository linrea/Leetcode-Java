package leetcode;

/*
 * Implement pow(x, n).
 */
public class Powxn
{
	public static double myPow(double x, int n)
	{
		boolean flag=false;
		double a=x;
		if (x == 0)
			return 0;
		if (n < 0)
		{
			if (n==Integer.MIN_VALUE)//In case of n=-2147483648, which cannot use "n=-n".
			{
				
				n=-(n+1);
				x=1.0/x;
				flag=true;
			}
			else
			{
			n = -n;
			x = 1.0 / x;
			}
		}
		if (n == 0)
			return 1;
		double result = 1;
		while (n>0)
		{							
			if (n% 2 != 0)
				result *= x;						
			 x*= x;
			n/= 2;
			
		}
		if (flag==true) return result*(1/a);
		else
			return result;
		
	}

	public static void main(String[] args)
	{
		int n = -2147483648;
		double x =-1.00000;
		double a = myPow(x, n);
		System.out.println(a);
	}
}
