package com.interview.Wangyi;
import java.util.Arrays;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
    	int n = sc.nextInt();
    	
    	if(n>2){
	    int[] nums = new int[n];
	    for(int i = 0;i<n;i++) {
	      nums[i]=sc.nextInt();
	    }
    	Arrays.sort(nums);
    	int d = nums[1]-nums[0];
    	boolean flag = true;
    	for(int i=1;i<nums.length-1;i++) {
    		if(nums[i+1]-nums[i]!=d) {
    			flag=false;
    			break;
    		}
    	}
    	if(flag) {
    		System.out.println("possible");
    	}else {
    		System.out.println("impossible");}
    	
    	
    	}else {
    		System.out.println("impossible");}
    }
	}

}
