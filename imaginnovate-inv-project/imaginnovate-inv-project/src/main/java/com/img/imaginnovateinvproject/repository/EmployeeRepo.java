package com.img.imaginnovateinvproject.repository;

import com.img.imaginnovateinvproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
