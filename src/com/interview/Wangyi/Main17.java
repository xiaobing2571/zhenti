package com.interview.Wangyi;
import java.util.*;
public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String[] str1 = str.replaceAll("[^0-9]+", " ").trim().split(" ");
      System.out.println(str1);
     sc.close();
     StringBuffer sb = new StringBuffer();
     for(int i=0;i<str1.length;i++) {
    	 int j = Integer.parseInt(str1[i]);
    	 if((j>=65&&j<=90)||(j>=97&&j<=122)) {
    		 sb.append((char)j);
    	 }else {
    		sb.append("?");
    	 }
     }
     System.out.println(sb.toString());
      
	}

}
