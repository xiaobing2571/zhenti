package com.interview.Wangyi;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();//���
         int f = sc.nextInt();//ˮ������
         int d = sc.nextInt();//��Ʊ
         int p = sc.nextInt();//ˮ������
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
