package com.jyr.springboot.dao;

import com.jyr.springboot.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao {

    void insert(Department department);

    Department getById(Long id);

    void update(Department department);

    void deleteById(Long id);

}
