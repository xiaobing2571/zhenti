package com.interview.Wangyi;
import java.util.Scanner;
public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     sc.close();
     if(str.matches("^[a-n]+")) {
     char[] ch = str.toCharArray();
     System.out.println(tansString(ch));
     }else {
    	 System.out.println("-1");
     }
	}

	private static long tansString(char[] ch) {
		// TODO Auto-generated method stub
		long sum=0;
		for (int i = 0; i < ch.length; i++) {
			sum=sum*31+(int)ch[i];
		}
		return sum;
		
	}

}
