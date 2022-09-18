package com.example.maneesha;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.maneesha.GoalItem;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<GoalItem> medList;

    public RecyclerAdapter(ArrayList<GoalItem> medList){
        this.medList = medList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nameText;

        public MyViewHolder(final View v){
            super(v);
            nameText = v.findViewById(R.id.medItm);
        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_goal, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = medList.get(position).getGoalItm();
        holder.nameText.setText(name);
    }

    @Override
    public int getItemCount() {
        return medList.size();
    }


}
