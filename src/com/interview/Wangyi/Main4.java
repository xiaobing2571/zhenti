package com.interview.Wangyi;
import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Scanner sc = new Scanner(System.in);
//  
//    	 int n = sc.nextInt();
//    	 int[] arr=new int[n];
//    	 for(int i=0;i<n;i++) {
//    		 arr[i] = sc.nextInt();
//    		 
//    	 }
//    	 sc.close();
//    	 StringBuffer buff=new StringBuffer(""+arr[0]);
//    	 for(int i =1;i<n;i++) {
//    		 buff.append(" "+arr[i]);
//    		 buff.reverse();
//    	 }
//    	 System.out.println(buff.toString());
		int n;    
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=in.nextInt();
        }
        in.close();
        int[] c=new int[n];
        //n为偶数
        if(n%2==0) {
            int m=n/2;        
            for(int i=0;i<m;i+=2) {
                c[m]=a[i];
                m++;
            }
            m=n/2-1;
            for(int i=1;i<n;i+=2) {
                c[m]=a[i];
                m--;
            }
        }
        //n为奇数
        if(n%2!=0) {
            int m = (n-1)/2;
            for(int i=0;i<n;i+=2) {
                c[m]=a[i];
                m--;
            }
            m=(n-1)/2+1;
            for(int i=1;i<m;i+=2) {
                c[m]=a[i];
                m++;
            }
        }
        for(int i=0;i<n-1;i++) {
            System.out.print(c[i]+" ");
        }  
        System.out.print(c[n-1]);

    	 
     }
	

}
