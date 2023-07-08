package com.example.spring_boot.service;


import com.example.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getEmployeeById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
