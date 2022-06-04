package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_E extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_e);

        ImageButton btnsonidoe= findViewById(R.id.btnSonidoE);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.e);
        btnsonidoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalire = findViewById(R.id.btnSalirE);
        btnsalire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_E.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}