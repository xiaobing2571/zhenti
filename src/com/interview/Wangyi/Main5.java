package com.interview.Wangyi;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();//租金
         int f = sc.nextInt();//水果数量
         int d = sc.nextInt();//钞票
         int p = sc.nextInt();//水果单价
         sc.close();
         int day=0;
         while(d>0) {
           if(f>0 ) {
        	   if(d-x<0)
        		   break;
        	   f--;
        	   day++;
        	   d=d-x;
           }
           if(f==0) {
        	   if(d-x-p<0)
        		   break;
        	   d=d-x-p;
        	   day++;
           }
        	 
         }
         System.out.println(day);
	}

}
