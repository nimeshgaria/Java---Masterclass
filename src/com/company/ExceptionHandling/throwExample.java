package com.company.ExceptionHandling;

import com.company.ExceptionHandling.Custom.CustomException;

public class throwExample {
    public static void example() throws Exception{

        int add = 8+1;
        if(add > 13){
            throw new ArithmeticException();
        }if(add <= 9){
            throw new CustomException();
        }
    }
    public static void main(String[] args) throws Exception {
        try{
            example();
        }catch (CustomException e ){
            System.out.println(e.getMessage());
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }



    }
}
