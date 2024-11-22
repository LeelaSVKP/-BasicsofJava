

package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.*;  
public class LambdaExpressionExample6{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Ram");  
        list.add("pandu is very mental boy");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
