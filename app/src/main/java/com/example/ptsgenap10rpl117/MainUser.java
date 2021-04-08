package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainUser extends AppCompatActivity {

    UserAdapter userAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);

        recyclerView = (RecyclerView) findViewById(R.id.listuser);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userAdapter =  new UserAdapter(this, myList());

    }

    private ArrayList<User> myList() {
        ArrayList<User> userlist = new ArrayList<>();
        User tambah = new User("Lintang", "088888888888","Pelajar", R.drawable.ic_baseline_person_24 );
        return myList();

    }
}