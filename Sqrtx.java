package leetcode;

/*
 * Implement int sqrt(int x).
Compute and return the square root of x.
 */
public class Sqrtx
{
	public static int mySqrt(int x)
	{
		if (x == x * x)
			return x;
		if (x <= 1)
			return x;
		int first = 1, last = x, mid = x / 2;
		while (first <= last)
		{
			if (mid == x / mid)
				return mid;// not x==mid*mid, if so it will...Time Limit
							// Exceeded....
			else if (mid > x / mid)
			{
				last = mid - 1;
			} else
				first = mid + 1;
			mid = (last + first) / 2;
		}
		return mid;
	}

	public static void main(String[] args)
	{
		int x = 5;
		int a = mySqrt(x);
		System.out.println(a);
	}
}
