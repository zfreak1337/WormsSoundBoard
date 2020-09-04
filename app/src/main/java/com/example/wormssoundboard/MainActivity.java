package com.example.wormssoundboard;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button polishworm;
    Button cyberworm;
    Button kamikazeworm;
    Button wackyworms;
    Button sergantworms;
    Button rusworm;
    Button engworm;
    Button dutchworm;
    Button geezer;
    Button italianworm;
    Button spanishworm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polishworm = findViewById(R.id.polishworm);
        polishworm.setOnClickListener(this);
        cyberworm = findViewById(R.id.cyberworm);
        cyberworm.setOnClickListener(this);
        kamikazeworm = findViewById(R.id.kamikazeworm);
        kamikazeworm.setOnClickListener(this);
        wackyworms = findViewById(R.id.wackyworms);
        wackyworms.setOnClickListener(this);
        sergantworms = findViewById(R.id.sergantworms);
        sergantworms.setOnClickListener(this);
        rusworm = findViewById(R.id.rusworm);
        rusworm.setOnClickListener(this);
        engworm = findViewById(R.id.engworm);
        engworm.setOnClickListener(this);
        dutchworm = findViewById(R.id.dutchworm);
        dutchworm.setOnClickListener(this);
        geezer = findViewById(R.id.geezer);
        geezer.setOnClickListener(this);
        italianworm = findViewById(R.id.italianworm);
        italianworm.setOnClickListener(this);
        spanishworm = findViewById(R.id.spanishworms);
        spanishworm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.polishworm:
                Intent intent = new Intent(this, polish.class);
                startActivity(intent);
                break;
            case R.id.cyberworm:
                intent = new Intent(this,cyberworm.class);
                startActivity(intent);
                break;
            case R.id.kamikazeworm:
                intent = new Intent(this,kamikazeworm.class);
                startActivity(intent);
                break;
            case R.id.wackyworms:
                intent = new Intent(this,wackyworms.class);
                startActivity(intent);
                break;
            case R.id.sergantworms:
                intent = new Intent(this, sergantworms.class);
                startActivity(intent);
                break;
            case R.id.rusworm:
                intent = new Intent(this, rusworm.class);
                startActivity(intent);
                break;
            case  R.id.engworm:
                intent = new Intent(this, engworm.class);
                startActivity(intent);
                break;
            case  R.id.dutchworm:
                intent = new Intent(this, dutchworm.class);
                startActivity(intent);
                break;
            case  R.id.geezer:
                intent = new Intent(this, geezer.class);
                startActivity(intent);
                break;
            case  R.id.italianworm:
                intent = new Intent(this, italianworm.class);
                startActivity(intent);
                break;
            case R.id.spanishworms:
                intent = new Intent(this, spanishworm.class);
                startActivity(intent);
                break;
        }

    }
}







