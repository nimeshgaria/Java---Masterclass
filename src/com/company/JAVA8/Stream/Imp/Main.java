package com.company.JAVA8.Stream.Imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* 1. Print */
public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "siva", 101, "active", 2000));
        empList.add(new Employee(102, "reddy", 101, "active", 20010));
        empList.add(new Employee(103, "yam", 102, "inactive", 22000));
        empList.add(new Employee(104, "ram", 103, "inactive", 32000));


        // print emp details based on dept
        Map<Integer, List<Employee>> empListBasedOnDept= empList.stream().collect(Collectors.groupingBy(Employee::getDeptId));
        empListBasedOnDept.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + " ---- " + entry.getValue());
        });
        System.out.println();

        // print dept count
        Map<Integer, Long> empCount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        empCount.entrySet().forEach(entry -> {
            System.out.println("Count with dept id " + entry.getKey() + " ----- " + entry.getValue());
        });

        // print active inactive
        long activeCount  = empList.stream().filter(e -> "active".equals(e.getStatus())).count();
        long inactiveCount = empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
        System.out.println();
        System.out.println("Active count"+activeCount);
        System.out.println("InActive count"+inactiveCount);

    }
}
