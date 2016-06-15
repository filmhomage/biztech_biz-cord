package com.k4.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.k4.entity.User;

@Dao
@ConfigAutowireable
public interface UserDao {
    @Select
    public List<User> selectAll();
    @Insert
    public int insert(User user);
}
