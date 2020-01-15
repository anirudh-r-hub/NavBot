package com.example.navbot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends Fragment {

    RecyclerView recyclerView;
    List<Model> myList;
    RecyclerView.Adapter adapter;
    @Override
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myList.add(new Model(R.drawable.virat,"Virat Kohli","RightHand Batsmen(Captain)"));
        myList.add(new Model(R.drawable.rohit,"Rohit Sharma","RightHand Batsmen(Vice-Captain)"));
        myList.add(new Model(R.drawable.dhawan,"Shikhar Dhawan","LeftHand Batsmen"));
        myList.add(new Model(R.drawable.rahul,"Lokesh Rahul","RightHand Batsmen"));
        myList.add(new Model(R.drawable.dhoni,"MS DHONI","RightHand Batsmen"));
        myList.add(new Model(R.drawable.jadeja,"Ravindra Jadeja","LeftHand Batsmen"));
        myList.add(new Model(R.drawable.bhuvi,"Bhuveshnar Kumar","Medium-pace Bowler"));
        myList.add(new Model(R.drawable.shami,"Mohhammad Shammi","Fast Bowler"));
        myList.add(new Model(R.drawable.chahal,"Yuzvendra Chahal","Wrist Spinner"));
        myList.add(new Model(R.drawable.bhumrah,"Jasprit Bhumrah","Medium-pace Bowler"));
        myList.add(new Model(R.drawable.saini,"Navdeep Saini","Fast Bowler"));
        adapter = new MyAdapter(myList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }*/
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        View view = inflater.inflate(R.layout.activity_main2,container,false);
        myList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myList.add(new Model(R.drawable.virat,"Virat Kohli","RightHand Batsmen(Captain)"));
        myList.add(new Model(R.drawable.rohit,"Rohit Sharma","RightHand Batsmen(Vice-Captain)"));
        myList.add(new Model(R.drawable.dhawan,"Shikhar Dhawan","LeftHand Batsmen"));
        myList.add(new Model(R.drawable.rahul,"Lokesh Rahul","RightHand Batsmen"));
        myList.add(new Model(R.drawable.dhoni,"MS DHONI","RightHand Batsmen"));
        myList.add(new Model(R.drawable.jadeja,"Ravindra Jadeja","LeftHand Batsmen"));
        myList.add(new Model(R.drawable.bhuvi,"Bhuveshnar Kumar","Medium-pace Bowler"));
        myList.add(new Model(R.drawable.shami,"Mohhammad Shammi","Fast Bowler"));
        myList.add(new Model(R.drawable.chahal,"Yuzvendra Chahal","Wrist Spinner"));
        myList.add(new Model(R.drawable.bhumrah,"Jasprit Bhumrah","Medium-pace Bowler"));
        myList.add(new Model(R.drawable.saini,"Navdeep Saini","Fast Bowler"));
        adapter = new MyAdapter(myList,view.getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }


}
