package me.xujichang.luggagedelivery.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import me.xujichang.luggagedelivery.entity.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabases extends RoomDatabase {
    private static volatile AppDatabases INSTANCE;

    public abstract UserDao mUserDao();

    public static AppDatabases getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabases.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabases.class, "db_luggage_delivery.db")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
