package com.interview.Wangyi;
import java.util.Scanner;
public class Main18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(('k'-'d'));
        String str="harD";
        String str1 = "hark";
        System.out.println(compareString(str,str1));
        
	}
	public static int compareString(String sourceStr,String targetStr) {
		return sourceStr.compareTo(targetStr);
	}

}
