package com.example.demo.services;

import com.example.demo.entity.Department;

public interface DepartmentService {
    Department save(Department department);
    Department update(Department department);
    Department getDepartmentById(Long id);
    void delete(Long id);
}
