package com.chentong.irunner_android;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface RunrecordDao {
    @Insert
    void insert(Runrecord record);

    @Query("SELECT * FROM run_records ORDER BY id DESC")
    List<Runrecord> getAllRecords();
}
