package com.company.ApnaCollege.M17Strings;

public class Main {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < (n - 1 - i); i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void printLetters(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void InputOutput() {
     /*   Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // next read only one word, while nextLine reads whole sentence
        System.out.println(name);
        String str= "Nimesh Garia";
        System.out.println(str.length());*/
        // concatenation
        String fname = "Ram";
        String lname = "Roy";
        String fullname = fname + " " + lname;
        System.out.println(fullname + "is this");
        printLetters(fullname);
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (int) Math.sqrt(x2 + y2);
    }

    public static void compareStrings() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
    public static void substring(){
        String str = "HelloWorld";
        System.out.println(str.substring(0,6));
    }
    public static void largestString(){
        String fruits[] = {"apple","mango", "banana"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr+= count.toString();
            }
        }
        return  newStr;
    }
    public static void main(String[] args) {
        /*
        InputOutput();
        System.out.println(isPalindrome("nian"));
        System.out.println(getShortestPath("NNN"));
        compareStrings();
        substring();*/
      /*  largestString();
        System.out.println(toUpperCase("hello i am"));
        System.out.println(compress("aabccccd"));

        Map<String , Integer> m =  new HashMap<String , Integer>();
        m.put("tes", 1);
        m.put("yes", 6);
        m.put("bes", 2);
        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println("Kwy:" + e.getKey() +  "value" + e.getValue());*/
        compareStrings();
        }
    }

