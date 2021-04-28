package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainUser extends AppCompatActivity {

    UserAdapter userAdapter;
    RecyclerView recyclerView;
    private ArrayList<User> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);

        recyclerView = (RecyclerView) findViewById(R.id.listuser);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainUser.this));

        userAdapter =  new UserAdapter(this, getlist(), new UserAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent move = new Intent(getApplicationContext(),DetailUser.class);
                User myuser = userlist.get(position);
                move.putExtra("namaLengkap",myuser.getNamaLengkap());
                move.putExtra("noTelp",myuser.getNotelp());
                move.putExtra("pelajar",myuser.getPelajar());
                move.putExtra("image",myuser.getImage());
                startActivity(move);
            }
        });
        recyclerView.setAdapter(userAdapter);
    }



//    private void myList() {
//        List<User> userlist = Arrays.asList(new User("Lintang","088888888","Pelajar",R.drawable.ic_baseline_person_24));
//
//    }

    private ArrayList<User> getlist () {

        userlist = new ArrayList<>();

        userlist.add(new User("Lintang","0888888888","Pelajar","https://i.pinimg.com/originals/51/1b/c9/511bc9a06fca1d0676303bbfe7293983.jpg"));
        userlist.add(new User("Testing","0888888888","Pelajar","https://i.pinimg.com/originals/51/1b/c9/511bc9a06fca1d0676303bbfe7293983.jpg"));
//        User list = new User();
//        list.setNamaLengkap("Lintang");
//        list.setPelajar("Pelajar");
//        list.setNotelp("08888888888");
//        list.setImage(R.drawable.ic_baseline_person_24);
//        userlist.add(list);
//
//        list = new User();
//        list.setNamaLengkap("Dika");
//        list.setPelajar("Pelajar");
//        list.setNotelp("077777777777777");
//        list.setImage(R.drawable.ic_baseline_person_24);
//        userlist.add(list);



        return userlist;
    }




}