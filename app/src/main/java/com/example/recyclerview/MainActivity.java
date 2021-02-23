package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTest;
    RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTest = findViewById(R.id.rv_test);

        // Layout Manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvTest.setLayoutManager(layoutManager);

        // Adapter

        adapter = new RvAdapter();
        rvTest.setAdapter(adapter);

    }
}