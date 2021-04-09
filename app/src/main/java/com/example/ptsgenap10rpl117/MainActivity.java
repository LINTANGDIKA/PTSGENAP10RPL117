package com.example.ptsgenap10rpl117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText masuk;
    EditText password;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk = (EditText)findViewById(R.id.masuk);
        password = (EditText)findViewById(R.id.password);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = masuk.getText().toString();
                String ps = password.getText().toString();
                if(email.equalsIgnoreCase("admin@gmail.com")
                        && ps.equalsIgnoreCase("123456")){
                    Toast.makeText(MainActivity.this, "Anda Berhasil Masuk", Toast.LENGTH_SHORT).show();
                    Intent user = new Intent( MainActivity.this, MainUser.class);
                    startActivity(user);

                }else {
                    Toast.makeText(MainActivity.this,"Nama Pengguna/Email/ Nomor atau Password Salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}