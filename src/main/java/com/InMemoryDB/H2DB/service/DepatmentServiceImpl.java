package com.InMemoryDB.H2DB.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InMemoryDB.H2DB.entity.Department;
import com.InMemoryDB.H2DB.error.DeptNotFound;
import com.InMemoryDB.H2DB.repository.DepartmentRepo;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class DepatmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentRepo.findAll();
    }

    @Override
    public void deleteDepartment() {
        departmentRepo.deleteAll();
    }

    @Override
    public String departmentUpdate(int id, Department departmet) {
        if(departmentRepo.existsById(id)){
            Department dept = departmentRepo.findById(id).get();
            dept.setDepartmentId(id);
            if(Objects.nonNull(departmet.getDepartmentName()) && !" ".equalsIgnoreCase(departmet.getDepartmentName())){
                dept.setDepartmentName(departmet.getDepartmentName());
            }
            if(Objects.nonNull(departmet.getDepartmentHead()) && !" ".equalsIgnoreCase(departmet.getDepartmentHead())){
                dept.setDepartmentHead(departmet.getDepartmentHead());
            }
            if(departmet.getDepartmentCode() != 0){
                dept.setDepartmentCode(departmet.getDepartmentCode());
            }
            departmentRepo.save(dept);
            return "Done";
        }
        return "error";
    }

    @Override
    public Department getDepartmentById(int id) throws DeptNotFound {
        Optional<Department> department = departmentRepo.findById(id);
        if(!department.isPresent()){
            throw new DeptNotFound("Department not found "+ id);
        }
        return department.get();
    }

    @Override
    public List<Department> saveAllDepartment(List<Department> department) {
        return departmentRepo.saveAll(department);
    }

    @Override
    public String deleteDepartmentById(int id) {
        if(departmentRepo.existsById(id)){
            departmentRepo.deleteById(id);
            return "Done";
        }
        return "error";
    }

    @Override
    public String updateDepartment(Department departmet) {
        List<Department> departments = departmentRepo.findAll();
        for(Department dept : departments){
            if(departmet.getDepartmentName() != null){
                dept.setDepartmentName(departmet.getDepartmentName());
            }
            if(departmet.getDepartmentHead() != null){
                dept.setDepartmentHead(departmet.getDepartmentHead());
            }
            if(departmet.getDepartmentCode() != 0){
                dept.setDepartmentCode(departmet.getDepartmentCode());
            }
            departmentRepo.save(dept);
        }
        return "done";
    }

    @Override
    public List<Department> fetchByDeptName(String name) {
        return departmentRepo.findByDepartmentNameIgnoreCase(name);
    }
}
