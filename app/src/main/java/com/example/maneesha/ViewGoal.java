package com.example.maneesha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewGoal extends AppCompatActivity {

    private ArrayList<GoalItem> goalLst;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_goal);

        recyclerView = findViewById(R.id.goalTools);
        goalLst = new ArrayList<>();

        setMedInfo();
        seAdapter();
    }

    private void seAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(goalLst);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(lm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setMedInfo() {
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
        goalLst.add(new GoalItem("Do My Maths Works"));
    }
}