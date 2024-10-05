package com.chentong.irunner_android;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "run_records")
public class Runrecord {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private float distance; // 跑步距离
    private long time; // 跑步时间（毫秒）

    public Runrecord(float distance, long time) {
        this.distance = distance;
        this.time = time;
    }

    // Getters 和 Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public float getDistance() { return distance; }
    public long getTime() { return time; }
}
