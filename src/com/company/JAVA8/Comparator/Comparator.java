package com.company.JAVA8.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void sort(){
        List<Integer> integerList = Arrays.asList(4,5,3,2);
        java.util.Comparator<Integer> c = (var1, var2) ->{
            if(var1 > var2){
                return -1;
            } else if(var1 < var2){
                return 1;
            }else {
                return 0;
            }
        };
        Collections.sort(integerList,c);
        System.out.println(integerList);
    }
    public static void main(String[] args) {
        /*List<Person> persons = new ArrayList<>();
        persons.add(new Person("a",3));
        persons.add(new Person("z", 2));
        persons.add(new Person("b", 90));
        persons.add(new Person("s",32));

        //forEach()
        Collections.sort(persons, java.util.Comparator.comparing(Person::getFname) // sorts ascending
                .thenComparing(Person::getAge));

        for(Person person : persons){
            System.out.print(person.getFname());
            System.out.print(person.getAge());
            System.out.println();
        }

        Collections.sort(persons, java.util.Comparator.comparing(Person::getFname).reversed());
        System.out.println("Desc ");
        for(Person p : persons){
            System.out.print(p.getFname());
        }*/
    sort();}
}
class Person{
    private String fname;
    private int age;
    public Person(String fname, int age){
        this.fname = fname;
        this.age = age;
    }
    public void setFname(String fname){
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*
 class A implements Comparable<list>{
    @Override
    public int compareTo(Integer i, Integer j) {
        if(i)
    }
}*/

