package com.example.demo.dao;

import com.example.demo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao {

    public void insert(Department department);

    public Department getById(Long id);

    public void update(Department department);

    public void deleteById(Long id);

}
