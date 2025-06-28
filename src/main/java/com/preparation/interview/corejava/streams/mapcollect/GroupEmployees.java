package com.preparation.interview.corejava.streams.mapcollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> employeeList = generateEmployeeList();
        Map<Gender, List<String>> employeeGenderGroupNameMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.printf("Employee Gender Group Map : %s", employeeGenderGroupNameMap);
        System.out.println();
        Map<Gender, List<Employee>> employeeGenderGroupMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toCollection(ArrayList::new)));
        System.out.printf("Employee Gender Group Map : %s", employeeGenderGroupMap);
    }

    private static List<Employee> generateEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sangeeth", 34, Gender.MALE));
        employeeList.add(new Employee("Shraavan", 6, Gender.MALE));
        employeeList.add(new Employee("Shwetha", 34, Gender.FEMALE));
        employeeList.add(new Employee("Adarsh", 31, Gender.MALE));
        employeeList.add(new Employee("Deepa", 60, Gender.FEMALE));
        return employeeList;
    }
}


class Employee {
    private String name;
    private int age;
    private Gender gender;

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

enum Gender {
    MALE,
    FEMALE
}