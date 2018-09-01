package com.example.katiuskagonzalez.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;

    private RecyclerView.Adapter adapter;

    private RecyclerView.LayoutManager Manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         List items = new ArrayList();
    items.add(new Vehiculos( "Honda" , "Honda"));

        items.add(new Vehiculos( "Honda" , " Japon"));
        items.add(new Vehiculos( "Honda" , " Suiza"));
        items.add(new Vehiculos( "Honda" , "R.D"));

        recycler = (RecyclerView) findViewById(R.id.my_recycler_view);

        Manager = new LinearLayoutManager( this);
        recycler.setLayoutManager(Manager);

        adapter = new MyRecyclerAdapter(items,this);
        recycler.setAdapter(adapter);




    }
}
