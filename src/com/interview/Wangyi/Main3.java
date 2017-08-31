package com.interview.Wangyi;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     while(in.hasNext()) {
    	 String s =in.nextLine();
    	 int[] dp = new int[s.length()];
    	 dp[0]=1;
    	 for(int i = 1;i<dp.length;i++) {
    		 if(s.charAt(i-1)!=s.charAt(i)) 
    			 dp[i]=dp[i-1]+1;
    		 else
    			 dp[i]=1;
    	 }
    	// int max =0;
    	 Arrays.sort(dp);
    	 System.out.println(dp[s.length()-1]);
     }
	}

}
