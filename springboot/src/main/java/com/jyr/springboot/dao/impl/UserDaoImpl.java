package com.jyr.springboot.dao.impl;

import com.jyr.springboot.dao.UserDao;
import com.jyr.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User user) {
        String sql = "INSERT INTO USER(NAME,age,birthday) VALUES(?,?,?)";
        return this.jdbcTemplate.update(
                sql,
                user.getName(),
                user.getAge(),
                user.getBirthday()
        );
    }

    @Override
    public int deleteById(Long id) {
        String sql = "delete from user where id = ?";
        return this.jdbcTemplate.update(sql,id);
    }

    @Override
    public int update(User user) {
        String sql = "update user set age = ? where id = ?";
        return this.jdbcTemplate.update(
                sql,
                user.getAge(),
                user.getId()
        );
    }

    @Override
    public User getById(Long  id) {
        String sql = "select * from user where id = ?";
        return this.jdbcTemplate.queryForObject(sql, new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setBirthday(rs.getDate("birthday"));
                return user;
            }

        },id);
    }
}
