package com.interview.Wangyi;

import java.util.*;
public class Main22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long i = sc.nextLong();
            getResult(i);
        }
    }
        public static void getResult(long d){
        if(d<=1)
            System.out.print("wu");
            
        if(d==2){
           System.out.print(d+" ");
        }
       // while(d!=1) {
        for(long i = 2;i <=d;i++){
            if(isZhiShu(i)){
                while(d%i==0){
                    d /=i;
                    System.out.print(i+" ");
                }
            }
       // }
        }
        }
        public static boolean isZhiShu(long i ){
            if(i==2)
                return true;
            for(long j = 2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        }
            
        
    }