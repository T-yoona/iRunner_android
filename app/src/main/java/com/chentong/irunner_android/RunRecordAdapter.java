package com.chentong.irunner_android;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class RunRecordAdapter extends RecyclerView.Adapter<RunRecordAdapter.ViewHolder> {
    private List<Runrecord> records;

    public RunRecordAdapter(List<Runrecord> records) {
        this.records = records;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_run_record, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Runrecord record = records.get(position);
        holder.distanceTextView.setText("距离: " + record.getDistance() + "米");
        holder.timeTextView.setText("时间: " + (record.getTime() / 1000) + "秒");
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView distanceTextView;
        TextView timeTextView;

        ViewHolder(View itemView) {
            super(itemView);
            distanceTextView = itemView.findViewById(R.id.distanceTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
        }
    }
}
