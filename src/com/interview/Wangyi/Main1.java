package com.interview.Wangyi;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in = new Scanner(System.in);
         while(in.hasNext()) {
        	 String str = in.nextLine();
        	 Set<Character> set = new HashSet<>();
        	 for(int i=0;i<str.length();i++) {
        		 set.add(str.charAt(i));
        	 }
        	 if(set.size()==2) {
        		 System.out.println(2);
        	 }
        	 else if(set.size()==1) {
        		 System.out.println(1);
        	 }
        	 else {
        		 System.out.println(0);
        	 }
        	 
         }
	}

}
