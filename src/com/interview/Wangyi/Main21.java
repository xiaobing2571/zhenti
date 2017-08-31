package com.interview.Wangyi;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class Main21{
    public static void main(String[] args){
        Main21 mm = new Main21();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        List<String> list1= mm.tranString(str1);
        List<String> list2 = mm.tranString(str2);
        for(String s:list1){
            System.out.println(s);
        }
        for(String s:list2){
            System.out.println(s);
        }
        
    }
    public static List<String> tranString(String str){
        if(str.length()>=100)
            return null;
        if(str == null||str.length()==0)
            return null;
        int i = str.length()/8;
        int j = str.length()%8;
        List<String> list = new LinkedList<>();
        if(i>0){
            for(int a = 0;a<i;a++){
                list.add(str.substring(a*8,(a+1)*8));
            }
            
        }
        String str2  = str.substring(i*8,str.length());
        StringBuffer sb = new StringBuffer(str2);
        while(sb.length()<8){
            sb.append("0");
            
        }
        
        list.add(sb.toString());
        return list;
    }
        
}