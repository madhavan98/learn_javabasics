package com.learn.java.oops.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDetailService {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 1, "IT");
        Employee emp2 = new Employee("Jane Smith", 2, "HR");
        Employee emp3 = new Employee("John Doe", 1, "IT"); // Duplicate employee
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1); 
        employeeList.add(emp2);
        employeeList.add(emp3);

        Set<Employee> employeeSet = new HashSet<>(employeeList);

        System.out.println("Employee List: " + employeeList.size());
        System.out.println("Employee Set: " + employeeSet.size());
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2)); // false
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3)); // true
    }
}
