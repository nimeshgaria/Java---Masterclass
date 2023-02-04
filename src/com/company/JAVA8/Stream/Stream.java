package com.company.JAVA8.Stream;

import com.company.JAVA8.Stream.Imp.Employee;
import com.company.JAVA8.StudentDetails;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    static List<Integer> integerList = Arrays.asList(4,6,3,1,9); // immutable as Arrays.asList is immutable in nature.
    static  List<String> stringsList2 = Arrays.asList("Nim", "Rajesh", "Pan", "Anku");
    public static void square(){
        integerList.stream().map(n -> n*n).forEach(System.out::println);
    }
    public static void filterSqAbove100(){
        integerList.stream().map(n -> n*n).filter(n -> n >= 16).forEach(System.out::println);
    }

    //filters acc to length of string
    public static void filterString(){
        List<String> stringList = Arrays.asList("Nim", "Rajesh", "Pan", "Anku");
        stringList.stream().filter(n-> n.length() > 2 && n.length() < 6).forEach(b-> System.out.println(b));
    }

    public static void notNullString(){
        List<String> stringList = Arrays.asList("Nim", null, null, null);
        stringList.stream().filter(n-> n != null).forEach(b-> System.out.println(b));
    }
    public static void comparatorStreamExample(){
       Integer maxInteger = integerList.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Max " +maxInteger);
    }
    public static void usingObject(){
        List<StudentDetails> a = new ArrayList<>();
        a.add(new StudentDetails("qw",3,3));
        a.add(new StudentDetails("we",654,1));
        List<StudentDetails> b= a.stream().sorted().collect(Collectors.toList());
        /*b.add("qw");
        b.add("w");
        b.add("a");*/
        //b.stream().sorted().collect(Collectors.toList());
        System.out.println(b);
    }

    public static void objectStreamMethods(){
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(1,"yash",3 , "active",150));
        employees.add(new Employee(3,"qara",3 , "active",250));
        employees.add(new Employee(2,"polo",3 , "active",350));

        employees.stream().filter(p-> p.getSalary() > 200).forEach(s-> System.out.println(s.getSalary()));
    }
    public static void simpleStream(){
        List<String> stringList = new ArrayList<>();
        stringList.add("z");
        stringList.add("p");
        stringList.add("bv");
        stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(stringList);
    }

    public static void mapMethods(){
        //converts to uppercase
        stringsList2.stream().map(e-> e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        stringsList2.stream().map(e -> e.length()).forEach(System.out::print);
        System.out.println();
        List<Integer> integerList1 = integerList.stream().map(n-> n*2).collect(Collectors.toList());
        System.out.println(integerList1);
    }

    // filter and map combination
     public static  void filterMapCombo(){
         List<Employee> employees  = new ArrayList<>();
         employees.add(new Employee(1,"yash",3 , "active",150));
         employees.add(new Employee(3,"qara",3 , "active",250));
         employees.add(new Employee(2,"polo",3 , "active",350));
         List<Integer> employeeSalary=employees.stream().filter(e-> e.getSalary() > 200).map(e -> e.getSalary()).collect(Collectors.toList());
         System.out.println(employeeSalary);
     }
     public static void reduceExample(){
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
       Optional<String> reduceList =  stringList.stream().reduce((value, combinedValue) ->{
            return combinedValue + value; // A +B
        });
         System.out.println(reduceList.get());
     }

     public static void distinctCountLimit(){
        List<String> stringList = Arrays.asList("car","bike", "bus", "cab","cab","bus");
        // gives unique elements
        List<String> distinctList = stringList.stream().distinct().collect(Collectors.toList());
         System.out.println(distinctList);

         //count
         long count= stringList.stream().distinct().count();
         System.out.println(count);

         // limit()
         List<String> limitList = stringList.stream().limit(3).collect(Collectors.toList());
         System.out.println(limitList);

    }
    public static void sortedOrder(){
        List<String> stringList = Arrays.asList("car","bike", "bus", "cab","cab","bus");
        List<String> ascStrings = stringList.stream().sorted().collect(Collectors.toList()); // ascending
        List<String> descStrings = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // reverse

        List<Integer>  integerList = Arrays.asList(3,5,7,2);
        List<Integer> ascIntegers = integerList.stream().sorted().collect(Collectors.toList()); // ascending
        List<Integer> descIntegers = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //desc
    }

    public static void matchFindExample(){
        Set<String> fruits = new HashSet<String>();
        fruits.add("One mango");
        fruits.add("One banana");
        fruits.add("Two apples");
        fruits.add("Two grapes");
        //anyMatch
        boolean result = fruits.stream().anyMatch(v-> {return v.startsWith("One");});
        System.out.println(result); // true
        //allMatch
        result = fruits.stream().allMatch(v-> {return v.startsWith("One");});
        System.out.println(result); // true
        //noneMatch
        result = fruits.stream().anyMatch(v-> {return v.startsWith("One");});
        System.out.println(result); //false

        List<String> stringList = Arrays.asList("one", "two", " three");
        Optional<String> el = stringList.stream().findFirst();
        System.out.println(el); //
        System.out.println(el.get()); // one

    //    List<String> finalList = Stream.concat(stringList, stringsList2)
    }
    public static void parallelStream(){
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(1,"yash",3 , "active",150));
        employees.add(new Employee(1,"yash",3 , "active",150));
        employees.add(new Employee(3,"qara",3 , "active",250));
        employees.add(new Employee(2,"polo",3 , "active",350));
        employees.parallelStream().filter(s-> s.getDeptId() >2).limit(2).forEach(System.out::println);
        // or we can convert stream to parallelStream by
        //    employees.stream().parallel()o.filter(s-> s.getDeptId() >2).limit(2).forEach(System.out::println);
        //
    }
    public static void main(String[] args) {
    // simpleStream();
      /*  System.out.println("Simple stream"); simpleStream();
        System.out.println("Square ");square();
        //usingObject();
        System.out.println("Filter above 100");  filterSqAbove100();*/
       /* comparatorStreamExample();
     //   filterString();
        notNullString();
        objectStreamMethods();*/
        mapMethods();
        distinctCountLimit();
        reduceExample();
      /*  String strNim = "nimesh";
        int y = (strNim) -> strNim.length();*/
    }
}
