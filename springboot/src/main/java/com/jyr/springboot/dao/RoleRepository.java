package com.jyr.springboot.dao;

import com.jyr.springboot.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
