package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
EditText edtPwd;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtPwd = findViewById(R.id.edtPwd);
        textView = findViewById(R.id.tvLoginId);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
      //toolbar.setTitle(R.string.app_name);
//        toolbar.setTitle("Guard Monitor");
        setSupportActionBar(toolbar);
        //toolbar.setTitle("GRD");
       
    }
}
