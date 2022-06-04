package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_K extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_k);

        ImageButton btnsonidok= findViewById(R.id.btnSonidoK);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.k);
        btnsonidok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirk = findViewById(R.id.btnSalirK);
        btnsalirk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_K.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}