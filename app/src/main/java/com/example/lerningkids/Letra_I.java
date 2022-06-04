package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Letra_I extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_i);

        ImageButton btnsonidoi= findViewById(R.id.btnSonidoI);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.i);
        btnsonidoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mp.start(); }
        });

        Button btnsaliri = findViewById(R.id.btnSalirI);
        btnsaliri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salir= new Intent(Letra_I.this,Avanzado.class);
                startActivity(salir);
            }
        });

    }
}