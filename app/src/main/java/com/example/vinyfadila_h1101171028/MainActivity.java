package com.example.vinyfadila_h1101171028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vinyfadila_h1101171028.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity (View view){
        Intent intent = new Intent(this, activity.class);
        startActivity(intent);
    }

    public void service(View view){
        Intent intent = new Intent(this, service.class);
        startActivity(intent);
    }

    public void content(View view){
        Intent intent = new Intent(this, cp.class);
        startActivity(intent);
    }

    public void broadcast(View view){
        Intent intent = new Intent(this, br.class);
        startActivity(intent);
    }

    public void intent(View view){
        Intent intent = new Intent(this,intent.class);
        startActivity(intent);
    }
}
