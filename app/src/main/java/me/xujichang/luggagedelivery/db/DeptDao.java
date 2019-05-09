package me.xujichang.luggagedelivery.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import me.xujichang.luggagedelivery.entity.Dept;

@Dao
public interface DeptDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addDepts(List<Dept> pDepts);

    @Query("SELECT * FROM dept WHERE id ==:id")
    LiveData<Dept> getDept(long id);

    @Query("SELECT * FROM dept")
    LiveData<List<Dept>> getAllDept();
}
