package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_G extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_g);

        ImageButton btnsonidog= findViewById(R.id.btnSonidoG);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.g);
        btnsonidog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirg = findViewById(R.id.btnSalirG);
        btnsalirg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_G.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}