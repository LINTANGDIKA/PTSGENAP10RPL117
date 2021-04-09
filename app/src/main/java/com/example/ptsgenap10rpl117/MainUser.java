package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainUser extends AppCompatActivity {

    UserAdapter userAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);

        recyclerView = (RecyclerView) findViewById(R.id.listuser);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainUser.this));

        userAdapter =  new UserAdapter(this , getlist() );
        recyclerView.setAdapter(userAdapter);
    }



//    private void myList() {
//        List<User> userlist = Arrays.asList(new User("Lintang","088888888","Pelajar",R.drawable.ic_baseline_person_24));
//
//    }

    private ArrayList<User> getlist () {
        ArrayList<User> userlist = new ArrayList<>();

        User list = new User();
        list.setNamaLengkap("Lintang");
        list.setPelajar("Pelajar");
        list.setNotelp("08888888888");
        list.setImage(R.drawable.ic_baseline_person_24);
        userlist.add(list);

        return userlist;
    }




}