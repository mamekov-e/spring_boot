package com.example.spring_boot.dao;

import com.example.spring_boot.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private EntityManager entityManager;

    public List<Employee> getAllEmployee() {
//        Session session = entityManager.unwrap(Session.class);
//        return session.createQuery("from Employee", Employee.class).getResultList();

        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    public Employee getEmployeeById(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        return session.get(Employee.class, id);
        return entityManager.find(Employee.class, id);
    }

    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    public void deleteEmployeeById(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
//        session.delete(employee);
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
