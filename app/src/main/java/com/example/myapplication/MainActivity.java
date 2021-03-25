package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonMasuk;
    EditText edEmail, edPassword;
    TextView tHasil;
    String mail, pwd;

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
            public void onClick(View view) {
                mail = edEmail.getText().toString();
                pwd = edPassword.getText().toString();

                String email = "Alv@gmail.com";
                String pass = "123";

                if (mail.isEmpty() || pwd.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi!!!",
                            Toast.LENGTH_LONG);
                    t.show();
                } else {
                    if (mail.equals(email) && pwd.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();
                        b.putString("a", mail.trim());
                        b.putString("b", mail.trim());
                        Intent i = new Intent(getApplicationContext(), Activity2.class);
                        i.putExtras(b);
                        startActivity(i);
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });
    }
}