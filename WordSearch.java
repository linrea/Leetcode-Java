package leetcode;


/*
 * Given a 2D board and a word, find if the word exists in the grid.
The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
For example,
Given board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */
public class WordSearch
{
	public static boolean exist(char[][] board, String word) 
	{
		if(board==null||word==null||word.length()>(board.length*board[0].length)) return false;
		int m=board.length;
		int n=board[0].length;
		if(m==1&n==1&&board[0][0]==word.charAt(0)) return true;
		int[][] visited=new int[m][n];
		
		for(int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				{
				/*
				if(!search(i,j,0,board,word,visited))
					for (int x=0;x<m;x++)
						for(int y=0;y<n;y++)
							visited[x][j]=0;   //Cannot set visited {0} here at one time....
				else
					return true;*/
				if(search(i,j,0,board,word,visited))
					return true;
				}
				
		
		return false;	
	}
	 public static boolean search(int i, int j,int k, char[][] board, String word,int [][]visited)
	 {
		 if (board[i][j]!=word.charAt(k)||visited[i][j]==1) return false;
		 if (k==word.length()-1) return true;
		 visited[i][j]=1;
		 
		
		 if(i<board.length-1&&search(i+1,j,k+1,board,word,visited)) 
		 {		
			 return true;
		 }
		 if(j<board[0].length-1&&search(i,j+1,k+1,board,word,visited) )
		 {
			 
			
			 return true;
		 }
		 if(i>0&&search(i-1,j,k+1,board,word,visited)) 
		 {
			
			 return true;
		 }
		 if(j>0&&search(i,j-1,k+1,board,word,visited) )
		 {
			 
			 return true;
		 }
		 visited[i][j]=0;   //Have to set to 0 here, otherwise it will influence other search...
		 return false;
			
				 
	 }

	 
	public static void main(String[] args)
	{
char[][] board={{'A','B','C','E',},{'S','F','C','S',},{'A','D','E','E',}};
//	char[][] board={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
		String word="SEE";
		boolean a=exist(board,word);
		System.out.println(a);
	}

}
