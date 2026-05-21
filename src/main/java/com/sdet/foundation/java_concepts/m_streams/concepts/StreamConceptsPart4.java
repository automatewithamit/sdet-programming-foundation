package com.sdet.foundation.java_concepts.m_streams.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConceptsPart4 {


    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, 20000, "HR");
        Employee emp2 = new Employee("Bob", 25, 37000,  "IT");
        Employee emp3 = new Employee("Charlie", 35, 80000, "Finance");
        Employee emp4 = new Employee("David", 28, 45000, "IT");
        Employee emp5 = new Employee("Eve", 32, 60000, "HR");
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        filterEmployeesBySalary(employees, 40000);
        getEmployeesByDepartment(employees);    

        Set<String> employeeNames = Set.of("Alice", "Bob", "Charlie", "David", "Eve");
        

    }

    public static void getEmployeesByDepartment(Employee[] employees){
        Map<String, List<Employee>> grouped =
                Arrays.stream(employees)
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        
        grouped.forEach((department, empList) -> {
            System.out.println("Department: " + department);
            empList.forEach(emp -> System.out.println(" - " + emp.getName()));
        });

    }

    public static void filterEmployeesBySalary(Employee[] employees, double salaryThreshold){
        //Using Stream to filter employees based on salary
        Arrays.stream(employees)
                .filter(emp -> emp.getSalary() > salaryThreshold)
                // Filter employees with salary greater than threshold
                .forEach(emp -> System.out.println(emp.getName() + " has a salary greater than " + salaryThreshold)); // Print employee names
    }
}
