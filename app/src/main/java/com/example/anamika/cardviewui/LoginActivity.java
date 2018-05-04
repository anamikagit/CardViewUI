package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {
EditText edtPwd;
TextView textView;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtPwd = findViewById(R.id.edtPwd);
        textView = findViewById(R.id.tvLoginId);
        toolbar = findViewById(R.id.toolbar);
      //toolbar.setTitle(R.string.app_name);
//        toolbar.setTitle("Guard Monitor");
       
    }
}
