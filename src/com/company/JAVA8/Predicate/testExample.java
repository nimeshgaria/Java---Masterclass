package com.company.JAVA8.Predicate;

import com.company.JAVA8.Stream.Imp.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class testExample {
    /*Join Predicate
/**joiningtwopredicatefunctions

*p1.and(p2).test(condition)       ##AND

*p1.or(p2).test(condition)         ##OR

*p1.negate().test(condition)    ##NEGATE

***/
    public static void main(String[] args) {

        List<Employee> empData = new ArrayList<>();
        empData.add(new Employee(1,"yo", 32,"active" ,392));
        empData.add(new Employee(2,"wef", 32,"active" ,32));
        empData.add(new Employee(3,"erf", 32,"active" ,92));


        Predicate<Employee> e1= emp -> emp.getSalary() > 50;
        Predicate<Employee> e2= emp -> emp.getStatus() == "active";
        for(Employee ele : empData) {

            if (e1.test(ele)) {
                System.out.println(ele);
            }
            if(e1.and(e2).test(ele)){
                System.out.println(ele);
            }
        }
        }
}
