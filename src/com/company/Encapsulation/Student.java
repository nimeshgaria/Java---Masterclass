package com.company.Encapsulation;
// Encapsulation is just using setters and getters
public class Student {
    private String name;
    private int rollNo ;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public int getRollNo()
    {
        return rollNo;
    }
}
class Teacher{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nimesh");
        student.setRollNo(21);
        System.out.println(student.getName());
        System.out.println(student.getRollNo());
    }
}
