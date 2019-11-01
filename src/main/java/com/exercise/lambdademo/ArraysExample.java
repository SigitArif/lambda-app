package com.exercise.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {
    public static void main(String[] args){

        Employee[] employees  = {
            new Employee("David"),
            new Employee("Naveen"),
            new Employee("Alex"),
            new Employee("Richard")};
        // 1 Sorting
        System.out.println("Before Sorting Names: "+Arrays.toString(employees));
        Arrays.sort(employees, Employee::nameCompare);
        System.out.println("After Sorting Names "+Arrays.toString(employees));
        
    }
     
    }
    class Employee {
        String name;
        
        Employee(String name) {
          this.name = name;
        }
        
        public static int nameCompare(Employee a1, Employee a2) {
          return a1.name.compareTo(a2.name);
        }
          
        public String toString() {
          return name;
        }
}