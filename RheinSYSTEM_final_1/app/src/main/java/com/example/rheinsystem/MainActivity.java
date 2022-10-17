package com.example.rheinsystem;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Buttons:
        ImageButton btn_video = findViewById(R.id.videobtn);
        // Buttons inside view:
        ImageButton ico_btn_uberUns = findViewById(R.id.ico_btn_uberuns);
        ImageButton ico_btn_wasserkraft = findViewById(R.id.ico_btn_wasserkraft);
        ImageButton ico_btn_prototyp =  findViewById(R.id.ico_btn_prototyp);
        ImageButton ico_btn_kraftwerk =  findViewById(R.id.ico_btn_kraftwerk);
        ImageButton ico_btn_projekte =  findViewById(R.id.ico_btn_projekte);
        ImageButton ico_btn_quiz =  findViewById(R.id.ico_btn_quiz);

        // All the button methods use lambda

        // Video button method:
        btn_video.setOnClickListener(v -> {
            Intent intent_video = new Intent(MainActivity.this, video.class);
            startActivity(intent_video);
        });

        // Button methods:

        ico_btn_uberUns.setOnClickListener(v -> {
            Intent intent_uberuns = new Intent(MainActivity.this, aboutus.class);
            startActivity(intent_uberuns);
        });

        ico_btn_wasserkraft.setOnClickListener(v -> {
            Intent intent_wasserkraft = new Intent(MainActivity.this, hydropower.class);
            startActivity(intent_wasserkraft);
        });

        ico_btn_prototyp.setOnClickListener(v -> {
            Intent intent_prototyp = new Intent(MainActivity.this, hydropower.class);
            startActivity(intent_prototyp);
        });

        ico_btn_kraftwerk.setOnClickListener(v -> {
            Intent intent_kraftwerk = new Intent(MainActivity.this, kraftwerk.class);
            startActivity(intent_kraftwerk);
        });

        ico_btn_projekte.setOnClickListener(v -> {
            Intent intent_projekte = new Intent(MainActivity.this, projects.class);
            startActivity(intent_projekte);
        });

        ico_btn_quiz.setOnClickListener(v -> {
            Intent intent_quiz = new Intent(MainActivity.this, quiz.class);
            startActivity(intent_quiz);
        });

    }
    // Class methods:

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}