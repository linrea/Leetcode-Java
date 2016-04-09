package leetcode;
/*
 * Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementstStr {
	public static int strStr(String haystack, String needle)
	{
		if(haystack.length()==0&&needle.length()==0||needle.length()==0) return 0;
		if(haystack.length()<needle.length()) return -1;
		
		for(int i=0;i<=(haystack.length()-needle.length());i++)
		{
			int a=i;
			for(int j=0;j<needle.length();j++)
			{
				if(haystack.charAt(a)==needle.charAt(j))
					{
					a++;
					if (j==needle.length()-1) return i;
					}			
				else break;
			}

		}
		
		return -1;
	}


	public static void main(String[] args)
	{
		String haystack="bbba", needle="a";
		int a=strStr(haystack,needle);
		
		System.out.println(a);
		
	}
}
