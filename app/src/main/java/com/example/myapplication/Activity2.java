package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.ContentView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString( "a");
        String pass = bundle.getString( "b");
        txEmail.setText(email);
        txPassword.setText(pass);

    }
}