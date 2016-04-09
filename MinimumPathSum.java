package leetcode;
/*
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum
{
	public static int minPathSum(int[][] grid)
	{
		int m=grid.length;
		int n=grid[0].length;
		if(m==0&&n==0) return 0;
		int[][] dp=new int[m][n];
		dp[0][0]=grid[0][0];
		for(int i=1;i<m;i++)
		{
			dp[i][0]=dp[i-1][0]+grid[i][0];
		}
		for(int i=1;i<n;i++)
		{
			dp[0][i]=dp[0][i-1]+grid[0][i];
		}
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(dp[i-1][j]<dp[i][j-1])   //This is the point.  
					dp[i][j]=dp[i-1][j]+grid[i][j];   //For grid[i][j], you have to take that.
				else
					dp[i][j]=dp[i][j-1]+grid[i][j];
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args)
	{
		int[][] grid={{1,2,3,4,5,6},{1,2,3,4,58,4}};
		int a=minPathSum(grid);
		System.out.println(a);
				
	}

}

