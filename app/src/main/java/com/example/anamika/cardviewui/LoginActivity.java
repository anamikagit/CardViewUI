package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class LoginActivity extends AppCompatActivity{

    @butterknife.BindView(R.id.edtPwd) EditText edtPwd;
    @butterknife.BindView(R.id.tvLoginId) TextView textView;
    @butterknife.BindView(R.id.loginBtn) TextView loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = findViewById(R.id.toolbar);

        butterknife.ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        Intent i = new Intent(LoginActivity.this , MainActivity.class);

       // android.content.Intent intent = new in
       // android.content.Intent intent = new android.content.Intent(this, MainActivity.class);
    }
}
