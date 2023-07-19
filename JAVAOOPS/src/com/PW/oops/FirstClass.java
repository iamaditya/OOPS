package com.PW.oops;

public class FirstClass {
    public static class Student{ // user defined data created
        String name;
        int roll;
        float cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Aditya";
        s1.roll=3512;
        s1.cgpa = 7.47f;

        System.out.println("Name : "+s1.name+ " \nRoll no : "+s1.roll+" \nCGPA : "+s1.cgpa);
    }
}
