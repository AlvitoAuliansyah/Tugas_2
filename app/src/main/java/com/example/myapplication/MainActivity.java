package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonMasuk;
    EditText edEmail,edPassword;
    TextView tHasil;
    String mail,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail = findViewById(R.id.editEmail);
        edPassword = findViewById(R.id.editPwd);
        buttonMasuk = findViewById(R.id.MasukBtn);
        tHasil = findViewById(R.id.textHasil);

        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail = edEmail.getText().toString();
                pwd = edPassword.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                         "Email anda: "+mail+" dan Password: "+pwd+"", Toast.LENGTH_LONG);
                t.show();

                String email="Alv@gmail.com";
                String pass="123";

                if(mail.equals(email) && pwd.equals(pass)) {
                    t = Toast.makeText(getApplicationContext(),
                            "Email dan Password benar", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!mail.equals(email) && pwd.equals(pass)) {
                    t = Toast.makeText(getApplicationContext(),
                            "Email salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(mail.equals(email) && !pwd.equals(pass)) {
                    t = Toast.makeText(getApplicationContext(),
                            "Password salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    t = Toast.makeText(getApplicationContext(),
                            "Email dan Password salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });

        }
    }