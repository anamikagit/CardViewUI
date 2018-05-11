package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity{

    @BindView(R.id.edtPwd) EditText edtPwd;
    @BindView(R.id.tvLoginId) TextView textView;
    @BindView(R.id.loginBtn) TextView loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = findViewById(R.id.toolbar);

        butterknife.ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}
