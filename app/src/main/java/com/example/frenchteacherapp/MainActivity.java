package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public  void saycolour(View view){
        Button c_btn = (Button) view;
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                getResources().getIdentifier(
                        c_btn.getTag().toString(),
                        "raw",
                        getPackageName()

                )
        );
        mediaPlayer.start();

    }
}