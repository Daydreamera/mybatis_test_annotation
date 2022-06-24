package com.datayes.dao;

import com.datayes.domain.Author;
import com.datayes.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface UserDao {
    /**
     * 查询所有操作
     */
    @Select("select * from user ")
    List<User> findAll();

    @Select("select userName from user")
    String findName();
}
