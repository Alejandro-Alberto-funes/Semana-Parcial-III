package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VocalU extends AppCompatActivity {
ImageButton reproducir;
MediaPlayer escuchar;
Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_u);
        reproducir=(ImageButton) findViewById(R.id.btnletrau);
        escuchar=MediaPlayer.create(this, R.raw.letra_u);
        reproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escuchar.start();
            }
        });

        volver=(Button)findViewById(R.id.btsalir);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regre= new Intent(VocalU.this, Basico.class);
                startActivity(regre);
            }
        });

    }
}