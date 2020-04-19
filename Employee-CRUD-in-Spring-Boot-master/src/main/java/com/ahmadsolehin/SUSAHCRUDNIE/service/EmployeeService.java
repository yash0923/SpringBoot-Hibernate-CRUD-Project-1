package com.ahmadsolehin.SUSAHCRUDNIE.service;
import java.util.List;
import com.ahmadsolehin.SUSAHCRUDNIE.model.Employee;
/**
 * Created in Eclipse IDE.
 * Project : Employee-CRUD-in-Spring-Boot-master
 * User: yash
 * Date: 18/01/2020
 */
public interface EmployeeService {
    Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(int id);

    void save(Employee contact);

    void delete(int id);
}