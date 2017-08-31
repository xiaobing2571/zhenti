package com.interview.Wangyi;
import java.util.Scanner;
public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()) {
        	String str = sc.nextLine();
        	System.out.println(tranString(str));
        }
	}

	private static int tranString(String str) {
		// TODO Auto-generated method stub
		if(str==null||"".equals(str)) {
			return -1;
		}
		if(!str.startsWith("0x")&&!str.startsWith("0X"))
			return -1;
		String str1 =str.substring(2,str.length()).toUpperCase();
		if(str1.length()>8||"FFFFFFFF".equals(str1))
			return -1;
		if(!str1.matches("[A-F0-9]{0,}")) {
			return -1;}
		
		return compute(str1);
	}

	private static int compute(String str1) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)>='0'&&str1.charAt(i)<='9')
				sum=sum*16+str1.charAt(i)-'0';
			if(str1.charAt(i)>='A'&&str1.charAt(i)<='F') {
				sum=sum*16+str1.charAt(i)-'A'+10;
			}
		}
		return sum;
	}

}
