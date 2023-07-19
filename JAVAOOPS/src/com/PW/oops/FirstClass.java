package com.PW.oops;

public class FirstClass {
    public static class Student{ // user defined data created
        String name;
        int roll;
        float cgpa;
    }


    public static void changename(Student s){ // Classes are passed by reference {User Defined DataType}
        s.name = "sharma";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Aditya";
        s1.roll=3512;
        s1.cgpa = 7.47f;

        System.out.println("Name : "+s1.name+ " \nRoll no : "+s1.roll+" \nCGPA : "+s1.cgpa);

        // we can create class inside main fxn but its scope is within main
        changename(s1);
        System.out.println("Name : "+s1.name+ " \nRoll no : "+s1.roll+" \nCGPA : "+s1.cgpa);
        Student s2 = new Student();
        System.out.println("Name : "+s2.name+ " \nRoll no : "+s2.roll+" \nCGPA : "+s2.cgpa);

    }
}


//for using class in diff package, we have to import that package containing class
// Access modifier : public - all package , private - within class, default - same package