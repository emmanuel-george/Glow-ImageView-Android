package com.george.sliceoflife.gloweffectexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.george.sliceoflife.gloweffectexample.adapter.MarvelAdaper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MarvelAdaper adaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<Integer> marvels = new ArrayList<>();
        marvels.add(R.drawable.blackwido);
        marvels.add(R.drawable.iromnam);
        marvels.add(R.drawable.hulk);
        marvels.add(R.drawable.ca);
        marvels.add(R.drawable.sm);
        marvels.add(R.drawable.thor);
        marvels.add(R.drawable.deadpool);

        adaper = new MarvelAdaper(marvels, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adaper);

    }
}