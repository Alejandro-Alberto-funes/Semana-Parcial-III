package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_c);

        ImageButton btnsonidoc= findViewById(R.id.btnSonidoC);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.c);
        btnsonidoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirc = findViewById(R.id.btnSalirC);
        btnsalirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_C.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}