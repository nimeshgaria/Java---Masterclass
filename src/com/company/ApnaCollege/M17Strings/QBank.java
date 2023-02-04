package com.company.ApnaCollege.M17Strings;

public class QBank {
    public static void countLowerCaseVowels(){
        String str = "aeioOAnNmsh";
        String vowels = "aeiou";
        int count = 0;
        for(int i=0;i<str.length(); i++){

            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i'  || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
                count++;
            }
        }
        System.out.println(count);
    String a= "Apnacollege Large";
    String b= a.replace("c","a ");
    String c = a.replaceAll("college", "asd");
        System.out.println(b + " " + "b" );
        System.out.println("replace all" + " " +c );
    }

    public static void main(String[] args) {
        /*countLowerCaseVowels();
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        sb.insert(0,"nime");
        sb.replace(1,3,"test");
        System.out.println(sb);*/

    }
}
