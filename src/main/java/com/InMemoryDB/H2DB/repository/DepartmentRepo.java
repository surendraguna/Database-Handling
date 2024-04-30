package com.InMemoryDB.H2DB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.InMemoryDB.H2DB.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

    List<Department> findByDepartmentName(String name);

    List<Department> findByDepartmentNameIgnoreCase(String name); 

} 
