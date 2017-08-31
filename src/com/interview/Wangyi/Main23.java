package com.interview.Wangyi;

import java.util.*;
import java.util.Map.Entry;
public class Main23{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        while(sc.hasNext()){
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(!map.containsKey(i)){
            map.put(i,j);
            }else{
                map.put(i,map.get(i)+j);
            }
        }
        for(Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}