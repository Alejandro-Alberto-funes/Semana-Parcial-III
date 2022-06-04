package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_M extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_m);

        ImageButton btnsonidom= findViewById(R.id.btnSonidoM);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.m);
        btnsonidom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirm = findViewById(R.id.btnSalirM);
        btnsalirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_M.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}