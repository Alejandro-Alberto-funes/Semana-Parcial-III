package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VocalO extends AppCompatActivity {
ImageButton reproducir;
MediaPlayer mpaudio;
Button salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_o);
        reproducir=(ImageButton) findViewById(R.id.btnletrao);
        mpaudio= MediaPlayer.create(this, R.raw.letra_o);
        reproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpaudio.start();
            }
        });
        salir=(Button)findViewById(R.id.btvolver);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regre= new Intent(VocalO.this, Basico.class);
                startActivity(regre);
            }
        });
    }
}