package com.chentong.irunner_android;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Runrecord.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RunrecordDao runRecordDao();

    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "run_database")
                    .build();
        }
        return instance;
    }
}

