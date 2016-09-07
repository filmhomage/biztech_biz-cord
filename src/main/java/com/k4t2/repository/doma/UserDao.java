package com.k4t2.repository.doma;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.k4t2.model.User;

@Dao
@ConfigAutowireable
public interface UserDao {
    @Select
    public List<User> selectAll();
    @Insert
    public int insert(User user);
    @Select
    public User selectById(String id);
}
