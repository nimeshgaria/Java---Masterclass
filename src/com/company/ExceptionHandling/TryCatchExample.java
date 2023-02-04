package com.company.ExceptionHandling;

import com.company.ExceptionHandling.Custom.CustomException;

public class TryCatchExample {
    public static void main(String[] args) throws CustomException {
         try{
             int x = 3;

         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("array out of index");
         } catch (Exception w){

         } finally{
             System.out.println("done");
         }
    }
}
