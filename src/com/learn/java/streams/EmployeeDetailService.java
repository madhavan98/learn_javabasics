package com.learn.java.streams;

import java.util.List;
import java.util.Objects;

public class EmployeeDetailService {

   private Employee highestPaidEmployee(List<Employee> employees, String department) {
    
    if(Objects.isNull(department)) {
         return employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }

    return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }   

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("John", 1, "IT", 50000),
                new Employee("Jane", 2, "HR", 60000),
                new Employee("Mike", 3, "Finance", 70000),
                new Employee("Emily", 4, "IT", 80000)
        );

        EmployeeDetailService service = new EmployeeDetailService();
        Employee highestPaidEmployee = service.highestPaidEmployee(employees, "IT");    
        System.out.println("Highest Paid Employee in IT Department: " + highestPaidEmployee);
        Employee highestPaidEmployeeAll = service.highestPaidEmployee(employees, null); 
        System.out.println("Highest Paid Employee in All Departments: " + highestPaidEmployeeAll);
        
    }
}
