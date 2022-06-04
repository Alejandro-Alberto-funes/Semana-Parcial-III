package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_F extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_f);

        ImageButton btnsonidof= findViewById(R.id.btnSonidoF);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.f);
        btnsonidof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirf = findViewById(R.id.btnSalirF);
        btnsalirf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_F.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}