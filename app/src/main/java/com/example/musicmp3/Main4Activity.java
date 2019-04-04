package com.example.musicmp3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class Main4Activity extends AppCompatActivity {
    Button btntrangchu,btnmp3,btnmp4;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlip);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);
        btntrangchu = (Button) findViewById(R.id.imagebt);
        btnmp3 = (Button) findViewById(R.id.imagebt1);
        btnmp4 = (Button) findViewById(R.id.imagebt2);

        btntrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
        btnmp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        //enable back home
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}