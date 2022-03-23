package com.example.lesson35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NameAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        ArrayList<String> names = new ArrayList<>();
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        names.add("ALMAZ");
        adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}