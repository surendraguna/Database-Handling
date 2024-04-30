package com.InMemoryDB.H2DB.service;

import java.util.List;

import com.InMemoryDB.H2DB.entity.Department;
import com.InMemoryDB.H2DB.error.DeptNotFound;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getDepartment();

    String updateDepartment(Department departmet);

    List<Department> saveAllDepartment(List<Department> department);

    Department getDepartmentById(int id) throws DeptNotFound;

    String deleteDepartmentById(int id);

    String departmentUpdate(int id, Department departmet);

    void deleteDepartment();

    List<Department> fetchByDeptName(String name);

}
