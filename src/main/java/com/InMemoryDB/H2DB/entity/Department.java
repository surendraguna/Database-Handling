package com.InMemoryDB.H2DB.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;

    @NotBlank(message = "Department Name is mandatory")
    /*@Length(min = 3, max = 20, message = "Department Name should be between 3 to 20 characters")
    @Size(min = 3, max = 20, message = "Department Name should be between 3 to 20 characters")
    @Column(name = "department_name")
    @Positive(message = "Department Name should be positive")
    @Future(message = "Department Name should be in future")
    @FutureOrPresent(message = "Department Name should be in future or present")
    @Past(message = "Department Name should be in past")
    @PastOrPresent(message = "Department Name should be in past or present")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Department Name should be alphanumeric")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Department Name should be alphabetic")
    @Pattern(regexp = "^[0-9]+$", message = "Department Name should be numeric")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Department Name should be alphabetic with space")
    @Pattern(regexp = "^[0-9\\s]+$", message = "Department Name should be numeric with space")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Department Name should be alphanumeric with space")
    @Pattern(regexp = "^[a-zA-Z0-9\\s\\W]+$", message = "Department Name should be alphanumeric with space and special characters")
    @Pattern(regexp = "^[a-zA-Z0-9\\s\\W&&[^_]]+$", message = "Department Name should be alphanumeric with space and special characters excluding underscore") */
    private String departmentName;
    private int departmentCode;
    private String departmentHead;
    public Department() {
    }
    // public int getDepartmentId() {
    //     return departmentId;
    // }
    // public void setDepartmentId(int departmentId) {
    //     this.departmentId = departmentId;
    // }
    // public String getDepartmentName() {
    //     return departmentName;
    // }
    // public void setDepartmentName(String departmentName) {
    //     this.departmentName = departmentName;
    // }
    // public int getDepartmentCode() {
    //     return departmentCode;
    // }
    // public void setDepartmentCode(int i) {
    //     this.departmentCode = i;
    // }
    // public String getDepartmentHead() {
    //     return departmentHead;
    // }
    // public void setDepartmentHead(String departmentHead) {
    //     this.departmentHead = departmentHead;
    // }
    
}
