package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Listnama extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        //selesai ngatur data dari adapter, kemudian di tempel ke Recyclerview nya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Listnama.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Bayu Saputra", "bayu", "081222777777", "bay@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("Caca Marica", "caca", "081222666666", "budi@gmail.com"));
        mahasiswaArrayList.add(new Mahasiswa("Budi Setyawan", "budi", "0855777777777", "caca@gmail.com"));
    }
}