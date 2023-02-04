package com.company.Section12.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java exists");
        }
        else{
            System.out.println("Python exists");
        }
        languages.put("Java","This is java");
        languages.put("Python","This is Python");
        System.out.println(languages.get("Java"));
    }

}
