package com.ahmadsolehin.SUSAHCRUDNIE.repository;

/**
 * Created in Eclipse IDE.
 * Project : Employee-CRUD-in-Spring-Boot-master
 * User: yash
 * Date: 18/01/2020
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ahmadsolehin.SUSAHCRUDNIE.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByNameContaining(String q);

}