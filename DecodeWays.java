package leetcode;
/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.
For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
The number of ways decoding "12" is 2.
 */
public class DecodeWays
{
	 public static int numDecodings(String s)
	 {
		 if(s==null||s.length()==0) return 0;
		 if(s.charAt(0)=='0') return 0;
		 if(s.length()==1) return 1;
		 if(s.charAt(1)=='0'&&s.charAt(0)>'2') return 0;   //in case of "301"
		 int[] dp=new int[s.length()];
		 dp[0]=1;
		 if(isvalid(s.substring(0,2)))
			 dp[1]=2;
		 else dp[1]=1;
		 int i=2;
		 while(i<s.length())
		 {
			 String sub="";
			 if(i==s.length()-1) sub=s.substring(i-1);
			 else sub=s.substring(i-1,i+1);
			 if(isvalid(sub))
				 dp[i]=dp[i-1]+dp[i-2];
			 else
			 {
				 if(sub.charAt(1)=='0')
				 {
					 if(s.charAt(i-1)=='0'||(Integer.parseInt(sub)>20))		// in case of "100""230"...
						 return 0;
					 else dp[i]=dp[i-2];
				 }
					 
				 else
					 dp[i]=dp[i-1];
						 
			 }
			 i++;
		 }
		 return dp[s.length()-1];
		 
	 }
	 public static boolean isvalid(String s)
	 {
		 if(s.charAt(1)=='0') return false;
		 if(Integer.parseInt(s)<=26&&Integer.parseInt(s)>9)  //in case of "101"
				 return true;
		 else return false;
	 }
	 public static void main(String[] args)
	 {
		 String s="301";
		 int a=numDecodings(s);
		 System.out.println(a);
	 }

}
