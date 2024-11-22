package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

public class LambdaExpressionExample2 {


interface Sayable{  
    public String say();  
}  
 
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  

