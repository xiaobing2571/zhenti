package com.interview.Wangyi;
import java.util.*;
import java.util.Map.Entry;
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String[] arrStr=sc.nextLine().split(",");
     int[] arr=new int[arrStr.length];
     for(int i=0;i<arrStr.length;i++) {
    	 arr[i]=Integer.parseInt(arrStr[i]);
    	 
     }
     Map<Integer,Integer> map=new LinkedHashMap<>();

	for(int i=0;i<arr.length;i++) {
    	 int count=1;
    	 for(int j=i+1;j<arr.length-1;j++) {
    	     if(arr[i]==arr[j]) {
    	    	  count++;
    	    	  i++;
    	     }else {
    	    	 break;
    	     }
    	    	
    	         
    	 }
    	 map.put(arr[i],count);
    	 }
//	   Iterator iter=map.keySet().iterator();
//	   while(iter.hasNext()) {
//		   int key=(int) iter.next();
//		   System.out.println(key+"("+map.get(key)+")");
//		   
	
//	   }
	
	  for(Entry<Integer,Integer> s:map.entrySet()) {
		  System.out.println(s.getKey()+"("+s.getValue()+")");
	  }
     }
	
	}


