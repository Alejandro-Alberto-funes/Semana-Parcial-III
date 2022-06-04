package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_H extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_h);

        ImageButton btnsonidoh= findViewById(R.id.btnSonidoH);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.h);
        btnsonidoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirh = findViewById(R.id.btnSalirH);
        btnsalirh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_H.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}