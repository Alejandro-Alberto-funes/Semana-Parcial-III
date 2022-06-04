package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Vocal_I extends AppCompatActivity {
Button btatras;
MediaPlayer mpaudio;
ImageButton reproducir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_i);
        btatras=(Button)findViewById(R.id.btatrás);
        mpaudio=MediaPlayer.create(this,R.raw.letra_i);
        btatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent at= new Intent(Vocal_I.this, Basico.class);
                startActivity(at);
            }
        });
        reproducir=(ImageButton) findViewById(R.id.btnletrai);
        reproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpaudio.start();
            }
        });
    }
}