package com.example.anamika.cardviewui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @butterknife.BindView(R.id.edtPwd) EditText edtPwd;
    @butterknife.BindView(R.id.tvLoginId) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = findViewById(R.id.toolbar);

        butterknife.ButterKnife.bind(this);
        setSupportActionBar(toolbar);

    }
}
