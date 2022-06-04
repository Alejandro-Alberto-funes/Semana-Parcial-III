package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_r);

        ImageButton btnsonidor= findViewById(R.id.btnSonidoR);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.r);
        btnsonidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsalirr = findViewById(R.id.btnSalirR);
        btnsalirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_R.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}