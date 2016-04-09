package leetcode;

/*
 * Given two binary strings, return their sum (also a binary string).
For example,
a = "11"
b = "1"
Return "100"
 */
public class AddBinary
{
	public static String addBinary(String a, String b)
	{
		String result = "";
		a = a.trim();
		b = b.trim();
		if (a.length() == 0 || b.length() == 0)
			return result;
		int[] longarray = new int[a.length() + b.length()];
		int[] shortarray = new int[a.length() + b.length()];
		int longsize, shortsize;
		if (a.length() >= b.length())
		{
			longsize = a.length();
			shortsize = b.length();
			for (int i = 0; i < a.length(); i++)
				longarray[i] = a.charAt(a.length() - i - 1) - '0';
			for (int i = 0; i < b.length(); i++)
				shortarray[i] = b.charAt(b.length() - i - 1) - '0';
		} else
		{
			longsize = b.length();
			shortsize = a.length();
			for (int i = 0; i < b.length(); i++)
				longarray[i] = b.charAt(b.length() - i - 1) - '0';
			for (int i = 0; i < a.length(); i++)
				shortarray[i] = a.charAt(a.length() - i - 1) - '0';
		}
		int[] c = new int[longsize + 1];

		for (int i = 0; i < shortsize; i++)
		{
			c[i] += (longarray[i] + shortarray[i]);
			if (c[i] >= 2)
			{
				c[i + 1] += 1;
				c[i] = c[i] - 2;
			}
		}
		for (int i = shortsize; i < longsize; i++)
		{
			c[i] += longarray[i];
			if (c[i] >= 2)
			{
				c[i + 1] += 1;
				c[i] = c[i] - 2;
			}
		}

		for (int i = c.length - 1; i >= 0; i--)
		{
			if (c[c.length - 1] == 0 && i == c.length - 1)
				continue;
			result += (char) (c[i] + '0');
		}
		return result;

	}

	public static void main(String[] args)
	{
		String a = "11", b = "1";
		String c = addBinary(a, b);
		System.out.println(c);
	}

}
