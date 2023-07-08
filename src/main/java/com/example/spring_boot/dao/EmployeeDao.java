package com.example.spring_boot.dao;

import com.example.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployee();

    Employee getEmployeeById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
