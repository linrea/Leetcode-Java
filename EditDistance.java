package leetcode;
/*
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
You have the following 3 operations permitted on a word:
a) Insert a character
b) Delete a character
c) Replace a character
 */
public class EditDistance
{
	public static int minDistance(String word1, String word2)
	{
		if(word1.length()==0&&word2.length()==0) return 0;
//		if(word1.length()==0) return word2.length();
//		if(word2.length()==0) return word1.length();
//		if(word1.length()==1&&word2.length()==1&&word1.charAt(0)!=word2.charAt(0)) return 1;
		int m=word1.length();
		int n=word2.length();
		int[][] dp=new int[m+1][n+1];
		dp[0][0]=0;
		for(int i=1;i<m+1;i++)
			dp[i][0]=dp[i-1][0]+1;    //word1 has i chars, but it turn to 0, so it need to be deleted....
		for(int i=1;i<n+1;i++)
			dp[0][i]=dp[0][i-1]+1;    //word1 has 0 char, but later it has i chars, so insert...
		for(int i=1;i<m+1;i++)
			for(int j=1;j<n+1;j++)
			{
				if(word1.charAt(i-1)==word2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else 
				{
					dp[i][j]=min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+1);
				}
			}
		return dp[m][n];
		
	}
	public static int min(int a, int b, int c)
	{
		int d=Math.min(a, b);
		return Math.min(c, d);
	}
	public static void main(String[] args)
	{
		String word1="4";
		String word2="2";
		int a=minDistance(word1,word2);
		System.out.println(a);
		
	}

}
