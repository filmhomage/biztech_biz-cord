package com.k4t2.repository.doma;
import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
//import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.k4t2.model.Room;

@Dao
@ConfigAutowireable
public interface RoomDao {
    @Select
    public List<Room> selectRoom();

    @Insert
    public int insertRoom(Room room);
}

