package me.xujichang.luggagedelivery.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import me.xujichang.luggagedelivery.entity.User;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(User pUser);

    @Query("SELECT * FROM user WHERE userid == :pLoginUserId")
    User getUser(long pLoginUserId);
}
