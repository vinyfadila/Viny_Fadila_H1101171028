package com.example.vinyfadila_h1101171028;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vinyfadila_h1101171028.R;

public class intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);
    }
    public void synintent (View view){
        Intent intent = new Intent(this,synintent.class);
        startActivity(intent);
    }
    public void Linkservice(View view) {
        Intent link2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals"));
        startActivity(link2);
    }

}


