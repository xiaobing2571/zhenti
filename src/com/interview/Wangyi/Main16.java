package com.interview.Wangyi;
import java.util.Scanner;
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     String str=sc.nextLine();
     sc.close();
     String[] arr=str.split(" |;");
     String max="";
     if(arr.length<=0) {
    	 System.out.println(-1);
     }else {
    	 for(int i = 0 ;i<arr.length;i++) {
    		 if(max.length()<arr[i].length()) {
    			 max=arr[i];
    		 }
    	 }
    	 System.out.println(max);
     }
	}

}
