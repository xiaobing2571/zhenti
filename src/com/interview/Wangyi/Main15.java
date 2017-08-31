package com.interview.Wangyi;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;


public class Main15 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] inArr=new int[][] {{3,6,5},{1,2,3,4},{2,3,4,5,6}};
   
    Map<Integer,Integer> map=findMap(inArr);
    for(Entry<Integer, Integer> entry:map.entrySet()) {
    	System.out.println(entry.getKey()+"  "+entry.getValue());
    }
    for(Integer i:map.keySet()) {
        System.out.println(i+" "+map.get(i));
    }
    //System.out.println(); 
	}

	private static Map<Integer, Integer> findMap(int[][] inArr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> arrMap=new HashMap<>();
	    for(int i=0;i<inArr.length;i++) {
	    	for(int j=0;j<inArr[i].length;j++) {
	    		arrMap=setMin(j,inArr[i][j],arrMap);
	    	}
	    }
	    return arrMap;
		//return arrMap.values().toArray(new Integer[0]);
	}

	private static Map<Integer, Integer> setMin(int j, int i, Map<Integer, Integer> arrMap) {
		// TODO Auto-generated method stub
		if(arrMap==null||arrMap.isEmpty()) {
			arrMap.put(j, i);
			return arrMap;
			
		}
		if(!arrMap.containsKey(j)) {
			arrMap.put(j, i);
			return arrMap;
		}else if(arrMap.get(j)>i){
			arrMap.put(j, i);
			return arrMap;		
		}
		  return arrMap;
	}

}
