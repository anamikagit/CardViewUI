package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
EditText edtPwd;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtPwd = findViewById(R.id.editTextPwd);
        textView = findViewById(R.id.textViewText);
    }
}
