package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_s);

        ImageButton btnsonidos= findViewById(R.id.btnSonidoS);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.s);
        btnsonidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirs = findViewById(R.id.btnSalirS);
        btnsalirs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_S.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}