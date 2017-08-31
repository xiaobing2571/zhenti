package com.interview.Wangyi;
import java.util.Scanner;
public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String string=sc.nextLine();
     sc.close();
     String string1=string.replaceAll("[^A-Za-z0-9]+", "");
     System.out.println(tranString(string1));
	}

	private static String tranString(String string1) {
		// TODO Auto-generated method stub
		StringBuffer buf1=new StringBuffer();
		StringBuffer buf2=new StringBuffer();
		char[] ch =string1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				buf1.append(ch[i]);
				
			}
		    if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')) {
		    	buf2.append(ch[i]);
		    }
		}
		return buf2.append(buf1).toString();
	}

}
