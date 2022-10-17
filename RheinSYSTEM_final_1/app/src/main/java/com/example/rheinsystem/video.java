package com.example.rheinsystem;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        // Video settings
        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.rheinsysvideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        ImageButton btn_return = findViewById(R.id.btn_return);
        videoView.start(); // On create, the video starts without having to click on it.
        btn_return.setOnClickListener(v -> {
            Intent intent_main = new Intent(video.this, MainActivity.class);
            startActivity(intent_main);
        });

    }
}