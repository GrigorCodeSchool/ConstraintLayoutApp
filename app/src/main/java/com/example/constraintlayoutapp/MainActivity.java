package com.example.constraintlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSignUp;
    private TextView tvAlreadyHaveAccaount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignUp=findViewById(R.id.btn_sign_in);
        tvAlreadyHaveAccaount=findViewById(R.id.tv_agree_conditions);
        btnSignUp.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_sign_in:
                Intent intent=new Intent(this,SignInActivity.class);
                startActivity(intent);

            case R.id.tv_agree_conditions:
                Intent intent1=new Intent(this,LoginActivity.class);
                startActivity(intent1);
        }

    }
}
