package com.interview.Wangyi;
import java.util.*;
public class Main20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(9);
     list.add(7);
     list.add(0);
     Collections.sort(list);;
     for(Integer i:list) {
    	 System.out.println(i);
     }
	}

}
