package com.example.demo.nosql;

import com.example.demo.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {
}
