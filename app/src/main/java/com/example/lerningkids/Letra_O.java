package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_O extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_o);

        ImageButton btnsonidoo= findViewById(R.id.btnSonidoO);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.o);
        btnsonidoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsaliro = findViewById(R.id.btnSalirO);
        btnsaliro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_O.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}