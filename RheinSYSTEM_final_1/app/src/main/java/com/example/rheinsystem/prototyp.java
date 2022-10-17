package com.example.rheinsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class prototyp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototyp);
        ImageButton btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(v -> {
            Intent intent_main = new Intent(prototyp.this, MainActivity.class);
            startActivity(intent_main);
        });
    }
}